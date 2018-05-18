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
@FindBy(xpath="//div[@class='dot boost loaded']")
WebElement dot;
public void dotButton()throws InterruptedException {
	dot.click();
	dot.click();
	Thread.sleep(3000);
}

}
