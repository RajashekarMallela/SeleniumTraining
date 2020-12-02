package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXcaretdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demostore.x-cart.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ttle = driver.getTitle();
		System.out.println(ttle);
		int URLcount = driver.findElements(By.tagName("a")).size();
		System.out.println(URLcount);
		System.out.println(driver.findElements(By.tagName("img")).size());
		driver.findElement(By.linkText("Shipping")).click();
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
		String title = driver.getTitle();
		System.out.println(title);
		String cona = driver.findElement(By.xpath("//p[contains(text(),'Here')]")).getText();
        System.out.println(cona);
	}

}
