package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	WebDriver driver;

	@Test
	public void a_pagelogin() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty is for driver preference and driver location
		driver=new ChromeDriver();
		//The above statement starts/open the browser 
		driver.get("http://zero.webappsecurity.com/");
		//get method is for opening the website/URL.
		
	}
	@Test
	public void b_assertequals() {
		String gett = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println(gett);
		Assert.assertEquals(gett, "online BANKING");
		System.out.println("Assertequals Pass");
	}
	@Test
	public void c_assertnotequals() {
		String gett = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertNotEquals(gett, "online banking");
		System.out.println("Assertnotequals Pass");
	}
	
	@Test
	public void d_asserttrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("Asserttrue Pass");
	}
	@Test
	public void e_assertfalse() {
		String gett = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertFalse("online banking".equals(gett));
		System.out.println("Assertfalse pass");
		
	}
	@Test
	public void f_assertnotnull() {
		Object obj = driver.getTitle();
		Assert.assertNotNull(obj);
		System.out.println("Assertnotnull pass");
	}
	@Test
	public void g_assertnull() {
		Object obyn = null;
		Assert.assertNull(obyn);
		System.out.println("Assertnull pass");
	}
}
