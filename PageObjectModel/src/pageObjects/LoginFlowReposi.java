package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFlowReposi {
	WebDriver driver;
	public LoginFlowReposi() {
		this.driver=driver;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="login") WebElement Signinlink;
	@FindBy(how=How.ID,using="email") WebElement EmailAddress;
    @FindBy(how=How.NAME,using="passwd") WebElement Password;
    @FindBy(how=How.ID,using="SubmitLogin") WebElement Submit;
    @FindBy(how=How.XPATH,using="(//a[contains(text(),'Sign out')])[1]") WebElement SignOutLink;
    
    public void Signin() {
    	Signinlink.click();
    	EmailAddress.sendKeys("oluhj37890jk@gmail.com");
    	Password.sendKeys("Raj@tyu789");
    	Submit.click();
    }
    public void SignOut() {
    	SignOutLink.click();
    	
    }

}
