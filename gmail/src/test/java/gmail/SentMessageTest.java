package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.GmailHomePage;
import pages.GmailPasswordPage;
import pages.GmailSingInPage;
import pages.GoogleHomePage;
import pages.SentMessage;
import util.FunctionalTestBase;

public class SentMessageTest extends FunctionalTestBase {
	@Test
	public void Test() throws InterruptedException{
		GoogleHomePage googlehomepage =new GoogleHomePage(driver);
		GmailHomePage gmailhomepage=googlehomepage.pageClick();
	    GmailSingInPage singInPage = gmailhomepage.loginPage();
    GmailPasswordPage pass = singInPage.login();
    AccountPage accountPage = pass.password();
    SentMessage sentMessage= accountPage.sentSms();
    String findelement="in:sent ";
    Assert.assertEquals(findelement, "in:sent ");
    sentMessage.closePage();
    Thread.sleep(3000);
    }}
