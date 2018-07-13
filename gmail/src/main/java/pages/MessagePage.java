package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class MessagePage extends PageObject{
	public MessagePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private final String newMassagetxpath="//div[@id=':6r']//div[text()='New Message']";
	@FindBy(xpath=newMassagetxpath)
	WebElement massage;
	@FindBy(xpath="//textarea[@id=':a7']")
	WebElement sendTo;
	@FindBy(xpath="//input[@id=':9p']")
	WebElement subject;
	@FindBy(xpath="//div[@id=':au']")
	WebElement sms;
	@FindBy(xpath="//div[@id=':9f']")
	WebElement send;
		public AccountPage creatMassage() {
	waitForElementPresent(newMassagetxpath);
	sendTo.click();
	sendTo.sendKeys("haykuhi.dav@gmail.com");
	subject.click();
	subject.sendKeys("Test massage");
	sms.click();
	sms.sendKeys("Good Luck");
	send.click();
	return new AccountPage(driver);
}
}