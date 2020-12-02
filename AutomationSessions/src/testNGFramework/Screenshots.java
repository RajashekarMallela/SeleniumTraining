package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {
	WebDriver driver;

	@Test
	public void a_pagelogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// System.setProperty is for driver preference and driver location
		driver = new ChromeDriver();
		// The above statement starts/open the browser
		driver.get("http://zero.webappsecurity.com/");
		// get method is for opening the website/URL.
		driver.findElement(By.id("signin_button")).click();
	}

	@Test
	public void b_rgistration() {
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();

	}

	@Test
	public void c_logout() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//div[@id='settingsBox']/descendant::i[2]")).click();
		driver.findElement(By.id("logout_link")).click();
		Thread.sleep(2000);
		getscreenshot();
	}

	private void getscreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File("E:\\Selenium\\Screenshots\\Screenshot" + System.currentTimeMillis() + ".png"));

	}

}
