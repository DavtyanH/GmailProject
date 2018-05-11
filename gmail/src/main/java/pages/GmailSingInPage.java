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
	 @FindBy(xpath="//div[@id='identifierNext']")
	 WebElement next;	
	 /*public static void wait_time(int seconds){
	        try {
	            Thread.sleep(seconds*1000);
	            }catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }*/
	public GmailPasswordPage login() throws InterruptedException { 
		email.sendKeys("qa.test.page7@gmail.com");
		next.click();
		//wait_time(10);
		Thread.sleep(3000);
	return new GmailPasswordPage(driver);
	}
	   
}
