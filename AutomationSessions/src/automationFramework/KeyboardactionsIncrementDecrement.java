package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionsIncrementDecrement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input")).sendKeys("5");
		Actions act = new Actions(driver);
		for(int i=1; i<=5; i++) {
			act.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);
		}
		for(int i=1; i<=5; i++) {
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		}
		
	}

}
