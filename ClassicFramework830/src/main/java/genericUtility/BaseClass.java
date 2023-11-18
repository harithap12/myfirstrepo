package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;
import objectRespository.LoginPage;
import objectRespository.RegisterPage;

public class BaseClass<readingDataFromPropertyFile> {
	public static WebDriver driver;
	public JavaScriptUtility js;
	public LoginPage login;
	public RegisterPage reg;
	PropertyUtility ppt=new PropertyUtility();
	
	@BeforeClass
	public void launchingTheBrowser() throws IOException{
		if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    }
		else if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome"))
		{
	    WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
        }else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	    }
	
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get(ppt.readingDataFromPropertyFile("url"));
         }
         @BeforeMethod
	     public void LoadingObject() {
	     js=new JavaScriptUtility();
	     login=new LoginPage(driver);
	     reg=new RegisterPage(driver);
	  
	      }
	      public void closingBrowser() {
		  driver.quit();
		
	}

}
