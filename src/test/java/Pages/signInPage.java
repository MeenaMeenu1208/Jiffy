package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class signInPage extends baseClass{
	@FindBy(name="/html/body/div[2]/section/div/div/div/div/div/div/div[1]/div/form/div/div[1]/div/input")
	WebElement Semail;
	//@FindBy(name="email")
	//WebElement Semail;
	@FindBy(xpath="password")
	WebElement Spassword;
	@FindBy(xpath="//button [@type=\"submit\"]")
	WebElement Ssubmitbtn;


	public signInPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void goToSigninpage(String email, String password ) throws Exception {
		
	//	driver.findElement(By.name("email")).sendKeys("meenam.mine@gmail.com");
	
	//	driver.findElement(By.name("password")).sendKeys("Meenu@123");
		//Thread.sleep(4000);
		clickOn(Semail);
		
		type(Semail, email);
		Thread.sleep(4000);
		type(Spassword, password);
		Thread.sleep(4000);
		clickOn(Ssubmitbtn);
		Thread.sleep(4000);
		
		
	}

}
