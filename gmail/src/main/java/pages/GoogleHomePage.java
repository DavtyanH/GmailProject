package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.PageObject;

public class GoogleHomePage extends PageObject {

	public GoogleHomePage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 @FindBy(xpath="//a[contains(@href, 'https://mail.google.com/mail')]")
 WebElement element;
public  GmailSingInPage homePageClick() {
	 element.click();
	 	 return new GmailSingInPage(driver);
}
	
}
