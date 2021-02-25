package Practice.test;

import java.lang.invoke.SwitchPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome exe\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

		// Select select1 = new Select(driver.findElement(country));
		// select1.selectByIndex(4);

		// Doselectbyvisibletext(country, "India");
		// DoselectByindex(country,5);
		commonmeth(country,DropDpwn.Index.toString(),"5");
	}

	public static void commonmeth(By locator, String type,String value) 
	{
	Select select =new Select (getlocator(locator));
	
switch(type) {
case "value":
	select.selectByValue(value);
	break;
case "index":
	select.selectByIndex(Integer.parseInt(value));
	break;
case "valuetext":
	select.selectByValue(value);
	break;
	default:
		System.out.println("");
		break;
}
	}

	public static WebElement getlocator(By locator) {
		return driver.findElement(locator);
	}

	public static void Doselectbyvalue(By locator, String value) {
		Select select = new Select(getlocator(locator));
		select.selectByValue(value);
	}

	public static void DoselectByindex(By locator, int index) {
		Select select = new Select(getlocator(locator));
		select.selectByIndex(index);
	}

	public static void Doselectbyvisibletext(By locator, String value) {
		Select select = new Select(getlocator(locator));
		select.deselectByVisibleText(value);

	}

}
