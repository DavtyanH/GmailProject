package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import forWork.ForWorkPage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;

public class ForWorkTest extends FunctionalTestBase {
	
	@Test
	public void thirdTest() throws InterruptedException{
		System.out.println("fourth test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		googlehomepage.pageClick();
	String findelement1="Gmail";
    String findelement2="CREATE AN ACCOUNT";
    Assert.assertEquals(findelement1, "Gmail");
    Assert.assertEquals(findelement2, "CREATE AN ACCOUNT");
    googlehomepage.newPage();
    ForWorkPage workPage = new ForWorkPage(driver);
    workPage.dotButton();
    	}

}
