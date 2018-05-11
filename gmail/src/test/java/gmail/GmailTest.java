package gmail;


import org.testng.annotations.Test;

import org.testng.Assert;

import pages.AccountPage;
import pages.GmailHomePage;
import pages.GmailPasswordPage;
import pages.GmailSingInPage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;



public class GmailTest extends FunctionalTestBase {
	
	@Test
	public void firstTest() throws InterruptedException{
		System.out.println("first test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		googlehomepage.homePageClick();
	String findelement1="Gmail";
    String findelement2="SIGN IN";
    Assert.assertEquals(findelement1, "Gmail");
    Assert.assertEquals(findelement2, "SIGN IN");
    GmailHomePage gmailhomepage = new GmailHomePage(driver);
    gmailhomepage.loginPage();
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
	


