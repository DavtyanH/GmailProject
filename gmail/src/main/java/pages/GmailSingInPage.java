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
//public static final String atpath="//div[h1='Welcome']";
//@FindBy(xpath=atpath)
	 WebElement ext;
	 @FindBy(xpath="//input[@type=\"email\"]")
	 WebElement email;
	 public static final String nextpath="//div[@id='identifierNext']";
	 @FindBy(xpath= nextpath)
	 WebElement next;	
	 /*public static void wait_time(int seconds){
	        try {
	            Thread.sleep(seconds*1000);
	            }catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }*/
	public GmailPasswordPage login()throws InterruptedException { 
		email.sendKeys("qa.test.page7@gmail.com");		
		next.click();
//isElementPresent(atpath);		
		//wait_time(10);
		Thread.sleep(3000);
	return new GmailPasswordPage(driver);
	}
	   
}
