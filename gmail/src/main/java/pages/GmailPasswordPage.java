package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class GmailPasswordPage extends PageObject {

	public GmailPasswordPage(WebDriver driver) {
		super(driver);
	}
	private final String passXPath = "//input[@type='password']";
	 @FindBy(xpath=passXPath)
	 WebElement pass;
	 @FindBy(xpath="//div[@id='passwordNext']")
	 WebElement next;
	 
	 //GmailSingInPage wait =new GmailSingInPage(driver);
	public AccountPage password() {
		waitForElementPresent(passXPath);
		pass.click();
		pass.sendKeys("test.page777");
		next.click();
		return new AccountPage(driver);
	}
}
