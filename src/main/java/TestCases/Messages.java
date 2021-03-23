
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
import PageFactoryandTestdata.TestData;


public class Messages extends HelpingFunction  {

				public static  void inComingMailMessages() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement messages = GetData.Messages;
					action.moveToElement(messages).build().perform();

					Click("Please click Incoming Mails button",GetData.IncomingMails);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.InboxMessages.isDisplayed());

					
				}
				
				public static  void sentMailMessages() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement messages = GetData.Messages;
					action.moveToElement(messages).build().perform();

					Click("Please click Sent Mails button",GetData.SentMails);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.SentMessages.isDisplayed());
				}
				
				public static  void receivedInterestsMessages() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement messages = GetData.Messages;
					action.moveToElement(messages).build().perform();

					Click("Please click on Received Interests button",GetData.ReceivedInterests);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.InterestsReceived.isDisplayed());
				}
				
				public static  void sentInterestMessages() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement messages = GetData.Messages;
					action.moveToElement(messages).build().perform();

					Click("Please click on Sent Interests button",GetData.SentInterests);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)");
					
					Assert.assertTrue(GetData.InterestsSent.isDisplayed());
				}
				
				public static  void chatConversationsMessages() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://www.nepal-matrimony.com/profile/"+user);
					
					Actions action = new Actions(driver);
					WebElement messages = GetData.Messages;
					action.moveToElement(messages).build().perform();

					Click("Please click on Chat Conversations button",GetData.ChatConversations);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)");
					
					Assert.assertTrue(GetData.ChatConversationsTitle.isDisplayed());
					
					Click("Please click on View Chat button",GetData.ViewChat);
					Click("Please click on Reply button",GetData.ReplyChat);
					Input("Please Enter Text Message", GetData.ReplyText, TestData.REPLY);
					Click("Please click on Send button",GetData.Send);
					Click("Please click on Close chat icon",GetData.CloseChat);
					Click("Please click on Hide chat icon",GetData.HideCaht);
					
					
				}
				
			
}

