package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty is for driver preference and driver location
		WebDriver driver=new ChromeDriver();
		//The above statement starts/open the browser 
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.cssSelector("#signin_button")).click();
		//ID for this
		driver.findElement(By.cssSelector(".signin btn btn-info")).click();
		//Class or this  css selector is time save.
	}

}
