package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import aboutPages.AppsOnGoogle;
import accountPages.CreateAccount;
import basePage.PageObject;
import forWork.ForWorkPage;

public class GoogleHomePage extends PageObject {

	public GoogleHomePage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 @FindBy(xpath="//a[contains(@href, 'https://mail.google.com/mail')]")
 WebElement element;
 @FindBy(xpath="//img[@src='/gmail/about/images/playstore.png']")
 WebElement googlePlay;
 public  void pageClick() {
	 element.click();
 }
public  GmailSingInPage homePageClick() {
	 element.click();
	 	 return new GmailSingInPage(driver);
}
public AppsOnGoogle apss() {
	element.click();
	googlePlay.click();
	
	return new  AppsOnGoogle(driver);
}
@FindBy(xpath="//a[contains(@class,'hero_home__link__desktop')]")
WebElement account;
public CreateAccount newAccountPage() throws InterruptedException {
	account.click();
	 Thread.sleep(7000);
	return  new CreateAccount(driver);
}
@FindBy(xpath="//a[contains(@class,'nav-link__for-work')]")
WebElement forWork;
public ForWorkPage newPage() {
	forWork.click();
	return  new ForWorkPage(driver);
}
	
}
