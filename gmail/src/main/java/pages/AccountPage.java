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
	private final String accountxpath="//a[contains(@title,'Google Account')]";
@FindBy(xpath=accountxpath)
WebElement account;
@FindBy(xpath="//a[@id='gb_71']")
WebElement singOut;

public void out()  {
	waitForElementPresent(accountxpath);
	account.click();
	singOut.click();
	driver.close();
	
}
@FindBy(xpath="//div[text()='COMPOSE']")
WebElement creat;
public MassegePage compose() {
	creat.click();
	return new MassegePage(driver);	
}
}
