package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexperiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin_button")).click();
		//System.out.println(driver.getTitle());
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		String text = driver.findElement(By.xpath("//h3[contains(text(),'ZeroBank')]")).getText();
		System.out.println(text);
		String tagname = driver.findElement(By.xpath("//h3[contains(text(),'ZeroBank')]")).getTagName();
		System.out.println(tagname);
		String size = driver.findElement(By.xpath("//h3[contains(text(),'ZeroBank')]")).getCssValue("font-size");
		System.out.println(size);
		String signinattri = driver.findElement(By.name("submit")).getAttribute("class");
		System.out.println(signinattri);
		
	}

}
