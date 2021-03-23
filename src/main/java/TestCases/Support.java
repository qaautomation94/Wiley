
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Support extends HelpingFunction  {

				public static  void onlineSecuritySupport() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click Online Security button",GetData.OnlineSecurity);
					
				}
				
				public static  void relationshipAdviceSupport() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click Relationship Advice button",GetData.RelationshipAdvice);
					
				}
				
				public static  void helpPagesSupport() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click Help Pages button",GetData.HelpPages);
				}
				
				public static  void testimonialsSupport() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click Testimonials button",GetData.Testimonials);
					
				}
				
				public static  void aboutUsSupport() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click About us button",GetData.Aboutus);
					
				}
				
				public static  void contactUsSupport() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement support = GetData.Support;
					action.moveToElement(support).build().perform();

					Click("Please click Contact us button",GetData.Contactus);
					
					Input("Please Enter Testing Comment", GetData.Comment, TestData.COMMENT);
					Click("Please click Submit Information button",GetData.SubmitInformation);
					
				}
			
}

