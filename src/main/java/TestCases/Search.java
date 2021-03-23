
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class Search extends HelpingFunction  {

				public static  void basicSearch() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement search = GetData.Search;
					action.moveToElement(search).build().perform();

					Click("Please click Basic Search button",GetData.BasicSearch);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,900)");
					
					Select ageRange = new Select(GetData.AgeRange);
					ageRange.selectByIndex(7);
					
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
					
					Select status = new Select(GetData.Status);
					status.selectByIndex(2);
					
					Click("Please click on Start Searching button",GetData.StartSearching);
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
					Assert.assertTrue(GetData.SearchResults.isDisplayed());

					
				}
				
				public static  void advanceSearch() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement search = GetData.Search;
					action.moveToElement(search).build().perform();

					Click("Please click Advanced Search button",GetData.AdvancedSearch);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");
					
					Select ageRange = new Select(GetData.AgeRange);
					ageRange.selectByIndex(7);
					
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
					
					Click("Please click on Charming checkbox",GetData.Charming);
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
					JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
					scroll2.executeScript("window.scrollBy(0,500)");
					Click("Please click on Very Fair checkbox",GetData.VeryFair);
					Click("Please click on Kshetri checkbox",GetData.Kshetri);
					
					JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
					scroll3.executeScript("window.scrollBy(0,1900)");
					
					Click("Please click on I don't care checkbox",GetData.IdontCare);
					JavascriptExecutor bottomscroll = (JavascriptExecutor) driver;
					bottomscroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					
					Click("Please click on Profile with Photo button",GetData.ProfilePhotoButton);
					Click("Please click on Profile with Photo button",GetData.SearchingAdvance);
				}
				
}

