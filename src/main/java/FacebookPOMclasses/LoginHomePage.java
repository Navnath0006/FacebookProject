package FacebookPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage {

	@FindBy(xpath = "(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[1]")
	private WebElement actusername;
	
	public LoginHomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}	
	
	public String verifyUserName() {
		String actname = actusername.getText();
		return actname;
	}
}
