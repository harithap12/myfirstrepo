package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends BaseClass {
	public void enteringDataIntoElement(WebElement element,String data) {
		/**
		 * this method is used to enter the data into textfield
		 */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+data+"'",element);
		
	}
	public void clickingOnElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		
		
	}
	public void scrollingThepage(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy("+x+","+y+")");
		
		
	}

}
