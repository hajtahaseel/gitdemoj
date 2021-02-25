package Practice.test;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chrome exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/contacts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hajtahaseel1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Juna@1234");
		driver.findElement(By.className("ui fluid large blue submit button")).click();
		Thread.sleep(2000);
		// a[normalize-space()='test3 test3']
		// tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)
		
			//	By.xpath("a[contains(text(),'test3 test3')]/parent::td//preceding-sibling::td//input[@name='id']"))
				//.click();
				//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
				//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
				//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
			/*String before ="*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
				String after="]/td[2]/a";
				for(int i=1;i<=3;i++)
				{
			String name=driver.findElement(By.xpath(before+ i+ after )).getText();
			if(name.contains("test2 test2")) {
				////tbody/tr[3]/td[1]/div[1]/label[1]
				driver.findElement(By.xpath("tbody/tr["+i+"]/td[1]/div[1]/label[1]")).click();*/
			}
				}
	


