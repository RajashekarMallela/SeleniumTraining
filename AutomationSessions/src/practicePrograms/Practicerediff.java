package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practicerediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
	    driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("welcome");
	    driver.findElement(By.xpath("//td[contains(text(),'Choose a Rediffmail ID')]/following::input[1]")).sendKeys("welcome112h");
	    driver.findElement(By.className("btn_checkavail")).click();
	    driver.findElement(By.xpath("//td[contains(text(),'Password')]")).sendKeys("Juky@1234i");
	    driver.findElement(By.xpath("//td[contains(text(),'Retype password')]/following::input[1]")).sendKeys("Juky@1234i");
	    driver.findElement(By.xpath("//td[contains(text(),'Alternate Email Address')]/following::input[1]")).sendKeys("hari&u5363@gmail.com");
	    WebElement alternate = (driver.findElement(By.className("nomargin")));
	    alternate.click();
	    driver.findElement(By.id("mobno")).sendKeys("875876687");
	    Select dayss = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
	    dayss.selectByVisibleText("xpath=\"1\"");
	    Select months = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
	    months.selectByVisibleText("xpath=\"1\"");
	    Select years = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
	    years.selectByVisibleText("xpath=\"1\"");
	    WebElement radiobutton = (driver.findElement(By.xpath("//td[contains(text(),'Gender')]/following::input[2]")));
	    radiobutton.click();
	    Select country = new Select(driver.findElement(By.xpath("//span[contains(text(),'Country')]/following::select[1]")));
	    country.selectByVisibleText("Australia");
	    
	}

}
