package FaceBookVersion11Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacebookPOMclasses.LoginHomePage;
import FacebookPOMclasses.LoginPage;
import LibrararyFiles.BaseClass;
import LibrararyFiles.UltilityClass;

public class facebookTest extends BaseClass{

	LoginPage login;
	LoginHomePage login2;
	@BeforeClass
	public void openfacebookurl() throws IOException {
		openBrowser();
		login = new LoginPage(driver);
		login2 = new LoginHomePage(driver);
	}
	
	@BeforeMethod
	public void alertforTestcase() {
		Reporter.log("Testcase Execution Start...",true);
	}
	
	@Test(priority = 0)
	public void logintoFacebook() throws IOException {
		//user should able to login face-book using valid credentials  
		login.enterUserName();
		login.enterPassword();
		login.clickOnLoginBtn();
	}
	@Test(priority = 1)
	public void verfiyUserNamefromHomePage() throws EncryptedDocumentException, IOException {
		String actusrname = login2.verifyUserName();
		String expusername = UltilityClass.getexceldatafacebook(1, 0);
		Assert.assertEquals(actusrname, expusername);
		Reporter.log("Expected Username : "+expusername,true);
		Reporter.log("Actual Username : "+actusrname,true);
		
	}
	
	@AfterMethod
	public void alerfortestcase_end() {
		Reporter.log("Method Execution Successfully.....",true);
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
}
