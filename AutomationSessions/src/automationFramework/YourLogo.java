package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("email_create")).sendKeys("oluhj37890jk@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(5000);
        WebElement Radiobutton  = driver.findElement(By.id("id_gender1"));
        Radiobutton.click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Rajashekar");
        driver.findElement(By.name("customer_lastname")).sendKeys("Mallela");
        driver.findElement(By.id("passwd")).sendKeys("Raj@tyu789");
        Select Date = new Select(driver.findElement(By.id("days")));
        Date.selectByVisibleText("5  ");
        Select Month = new Select(driver.findElement(By.id("months")));
        Month.selectByVisibleText("January ");
        Select Years = new Select(driver.findElement(By.id("years")));
        Years.selectByVisibleText("2020  ");
        WebElement Checkbox = driver.findElement(By.id("newsletter"));
        Checkbox.click();
        driver.findElement(By.id("firstname")).sendKeys("Rajashekar");
        driver.findElement(By.id("lastname")).sendKeys("Mallela");
        driver.findElement(By.id("address1")).sendKeys("Chennai");
        driver.findElement(By.id("city")).sendKeys("ABC");
        Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Alaska");
		driver.findElement(By.id("postcode")).sendKeys("99501");
		driver.findElement(By.id("phone_mobile")).sendKeys("9876877432");
		driver.findElement(By.id("submitAccount")).click();
       
        
	}

}
