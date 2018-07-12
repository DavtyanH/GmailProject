package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.PageObject;

public class GmailSingInPage extends PageObject {
	public GmailSingInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @FindBy(xpath="//input[@type=\"email\"]")
	 WebElement email;
	 
	 public static final String nextpath="//div[@id='identifierNext']";
	 @FindBy(xpath= nextpath)
	 WebElement next;	
	 
	 
	public GmailPasswordPage login() { 
				email.sendKeys("qa.test.page7@gmail.com");		
		next.click();
		
	return new GmailPasswordPage(driver);
	}
	   
}
