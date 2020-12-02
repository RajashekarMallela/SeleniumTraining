package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommands {
	
	WebDriver driver;
	@Test
	public void a_urllaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}
	@Test
	public void b_radiobutton() {
		WebElement radio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		radio.click();
		System.out.println("Is round trip radiobutton selected?"+radio.isEnabled());
	}
	@Test
	public void c_checkbox() {
		WebElement checkbo = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		checkbo.click();
		System.out.println("Is Student Checkbox selected?"+checkbo.isSelected());
	}
	@Test
	public void d_txt() {
		Boolean textver = driver.findElement(By.xpath("(//a[contains(text(),'Login / Signup')])[1]")).isDisplayed();
		System.out.println("Is Login Text Displayed?"+textver);
	}
}
