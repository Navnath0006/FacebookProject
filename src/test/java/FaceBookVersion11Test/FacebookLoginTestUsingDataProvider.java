package FaceBookVersion11Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LibrararyFiles.BaseClass;

public class FacebookLoginTestUsingDataProvider extends BaseClass {
	@DataProvider(name="data-set")
	public static Object[][] Dataset(){
		Object[][] obj = {{"invalid Password and valid Username","mngr482972","sgsag"},
						  {"valid Password and invalid username","gargerfg","Eqyvyda"},
						  {"invalid Password and invalid username","gargerfg","aehfhae"}
						};
		return obj;
	}
	@Test(dataProvider = "data-set")
	public void VerifyLoginwithDiffCombination(String type,String username,String password) throws IOException, InterruptedException{
		
		openBrowser();
		System.out.println(type+" "+username+" "+password);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.close();
	}	
}