package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import accountPages.CreateAccount;
import pages.AccountPage;
import pages.GmailHomePage;
import pages.GmailPasswordPage;
import pages.GmailSingInPage;
import pages.GoogleHomePage;
import util.FunctionalTestBase;

public class NewAccountTest extends FunctionalTestBase {
	
	@Test
	public void thirdTest() throws InterruptedException{
		System.out.println("third test");
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		GmailHomePage gmailhomepage=googlehomepage.pageClick();
	String findelement1="Gmail";
    String findelement2="CREATE AN ACCOUNT";
    Assert.assertEquals(findelement1, "Gmail");
    Assert.assertEquals(findelement2, "CREATE AN ACCOUNT");
	CreateAccount createAccount = gmailhomepage.newAccountPage();
    GmailSingInPage singInPage = createAccount.signIn();
    String findelement3="Google";
    String findelement4="Sign in";
    Assert.assertEquals(findelement3, "Google");
    Assert.assertEquals(findelement4, "Sign in");
    GmailPasswordPage pass = singInPage.login();
    	String findelement5="Google";
    String findelement6="Welcome";
    Assert.assertEquals(findelement5, "Google");
    Assert.assertEquals(findelement6, "Welcome");
    AccountPage accountPage = pass.password();
    accountPage.out();
    Thread.sleep(3000);
    }
	}
	
	
