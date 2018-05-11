package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import aboutPages.AppsOnGoogle;
import basePage.PageObject;

public class GoogleHomePage extends PageObject {

	public GoogleHomePage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 @FindBy(xpath="//a[contains(@href, 'https://mail.google.com/mail')]")
 WebElement element;
 @FindBy(xpath="//img[@src='/gmail/about/images/playstore.png']")
 WebElement googlePlay;
public  GmailSingInPage homePageClick() {
	 element.click();
	 	 return new GmailSingInPage(driver);
}
public AppsOnGoogle apss() throws InterruptedException{
	element.click();
	googlePlay.click();
	Thread.sleep(5000);
	return new  AppsOnGoogle(driver);
}

	
}
