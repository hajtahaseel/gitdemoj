package Practice.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome exe\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement web=driver.findElement(By.cssSelector("#gf-BIG"));
        System.out.println(driver.findElements(By.tagName("a")).size());
        		Set<String>wids=driver.getWindowHandles();
        		Iterator<String>it=wids.iterator();
        		it.next();
        		System.out.println(driver.findElements(By.tagName("frame")).size());
      System.out.println(web.findElements(By.tagName("a")).size());

	}

}
