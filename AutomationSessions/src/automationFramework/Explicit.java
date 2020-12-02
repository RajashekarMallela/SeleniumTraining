package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit {

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
		WebDriverWait wait = new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Downloads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Downloads')]")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
}
