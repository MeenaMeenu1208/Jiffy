package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.signInPage;

public class signInTestCases extends baseClass {
	
	signInPage si = new signInPage();
	
	 @BeforeTest
	    public void declareSheetName() {
	        sheetName = "SignIn";
	    }

	 @Test(dataProvider = "JiffyExcelData")
	public void signInPageTC_001(String email, String password) throws Exception {
		 Thread.sleep(4000);
		si.goToSigninpage(email, password);
		titleAssertion("Dashboard | Jiffy");
	}
	
	




}
 