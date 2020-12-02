package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceyourlogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver signout = new ChromeDriver();
		signout.get("http://automationpractice.com/index.php");
		signout.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(50000);
		signout.findElement(By.id("email")).sendKeys("oluhj37890jk@gmail.com");
		signout.findElement(By.id("passwd")).sendKeys("Raj@tyu789");
		signout.findElement(By.id("SubmitLogin")).click();
		signout.findElement(By.className("logout")).click();
	}

}
