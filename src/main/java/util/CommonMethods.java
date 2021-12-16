package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
	
public void click(WebElement web) {
	web.click();
}
public void sendKeys(WebElement web,String text) {
	
	web.sendKeys(text);
}
}
