package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage {

	//Declaration
	//address of email textfield
	
	@FindBy(id="email")
	private WebElement emailTf;
	
	
	//address of password textfield
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passTf;
	
	//address of login button
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//Initialization
	
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void emailText(String value)
	{
		emailTf.sendKeys(value);
	}
	
	public void passwordText(String value)
	{
		passTf.sendKeys(value);
	}
	
	public void loginBtn()
	{
		loginBtn.click();
	}

	//generate getter and method for practice purpose
	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPassTf() {
		return passTf;
	}

	public void setPassTf(WebElement passTf) {
		this.passTf = passTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
}
