package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeSwagsLab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Actions nexttab = new Actions(driver);
		nexttab.sendKeys(Keys.TAB, "secret_sauce").build().perform();
		nexttab.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("(//button[contains(text(),'ADD')])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'1')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]/following::button[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Test')]/following::button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Sauce')])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Test')]")).getText());
		driver.findElement(By.xpath("(//button[contains(text(),'REMOVE')])[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();
        driver.findElement(By.id("first-name")).sendKeys("Rajashekar");
        driver.findElement(By.id("last-name")).sendKeys("Mallela");
        driver.findElement(By.id("postal-code")).sendKeys("533256");
        driver.findElement(By.xpath("//a[contains(text(),'CANCEL')]/following::input")).click();
        driver.findElement(By.xpath("//a[contains(text(),'FINISH')]")).click();
        System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Your order has')]")).getText());
        driver.close();
	}

}
