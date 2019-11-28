package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC014 {
	
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
		 
		 WebElement catalog=driver.findElement(By.xpath("//*[@id='catalog']/a/i"));
		 WebElement product=driver.findElement(By.xpath("//*[@id='catalog']/ul/li[2]/a"));
		 Actions action =new Actions(driver);
		 action.moveToElement(catalog).moveToElement(product).click().build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='form-product']/div/table/tbody/tr[1]/td[1]/input")).click();
		 driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/button[2]")).click();
		 
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 
	}

}
