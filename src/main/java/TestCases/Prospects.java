
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class Prospects extends HelpingFunction  {

				public static  void myMatchProspects() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prospects = GetData.Prospects;
					action.moveToElement(prospects).build().perform();

					Click("Please click My Matches button",GetData.MyMatches);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.MyMatchesTitle.isDisplayed());

					
				}
				
				public static  void myFavouritesProspects() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click My Favourites button",GetData.MyFavourites);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.MyFavouritesTitle.isDisplayed());
				}
				
				public static  void favoursMeProspects() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Favours Me button",GetData.FavoursMe);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.FavoursMeTitle.isDisplayed());
				}
				
				public static  void myViewedProspects() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Favours Me button",GetData.MyViewed);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.MyViewedTitle.isDisplayed());
				}
				
				public static  void viewedMeProspects() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Favours Me button",GetData.ViewedMe);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.ViewedMeTitle.isDisplayed());
				}
				
				public static  void blockedProspects() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement members = GetData.Members;
					action.moveToElement(members).build().perform();

					Click("Please click Favours Me button",GetData.MyBlocked);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.BlockedProfiles.isDisplayed());
				}
			
}

