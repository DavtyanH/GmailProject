package accountPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;
import pages.GmailSingInPage;

public class CreateAccount extends PageObject {

	public CreateAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[@class='RveJvd snByac']")
		WebElement signInInstead;
	public GmailSingInPage signIn() {
		signInInstead.click();
		return new GmailSingInPage(driver);
				
	}
}

	