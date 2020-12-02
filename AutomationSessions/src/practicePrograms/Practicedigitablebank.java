package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicedigitablebank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivers = new ChromeDriver();
		drivers.get("http://dbankdemo.com/signup");
		drivers.manage().window().maximize();
		String title = drivers.getTitle();
		System.out.println(title);
		String currurl = drivers.getCurrentUrl();
		System.out.println(currurl);
		String logo = drivers.findElement(By.className("align-content")).getText();
		System.out.println(logo);
		Select drop = new Select(drivers.findElement(By.id("title")));
		drop.selectByVisibleText("Mr.");
		drivers.findElement(By.id("firstName")).sendKeys("Reddy");
		drivers.findElement(By.id("lastName")).sendKeys("mallela");
	    WebElement Radiobutton = drivers.findElement(By.id("gender"));
	    Radiobutton.click();
	    drivers.findElement(By.id("dob")).sendKeys("09/06/2020");
	    drivers.findElement(By.id("ssn")).sendKeys("565-76-6778");
	    drivers.findElement(By.id("emailAddress")).sendKeys("Nov2390190@gmail.com");
	    drivers.findElement(By.id("password")).sendKeys("Shekar@bon23");
	    drivers.findElement(By.id("confirmPassword")).sendKeys("Shekar@bon23");
	    drivers.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	    		}

}
