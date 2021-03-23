
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class Logout extends HelpingFunction  {

				public static  void logout() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					Click("Please click Logout button",GetData.Logout);
					Thread.sleep(10000);
				//	Assert.assertTrue(GetData.Publishers.isDisplayed());

					
				}
				
}

