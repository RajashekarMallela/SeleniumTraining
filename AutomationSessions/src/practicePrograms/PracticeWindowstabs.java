package practicePrograms;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeWindowstabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Plus')]/following::input")).sendKeys("Mobiles");
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//div[contains(text(),'Realme 6')])[1]")).click();
		ArrayList<String> flipkattabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(flipkattabs.get(1));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Realme 6')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Realme 6')]/following::div[9]")).getText());
		
		
		
		
		
	}

}
