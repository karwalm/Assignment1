package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class TC015 {

	@Test
	public void testcase() throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Assignment\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://uniformm1.upskills.in/admin/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.cssSelector("*[name=username]")).sendKeys("admin");
		 driver.findElement(By.cssSelector("input[name=username]")).clear();
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.xpath(".//input[contains(@id,'input-password')]")).sendKeys("admin@123");
		 driver.findElement(By.cssSelector("button[type=submit]")).click();
		 
		 WebElement stat=driver.findElement(By.xpath("//*[@id='reports']/a"));
		 WebElement sales=driver.findElement(By.xpath("//*[@id='reports']/ul/li[1]/a"));
		 WebElement order=driver.findElement(By.xpath("//*[@id='reports']/ul/li[1]/ul/li[1]/a"));
		//*[@id="reports"]/ul/li[1]/ul/li[1]/a
		 Actions action =new Actions(driver);
		 action.moveToElement(stat).moveToElement(sales).click().build().perform();
		 Thread.sleep(2000);
		 action.moveToElement(order).click().build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.id("input-date-start")).clear();
		 driver.findElement(By.id("input-date-start")).sendKeys("2019-11-02");
		 driver.findElement(By.id("input-date-end")).clear();
		 driver.findElement(By.id("input-date-end")).sendKeys("2019-11-26");
		 
		 Select select=new Select(driver.findElement(By.id("input-group")));
		 select.selectByVisibleText("Years");
		 Thread.sleep(2000);
		 Select select1=new Select(driver.findElement(By.id("input-status")));
		 select1.selectByVisibleText("Complete");
		 
		 driver.findElement(By.xpath("//*[@id='button-filter']")).click();
		 
		 
		 
		 
	}
}
