package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class HomePage {
	CommonMethods obj_CommonMethods=new CommonMethods();
	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")
	WebElement link_Click_On_SeleniumExamplePage;
	public void clikOnTheLink () {
		obj_CommonMethods.click(link_Click_On_SeleniumExamplePage);		
	}
}
