package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		ArrayList <String> Naukariwindows = new ArrayList <String>(driver.getWindowHandles());
		for(String i:Naukariwindows) {
			System.out.println(i);
			}
		driver.switchTo().window(Naukariwindows.get(1));
		driver.close();
		driver.switchTo().window(Naukariwindows.get(2));
		driver.close();
	}

}
