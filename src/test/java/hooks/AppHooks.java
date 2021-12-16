package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.BaseClass;
import util.InvokeBrowser;

public class AppHooks  extends BaseClass{
	
	
	@Before
	public void openBrowser() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		driver =obj_InvokeBrowser.invokeBrowser();
	}
	

@After(order=2)
	public void closeBrowser() {
		driver.close();
		
	}

@After(order = 0)
	public void closeAllTabs() {
		
		driver.quit();


	}
}


