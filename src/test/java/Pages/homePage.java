package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseClass;

public class homePage extends baseClass{
	
	@FindBy(xpath="//img [@alt=\"logo\"]")
	WebElement HPlogo;
	@FindBy(xpath="//span [text()=\"Dashboard\"]")
	WebElement HPDashboard;
	@FindBy(xpath="//span [text()=\"Task\"]")
	WebElement HPTask;
	@FindBy(xpath="//span [text()=\"Apply Leave\"]")
	WebElement HPapplyleave;

	@FindBy(xpath="//span [text()=\"Timesheet\"]")
	WebElement HPTimesheet;
	@FindBy(xpath="//span [text()=\"Chat\"]")
	WebElement HPChat;
	@FindBy(xpath="//span [text()=\"Community\"]")
	WebElement HPCommunity;
	@FindBy(className="fab fa-microsoft")
	WebElement HPFb;
	@FindBy(className="fab fa-twitter")
	WebElement HPtwitter;
	@FindBy(className="fab fa-instagram")
	WebElement HPInsta;
	@FindBy(className="fab fa-youtube")
	WebElement HPUtube;
	@FindBy(className="fab fa-whatsapp")
	WebElement HPWhatsapp;
	@FindBy(xpath="//p [text()=\"Company Policies\"]")
	WebElement HPcompanypolicy;
	@FindBy(id="notificationCount")
	WebElement HPnotificationCount;
	@FindBy(id="messageCount")
	WebElement HPmessageCount;
	@FindBy(xpath="//img [@alt=\"user\"]")
	WebElement HPuser;
	

	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void gotoContactUsPage(String cname, String cemail, String cphoneNo, String cmessage ) {
		//clickOn(CName);
		//type(CName, cname);
		type(Cemail, cemail);
		type(CphoneNo, cphoneNo);
		type(Cmessage, cmessage);
		clickOn(Csignupbtn);
		
		
	}

}
