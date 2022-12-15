package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.Report.PDFReportTest;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;
import com.mohs10.reuse.Tabl;

	public class HomeTest extends StartBrowser{
	
	
		
		//Clicking on Categories links 
		@Test(priority = 5)
		public void CategoriesTest() throws Exception {
			 SSreuseclass.SSReusablemethod(driver, "Categories");
			CommonFuns cat = new CommonFuns();
		    cat.Categories();
			Thread.sleep(5000);
		}
		
		//Clicking on news link 
		@Test(priority = 4)
		public void NewsbtnTestCase() throws Exception {
			CommonFuns News = new CommonFuns();
		    News.Pagedown();
		    Thread.sleep(2000);
		    News.Newsbtn();
		    SSreuseclass.SSReusablemethod(driver, "News ");
			Thread.sleep(5000);
		}
		//blog Link 
		@Test(priority = 3)
		public void BlogbtnTestCase() throws Exception {
			CommonFuns blog = new CommonFuns();
		    blog.Pagedown();
		    Thread.sleep(2000);
		    blog.Blogbtn();
		    SSreuseclass.SSReusablemethod(driver, "Blog ");
			Thread.sleep(5000);
		}
			
//		//Registration of new user 
//		@Test(priority = 0)
//		public void RegisterPageTestCase() throws Exception {
//			CommonFuns hm = new CommonFuns();
//			SSreuseclass.SSReusablemethod(driver, "Registeration screen");
//				  hm.Register("GKD", "GKDMohs10", "GKD1239@gmail.com", "Test@444", "Test@444");
//				 
//				  Thread.sleep(5000);
//			  }
		
		//Testing with invalid inputs 
//		@Test(priority = 2)
//		public void InvalidLogInTestCase() throws Exception {
//		 SSreuseclass.SSReusablemethod(driver, "InvalidLogin");
//			CommonFuns hm1 = new CommonFuns();
//				  hm1.invalidLogIn("Invalidlogininputs@gmail.com", "Test@1114");
//				  Thread.sleep(5000);
//		
//	}

			//Testing with Valid inputs 
			@Test(priority = 1)
			  public void LoginPageTestCase() throws Exception {
				CommonFuns hm2 = new CommonFuns();
				  hm2.logIn("anishapatel44@gmail.com", "anishapatel123");
				  SSreuseclass.SSReusablemethod(driver, "Login");
				  Thread.sleep(5000);
			  }
		
		}