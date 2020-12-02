package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement dobleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        Actions doubl = new Actions(driver);
        doubl.doubleClick(dobleclick).build().perform();
        Alert ok = driver.switchTo().alert();
        System.out.println(ok.getText());
        ok.accept();
        
        
	}

}

