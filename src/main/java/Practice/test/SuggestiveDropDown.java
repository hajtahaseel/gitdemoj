package Practice.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestiveDropDown {
//////b[normalize-space()='pgm to get odd number from input']
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chrome exe\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("java");
        List<WebElement>links=driver.findElements(By.xpath("//div[@role='listbox']//li/descendant::div[@class='sbl1 sbl1p']"));
        System.out.println(links.size());
		
	}

}
