package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("E:\\Selenium\\Xpath\\Flipkart\\Search bar.PNG");
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		driver.findElement(By.id("submitbutton")).click();
		//autoit software for multiple images
	}

}
