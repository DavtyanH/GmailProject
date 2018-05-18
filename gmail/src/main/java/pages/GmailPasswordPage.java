package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class GmailPasswordPage extends PageObject {

	public GmailPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath="//input[@type='password']")
	 WebElement pass;
	 @FindBy(xpath="//div[@id='passwordNext']")
	 WebElement next;
	 //GmailSingInPage wait =new GmailSingInPage(driver);
	public AccountPage password() throws InterruptedException{
		pass.click();
		pass.sendKeys("test.page777");
		next.click();
		//wait.wait_time(20);
		Thread.sleep(5000);
		return new AccountPage(driver);
	}
}
