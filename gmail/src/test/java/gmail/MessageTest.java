	package gmail;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import pages.AccountPage;
	import pages.GmailHomePage;
	import pages.GmailPasswordPage;
	import pages.GmailSingInPage;
	import pages.GoogleHomePage;
	import pages.MessagePage;
	import util.FunctionalTestBase;

	public class MessageTest  extends FunctionalTestBase {
		@Test
		public void fiveTest() throws InterruptedException{
			System.out.println("five test");
			GoogleHomePage googlehomepage =new GoogleHomePage(driver);
			GmailHomePage gmailhomepage=googlehomepage.pageClick();
		String findelement1="Gmail";
	    String findelement2="SIGN IN";
	    Assert.assertEquals(findelement1, "Gmail");
	    Assert.assertEquals(findelement2, "SIGN IN");
	    GmailSingInPage singInPage = gmailhomepage.loginPage();
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
	    MessagePage message = accountPage.compose();
	    AccountPage signOut= message.creatMassage();
	    signOut.out();
	    Thread.sleep(3000);
	    }
	}

