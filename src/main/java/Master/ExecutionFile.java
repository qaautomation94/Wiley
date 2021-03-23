package Master;
import static TestCases.StartBrowser.StartupBrowser;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import PageFactoryandTestdata.TestData;
import TestCases.*;
import TestCases.Systemroperties;
import TestCases.WhoWeServe;
public class ExecutionFile {
	
	protected static WebDriver driver;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	public static String browser="chrome";
	static String Suite="Wiley.html";
	protected static String email;
	
	protected static String envirnment=TestData.stage;
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{


				
			Systemroperties.Property();
	
		}

	
	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 


		@Test(priority=1)
		public void AccessApp() throws InterruptedException, AWTException, IOException{
		 	Login.AccessApplication();		
	 	}
		/*
		@Test(priority=2)
		public void Verify_Who_We_Serve() throws InterruptedException, AWTException, IOException{
		 	WhoWeServe.WhoWe_Server();		
	 	}
		
		@Test(priority=3)
		public void VerifySuggestionList() throws InterruptedException, AWTException, IOException{
			Search.Suggestions();
	 	}
		
		@Test(priority=4)
		public void VerifySearchResultsContainsJAVA() throws InterruptedException, AWTException, IOException{
			Search.SearchResults();
	 	}
		
		@Test(priority=5)
		public void VerifySearchResultsCount() throws InterruptedException, AWTException, IOException{
			Search.SearchResultsCount();
	 	}
	 	*/
	/*	
		@Test(priority=6)
		public void VerifySearchResultsCount() throws InterruptedException, AWTException, IOException{
			Search.SearchResultsCount();
	 	}
		*/
		
		@Test(priority=9)
		public void Education() throws InterruptedException, AWTException, IOException{
		 	WhoWeServe.Edu();	
	 	}
		
			@AfterMethod
			public void getResult(ITestResult result) throws IOException, InterruptedException{
				 //System.out.println(result.getStatus());
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
	 				extent.flush();

		 			
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){
				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
				 	test.fail(result.getThrowable());
			 		extent.flush();
			 		}
				
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print(result.getStatus());
	 				System.out.print("Test cases is skipped");
					test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					test.skip(result.getThrowable());
					extent.flush();
				    }				 		
	 			
			 }
			 
			@AfterTest
			public void endReport(){
			
			//	driver.get(System.getProperty("user.dir")+"/Reports/CRMReport.html");
			}
			@AfterSuite
			 public void CloseBrowser() throws IOException {
				
			//	driver.quit();
			}
			 
}
