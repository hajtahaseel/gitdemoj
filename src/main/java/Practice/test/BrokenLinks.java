package Practice.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks 
{
    public static void main( String[] args ) throws MalformedURLException, IOException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome exe\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
     
     List<WebElement> Links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
     SoftAssert s=new SoftAssert();
     for(WebElement Link:Links) 
     {
    String url=Link.getAttribute("href");	 
    HttpURLConnection conn=(HttpURLConnection)(new URL(url).openConnection());
    conn.setRequestMethod("HEAD");
    conn.connect();
   int respcode= conn.getResponseCode();
    System.out.println(respcode);
    s.assertTrue(respcode<400, "the link "+respcode+"is broken for " +Link.getText());
     }
     
      s.assertAll();
    }
}
