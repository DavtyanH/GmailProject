package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class GmailHomePage extends PageObject {

	public GmailHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//a[@data-g-label=\"Sign in\"]")
	 WebElement email;
	 public GmailSingInPage loginPage() { 
			email.click();
			return  new GmailSingInPage(driver);
		}
	
}

