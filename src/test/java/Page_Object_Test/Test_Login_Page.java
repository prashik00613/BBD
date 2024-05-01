package Page_Object_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Login_Page {
	
	WebDriver driver ;
	
	public Test_Login_Page(WebDriver d) {
		driver= d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}
	
}
