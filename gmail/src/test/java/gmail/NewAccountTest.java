package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import accountPages.CreateAccount;
import pages.AccountPage;
import pages.GmailPasswordPage;
import pages.GmailSingInPage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;

public class NewAccountTest extends FunctionalTestBase {
	
	@Test
	public void thirdTest() throws InterruptedException{
		System.out.println("third test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		googlehomepage.pageClick();
	String findelement1="Gmail";
    String findelement2="CREATE AN ACCOUNT";
    Assert.assertEquals(findelement1, "Gmail");
    Assert.assertEquals(findelement2, "CREATE AN ACCOUNT");
    googlehomepage.newAccountPage();
	CreateAccount createAccount = new CreateAccount(driver);
    createAccount.signIn();
    
    
    
    //GmailHomePage gmailhomepage = new GmailHomePage(driver);
    //gmailhomepage.loginPage();
   // String findelement3="Google";
   // String findelement4="Sign in";
    //Assert.assertEquals(findelement3, "Google");
   // Assert.assertEquals(findelement4, "Sign in");
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
	
