package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]")).click();
		ArrayList<String> Gmailtabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Gmailtabs.get(1));
		driver.findElement(By.id("firstName")).sendKeys("raha");
	}

}
