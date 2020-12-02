package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        WebElement tvsappli = driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
        Actions act = new Actions(driver);
        act.moveToElement(tvsappli).build().perform();
	}

}
