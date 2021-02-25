package Practice.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome exe\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement rb=driver.findElement(By.xpath("//input[@value='radio1']"));
		rb.click();
		WebElement sel=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sb=new Select(sel);
		sb.selectByIndex(2);
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		//driver.quit();
		
	}

}
