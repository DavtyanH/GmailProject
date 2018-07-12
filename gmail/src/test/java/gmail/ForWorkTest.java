package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import forWork.ForWorkPage;
import pages.GmailHomePage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;

public class ForWorkTest extends FunctionalTestBase {
	
	@Test
	public void thirdTest() throws InterruptedException{
		System.out.println("fourth test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		GmailHomePage gmailhomepage=googlehomepage.pageClick();
	String findelement1="Gmail";
    String findelement2="FOR WORK";
    Assert.assertEquals(findelement1, "Gmail");
    Assert.assertEquals(findelement2, "FOR WORK");   
    ForWorkPage workPage =  gmailhomepage.newPage();
    workPage.facebook();
    String findelement3="Gmail";
    String findelement4="facebook";
    Assert.assertEquals(findelement3, "Gmail");
    Assert.assertEquals(findelement4, "facebook");   
    driver.close();
    
    	}

}
