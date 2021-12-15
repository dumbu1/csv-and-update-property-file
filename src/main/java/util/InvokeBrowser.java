package util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
private static	Properties	 value;
	public void invokeBrowser() {
		
		PropertyReader obj_PropertyReader=new PropertyReader();
	 	 value=obj_PropertyReader.propetyReader();
	 	 
	 	 if(value.getProperty("browser").equalsIgnoreCase("chrome")) {
	 		 ChromeOptions obj_ChromeOptions=new ChromeOptions();
	 		 obj_ChromeOptions.addArguments("Incognito");
	 		 obj_ChromeOptions.addArguments("start-maximized");
	 		 WebDriverManager.chromedriver().setup();
	 		 WebDriver driver=new ChromeDriver();
	 		 driver.get(value.getProperty("url"));
	 		 
	 	 }
	}

}
