package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Implicit {

	WebDriver driver;
	@Test
	public void a_urllaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		}
	@Test
	public void b_implicitwaitt() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Actions ente = new Actions(driver);
		ente.sendKeys(Keys.ENTER).build().perform();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Downloads')]")).click();
	}

}
