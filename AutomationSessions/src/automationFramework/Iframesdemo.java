package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		int iframecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframecount);
	    driver.switchTo().frame("oddcouple");
	    String textme = driver.findElement(By.xpath("//div[contains(text(),'A television')]")).getText();
	    System.out.println(textme);
	}

}
