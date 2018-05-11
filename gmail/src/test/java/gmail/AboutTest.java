package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import aboutPages.AppsOnGoogle;
import pages.AccountPage;
import pages.GmailPasswordPage;
import pages.GmailSingInPage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;

public class AboutTest extends FunctionalTestBase {
	
	@Test
	public void secondTest() throws InterruptedException{
		System.out.println("second test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		googlehomepage.apss();
		String findelement1="Gmail";
	  String findelement2="SIGN IN";
	Assert.assertEquals(findelement1, "Gmail");
	Assert.assertEquals(findelement2, "SIGN IN");
		AppsOnGoogle appsgoogle =new AppsOnGoogle(driver);
		appsgoogle.myApss();
		String findelement3="Google";
		String findelement4="Sign in";
		Assert.assertEquals(findelement3, "Google");
		Assert.assertEquals(findelement4, "Sign in");
    GmailSingInPage singInPage =new GmailSingInPage(driver);
    singInPage.login();
    String findelement5="Google";
    String findelement6="Welcome";
    Assert.assertEquals(findelement5, "Google");
    Assert.assertEquals(findelement6, "Welcome");
    GmailPasswordPage pass =new GmailPasswordPage(driver);
    pass.password();
    
    AccountPage accountPage =new AccountPage(driver);
    accountPage.out();
    Thread.sleep(3000);
    }
	}
	 