package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingconfirmbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		String poptext = confirm.getText();
		System.out.println(poptext);
		confirm.accept();
		//accept method is for Ok button.
		//confirm.dismiss();
		//Dismiss method is for cancel.
	}

}
