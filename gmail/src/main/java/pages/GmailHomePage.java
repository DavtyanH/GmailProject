package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import aboutPages.AppsOnGoogle;
import accountPages.CreateAccount;
import basePage.PageObject;
import forWork.ForWorkPage;

public class GmailHomePage extends PageObject {

	public GmailHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//img[contains(@src,'/gmail/about/images/playstore.png')]")
	 WebElement googlePlay;
	public AppsOnGoogle apss() {
		//element.click();
		googlePlay.click();
				return new  AppsOnGoogle(driver);
	}
	 @FindBy(xpath="//a[@data-g-label=\"Sign in\"]")
	 WebElement email;
	 public GmailSingInPage loginPage() { 
			email.click();
			return  new GmailSingInPage(driver);
		}

@FindBy(xpath="//a[contains(@class,'hero_home__link__desktop')]")
WebElement account;
public CreateAccount newAccountPage(){
	account.click();
	return  new CreateAccount(driver);
}

@FindBy(xpath="//a[contains(@class,'nav-link__for-work')]")
WebElement forWork;
public ForWorkPage newPage() {
	forWork.click();
	return  new ForWorkPage(driver);
}
	
}

