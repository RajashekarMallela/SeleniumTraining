package practicePrograms;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("number1Field")).sendKeys("5");
		driver.findElement(By.id("number2Field")).sendKeys("5");
		Select Add = new Select(driver.findElement(By.id("selectOperationDropdown")));
		Add.selectByVisibleText("Add");
		driver.findElement(By.id("calculateButton")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("number1Field")).sendKeys("7");
		driver.findElement(By.id("number2Field")).sendKeys("7");
		Select sub = new Select(driver.findElement(By.id("selectOperationDropdown")));
		sub.selectByVisibleText("Subtract");
		driver.findElement(By.id("calculateButton")).click();
		System.out.println(
				driver.findElement(By.xpath("//label[contains(text(),'Answer')]/following::input[1]")).getText());
		driver.navigate().refresh();
		driver.findElement(By.id("number1Field")).sendKeys("10");
		driver.findElement(By.id("number2Field")).sendKeys("10");
		Select multi = new Select(driver.findElement(By.id("selectOperationDropdown")));
		multi.selectByVisibleText("Multiply");
		driver.findElement(By.id("calculateButton")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("number1Field")).sendKeys("10");
		driver.findElement(By.id("number2Field")).sendKeys("5");
		Select divi = new Select(driver.findElement(By.id("selectOperationDropdown")));
		divi.selectByVisibleText("Divide");
		driver.findElement(By.id("calculateButton")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("number1Field")).sendKeys("100");
		driver.findElement(By.id("number2Field")).sendKeys("100");
		Select conc = new Select(driver.findElement(By.id("selectOperationDropdown")));
		conc.selectByVisibleText("Concatenate");
		driver.findElement(By.id("calculateButton")).click();
		Thread.sleep(5000);
		String num = driver.findElement(By.id("numberAnswerField")).getText();
		System.out.println(num);
		driver.close();
	}

}
