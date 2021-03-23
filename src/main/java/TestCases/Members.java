
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.model.Log;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Members extends HelpingFunction  {

				public static  void onlineMembers() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Online button",GetData.Online);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.WhoisOnline.isDisplayed());

					
				}
				
				public static  void recentMembers() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Recent button",GetData.Recent);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)");
					
					Assert.assertTrue(GetData.RecentMembers.isDisplayed());
					
					Click("Please click Recent button",GetData.AddFavourite);
					
				}
				
				public static  void verifiedMembers() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Verified button",GetData.Verified);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)");
					
					Assert.assertTrue(GetData.VerifiedMembers.isDisplayed());
					Click("Please click Send Mail button",GetData.SendMail);
					
					js.executeScript("window.scrollBy(0,700)");
					Input("Please Enter Content", GetData.Content, TestData.CONTENT);
					Click("Please click Send Message button",GetData.SendMessage);
					
					Assert.assertTrue(GetData.SentMessageTitle.isDisplayed());

				}
				
				public static  void newestMembers() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Newest button",GetData.Newest);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.NewMembers.isDisplayed());
				}
				
				public static  void featuredMembers() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Featured button",GetData.Featured);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.FeaturedMembers.isDisplayed());
				}
				
				public static  void recommendedMembers() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Featured button",GetData.Recommended);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.RecommendedMembers.isDisplayed());
				}
}

