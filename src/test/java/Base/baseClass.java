package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Util.utilClass;

	public class baseClass extends utilClass {

		

		@BeforeMethod
		public void start() throws Exception {
			launchBrowser(readProperty("browser"));
			getApplication(readProperty("url"));
		}
		
		@DataProvider
		public Object[][] JiffyExcelData() throws Exception{
			Object[][] data = dataReader(sheetName);
			return data;
		}
		
		@AfterMethod
		public void close() throws Exception {
			driver.quit();
		}

	}

