package accountPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class CreateAccount extends PageObject {

	public CreateAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[@class='RveJvd snByac']")
		WebElement signInInstead;
	public void signIn() throws InterruptedException {
		signInInstead.click();
		 Thread.sleep(7000);
		
	}
}

	