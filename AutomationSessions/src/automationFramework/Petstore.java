package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Petstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.name("username")).sendKeys("Shekarkumar");
		driver.findElement(By.name("password")).sendKeys("YUIO@567");
		driver.findElement(By.name("repeatedPassword")).sendKeys("YUIO@567");
		driver.findElement(By.name("account.firstName")).sendKeys("Mallela");
		driver.findElement(By.name("account.lastName")).sendKeys("Mredyu");
		driver.findElement(By.name("account.email")).sendKeys("Oct32545tue@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("63764388498");
		driver.findElement(By.name("account.address1")).sendKeys("rambnahh");
		driver.findElement(By.name("account.address2")).sendKeys("jubliihills");
		driver.findElement(By.name("account.city")).sendKeys("hyderbad");
		driver.findElement(By.name("account.state")).sendKeys("Andhrapradesh");
		driver.findElement(By.xpath("//td[contains(text(),'Zip:')]/following::input[1]")).sendKeys("35635");
		driver.findElement(By.name("account.country")).sendKeys("India");
		Select language = new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select food = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		food.selectByVisibleText("BIRDS");
		WebElement mylist = driver.findElement(By.name("account.listOption"));
		mylist.click();
		WebElement mybanner = driver.findElement(By.name("account.bannerOption"));
		mybanner.click();
		driver.findElement(By.name("newAccount")).click();
		
		
		

	}

}
