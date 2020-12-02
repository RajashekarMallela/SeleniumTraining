package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicepetstore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shekarkumar");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("YUIO@567");
		driver.findElement(By.name("signon")).click();
		//Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Out")).click();

	}

}
