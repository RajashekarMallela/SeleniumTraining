package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Zerowebapp {
	
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty is for driver preference and driver location
		WebDriver driver=new ChromeDriver();
		//The above statement starts/open the browser 
		driver.get("http://zero.webappsecurity.com/");
		//get method is for opening the website/URL.
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.id(""))
		//ArrayList <String> Naukariwindows = new ArrayList <String>
		
	}

}
