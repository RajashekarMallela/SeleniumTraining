package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpromptbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Alert promp = driver.switchTo().alert();
		String prom = promp.getText();
		System.out.println(prom);
		Thread.sleep(2000);
		promp.sendKeys("Rajashekar");
		promp.accept();

	}

}
