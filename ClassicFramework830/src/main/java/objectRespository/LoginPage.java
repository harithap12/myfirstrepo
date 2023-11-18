package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	
	@FindBy(id="Email")
	private WebElement emailTF;

	
	@FindBy(id="Password")
	public WebElement passTF;

	
	@FindBy(id="RememberMe")
	private WebElement remeberTF;

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement button;

	public WebElement getloginLink() {
		return loginLink;
	}

	public WebElement getemailTF() {
		return emailTF;
	}

	public WebElement getpassTF() {
		return passTF;
	}

	public WebElement getremeberTF() {
		return remeberTF;
	}

	public WebElement getbutton() {
		return button;
	}


}
