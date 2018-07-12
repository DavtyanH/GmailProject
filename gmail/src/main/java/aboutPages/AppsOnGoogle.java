package aboutPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;
import pages.GmailSingInPage;

public class AppsOnGoogle extends PageObject{

	public AppsOnGoogle(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[contains(@href,'https://play.google.com/store/apps')]//span[text()='Apps']")
	 WebElement apps;
	public GmailSingInPage myApss() {
		apps.click();
		return new GmailSingInPage(driver);
		
	}
}
