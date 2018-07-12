package forWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class ForWorkPage extends PageObject{

	public ForWorkPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@href='https://www.facebook.com/Gmail']")
WebElement fb;
public void facebook() {
	fb.click();
}

}
