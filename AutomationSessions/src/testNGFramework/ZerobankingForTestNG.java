package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZerobankingForTestNG {
	
	WebDriver driver;

	@Test(priority=1)
	public void pagelogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty is for driver preference and driver location
		driver=new ChromeDriver();
		//The above statement starts/open the browser 
		driver.get("http://zero.webappsecurity.com/");
		//get method is for opening the website/URL.
		driver.findElement(By.id("signin_button")).click();
	}
		
		@Test(priority=2)
		public void rgistration() {
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	
		}
		
		@Test(priority=3)
		public void logout() {
			driver.findElement(By.xpath("//div[@id='settingsBox']/descendant::i[2]")).click();
			driver.findElement(By.id("logout_link")).click();
		}
}


