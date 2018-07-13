package pages;

import org.openqa.selenium.WebDriver;

import basePage.PageObject;

public class SentMessage extends PageObject{

	public SentMessage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void closePage() {
	driver.close();
}
}
