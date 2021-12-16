package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumPage;
import util.BaseClass;

public class StepDefinations extends BaseClass {



	@Given("user is in {string} page")
	public void user_is_in_page(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
		HomePage obj_HomePage=new HomePage(driver);
		obj_HomePage.clikOnTheLink();
	}

	@Then("system should open {string} page")
	public void system_should_open_page(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
	}


	@When("user enters {string} on {string}")
	public void user_enters_on(String text, String string2) {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(driver);
		obj_SeleniumPage.enterText(text);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
