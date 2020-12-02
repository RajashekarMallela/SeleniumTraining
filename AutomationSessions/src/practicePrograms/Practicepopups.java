package practicePrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicepopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert aler = driver.switchTo().alert();
		String alerts = aler.getText();
		System.out.println(alerts);
		aler.accept();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[2]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
        Alert confir = driver.switchTo().alert();
        String exam = confir.getText();
        System.out.println(exam);
        confir.dismiss();
        String cancelmessa = driver.findElement(By.id("demo")).getText();
        System.out.println(cancelmessa);
        //Thread.sleep("3000");
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]")).click();
        Alert propmtbox = driver.switchTo().alert();
        String enter = propmtbox.getText();
        System.out.println(enter);
        propmtbox.sendKeys("Reddy");
        propmtbox.accept();
	}

}
