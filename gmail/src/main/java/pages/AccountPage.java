package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class AccountPage extends PageObject{

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[contains(@title,'Google Account')]")
WebElement account;
@FindBy(xpath="//a[@id='gb_71']")
WebElement singOut;
//GmailSingInPage wait =new GmailSingInPage(driver);
public void out() throws InterruptedException {
	account.click();
	singOut.click();
	driver.close();
	//wait.wait_time(20);
	Thread.sleep(3000);
	
}
}
