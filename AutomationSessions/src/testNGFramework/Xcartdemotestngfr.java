package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Xcartdemotestngfr {
	WebDriver driver;
	
	@Test
	public void a_urllaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demostore.x-cart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	@Test
	public void b_Hoveronbestseller() throws InterruptedException {
		WebElement hotdeal = driver.findElement(By.xpath("(//span[contains(text(),'Home')])/following::span[1]"));
		Actions MOVEM = new Actions(driver);
		MOVEM.moveToElement(hotdeal).build().perform();	
		driver.findElement(By.xpath("//span[contains(text(),'Bestsellers')]")).click();
	}
	@Test
	public void c_productselecion() throws InterruptedException {
		WebElement prod = driver.findElement(By.xpath("//span[contains(text(),'Sort by:')]/following::img[3]"));
		Actions curs = new Actions(driver);
		curs.moveToElement(prod).build().perform();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("span[contains(text(),'$9.99')]/following::span[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[contains(text(),'Waist')]/following::span[10]")).click();
	}
	@Test
	public void d_registration() {
		driver.findElement(By.id("email")).sendKeys("makker2345@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		driver.findElement(By.id("shippingaddress-firstname")).sendKeys("Mallela");
		driver.findElement(By.id("shippingaddress-lastname")).sendKeys("RajReddy");
		driver.findElement(By.id("shippingaddress-street")).sendKeys("nellore");
		driver.findElement(By.id("shippingaddress-city")).clear();
		driver.findElement(By.id("shippingaddress-city")).sendKeys("Chechireddy");
		Select count = new Select(driver.findElement(By.id("shippingaddress-country-code")));
		count.selectByVisibleText("Australia");
        Select stat = new Select(driver.findElement(By.id("shippingaddress-state-id")));
        stat.selectByVisibleText("South Australia");
        driver.findElement(By.id("shippingaddress-zipcode")).sendKeys("78688878");
        driver.findElement(By.id("shippingaddress-phone")).sendKeys("78687677889");
        driver.findElement(By.xpath("//button[contains(text(),'Choose shipping')]")).click();
        driver.findElement(By.id("method2")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to payment')]")).click();
        
	}

}
