package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement Right = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        Actions act = new Actions(driver);
        act.contextClick(Right).build().perform();
        driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
        Alert ok = driver.switchTo().alert();
        System.out.println(ok.getText());
        ok.accept();
        
	}

}
