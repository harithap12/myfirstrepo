package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Register")
	private WebElement RegisterPage1;
	
	public WebElement getRegisterPage1() {
	return RegisterPage1;
	}
	
	@FindBy(id="gender-female")
	private WebElement femaleTB;
	
	public WebElement getfemaleTB() {
	return femaleTB;
	}
	
	
	@FindBy(id="FirstName")
	private WebElement firstnameTB;
	
	public WebElement getFirstnameTB() {
	return firstnameTB;
	}
	
	
	
	
	@FindBy(id="LastName")
	private WebElement LastNameTB;
	
	public WebElement getLastNameTB() {
	return LastNameTB;
	}
	
	@FindBy(id="Email")
	private WebElement emailTB;
	
	public WebElement getEmailTB() {
		return emailTB;
	}

	@FindBy(id="Password")
	private WebElement passwordTB;
	
	public WebElement getPasswordTB() {
		return passwordTB;
	}

	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmpasswordTB;
	
	public WebElement getConfirmPasswordTB() {
		return ConfirmpasswordTB;
	}

	
	
	@FindBy(id="register-button")
	private WebElement buttonTB;
	
	public WebElement getbuttonTB() {
	return buttonTB;
	}
		
		
		
	}




	