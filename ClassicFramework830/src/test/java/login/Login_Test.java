package login;

import org.testng.annotations.Test;


import genericUtility.BaseClass;
import objectRespository.LoginPage;


public class Login_Test extends BaseClass {
	@Test
	public void LoginToDemoWebShop() {
		//LoginPage login=new LoginPage(driver);
	    login.getloginLink().click();
	    login.getemailTF().sendKeys("selenium@gmail.com");
	    login.getpassTF().sendKeys("**HGCHG**");
	    login.getremeberTF().click();
	    login.getbutton().click();
	   
				
			

}
}
