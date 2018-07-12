package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject{
	public WebDriver driver;
	public PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
public boolean isElementPresent(final String elementxPath) {
		
		return (new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.findElement(By.xpath(elementxPath)) != null;
	            }
	        });
}
	

public void waitForElementPresent(final String elementXPath) {
	WebElement element = (new WebDriverWait(driver, 10))
			   .until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
}
}
