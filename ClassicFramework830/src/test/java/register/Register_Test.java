package register;

import org.testng.annotations.Test;
import genericUtility.BaseClass;
import objectRespository.RegisterPage;

public class Register_Test extends BaseClass {
	@Test
	public void RegisterToDemoWebShop() {
		RegisterPage page=new RegisterPage(driver);
	    page.getRegisterPage1().click();
	    page.getfemaleTB().click();
	    page.getFirstnameTB().sendKeys("gafytfstd");
	    page.getLastNameTB().sendKeys("gafytfstd");
	    page.getEmailTB().sendKeys("selenium@gmail.com");
	    page.getPasswordTB().sendKeys("gshfshfvhsgvfhgs");
	    page.getConfirmPasswordTB().sendKeys("gshfshfvhsgvfhgs");
	    page.getbuttonTB().click();
	   
		

}
	}
	


