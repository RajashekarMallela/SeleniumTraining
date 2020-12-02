package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeAutomationtesttingpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);   
        driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']/preceding::input[1]")).sendKeys("ioplaop");
        //driver.findElement(By.xpath("//h1[contains(text(),'Volunteer Sign Up')]/following::input[1]")).sendKeys("Firstall");
        //driver.findElement(By.name("RESULT_TextField-1")).clear();
        //driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Rajashekar");
         //driver.findElement(By.name("RESULT_TextField-1")).sendKeys("First");
        //driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Reeddy");
        Actions tab = new Actions(driver);
        tab.sendKeys(Keys.TAB,"Mallela").build().perform();
        tab.sendKeys(Keys.TAB,"9999999999").build().perform();
        tab.sendKeys(Keys.TAB,"India").build().perform();
        tab.sendKeys(Keys.TAB,"Ongole").build().perform();
        tab.sendKeys(Keys.TAB,"Nov12mon20202@gmail.com").build().perform();
        WebElement radiobutton = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        radiobutton.click();
        WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Thursday')]"));
        checkbox.click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
        dropdown.selectByVisibleText("Evening");
        WebElement upload = driver.findElement(By.xpath("//input[contains(text(),'RESULT_FileUpload-10')]"));
        upload.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\DSC_0004\\JPG");
        driver.findElement(By.id("FSsubmit")).click();
        
	}

}
