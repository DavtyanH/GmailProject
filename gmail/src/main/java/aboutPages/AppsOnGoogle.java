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
	@FindBy(xpath="//ul//a[contains(@href,'https://play.google.com/apps')]")
	 WebElement apps;
	public GmailSingInPage myApss() throws InterruptedException{
		apps.click();
		Thread.sleep(7000);
		return new GmailSingInPage(driver);
		
	}
}
