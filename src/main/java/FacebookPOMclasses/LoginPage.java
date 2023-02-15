package FacebookPOMclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibrararyFiles.UltilityClass;

public class LoginPage {

	@FindBy(xpath = "//input[@id='email']") 
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='pass']") 
	private WebElement password;
	
	@FindBy(xpath = "//*[@name='login']") 
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName() throws IOException {
		username.sendKeys(UltilityClass.getpropfile("username"));
	}
	public void enterPassword() throws IOException {
		password.sendKeys(UltilityClass.getpropfile("password"));
	}
	public void clickOnLoginBtn() {
		loginbtn.click();
	}
	
	
}
