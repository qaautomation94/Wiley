
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class Interests extends HelpingFunction  {

				public static  void interests() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					Click("Please click Interests button",GetData.Interests);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.InterestsReceived.isDisplayed());
					
				}
				
}

