package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty is for driver preference and driver location
		WebDriver driver=new ChromeDriver();
		//The above statement starts/open the browser 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://zero.webappsecurity.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
