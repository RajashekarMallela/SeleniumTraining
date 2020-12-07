package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginFlowReposi;

public class LoginFlowScript {
	WebDriver driver;
	
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	@Test
	public void b_LoginLogout() {
		LoginFlowReposi repo = PageFactory.initElements(driver, LoginFlowReposi.class);
		repo.Signin();
		repo.SignOut();
		
	}
}
