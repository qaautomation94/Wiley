
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Profile extends HelpingFunction  {

				public static  void editProfile() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Profile button",GetData.EditProfile);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");
					
					Input("Please Enter Profile title", GetData.ProfileTitle, TestData.TITLE);
					Input("Please Enter Profile Proposal", GetData.ProfileProposal, TestData.PROPOSAL);
					
					Click("Please click Submit Your Proposal for Review button",GetData.SubmitProposal);
					
					Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

					
				}
				
				public static  void editPhotos() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Photos button",GetData.EditPhotos);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");
					
					Input("Please Enter Photo Name", GetData.PhotoName, TestData.PHOTONAME);
					Input("Please Enter Photo Description", GetData.Description, TestData.DESCRIPTION);
					
					Click("Please click Edit Photos button",GetData.SelectFiles);
					
					Thread.sleep(2000);

					String Projectpath=System.getProperty("user.dir");
	    		    System.out.println(Projectpath);
	    		    ProcessBuilder pb = new ProcessBuilder(Projectpath+"/Img/upload.exe", Projectpath+"\\Img\\logo.jpg");
	    		    Thread.sleep(5000);
	    		    pb.start();
				    
				    Thread.sleep(2000);
				    driver.switchTo().defaultContent();
				    Thread.sleep(2000);
					
					Click("Please click Save this Photo to Profile button",GetData.SaveProfilePhoto);
					
					Thread.sleep(5000);
					

				}
				
				public static  void deletePhoto() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					Click("Please click Delete button",GetData.DeletePhoto);
					
					 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
					 	wait= new WebDriverWait(driver, Duration.ofSeconds(10));
										     	try{
				     		wait.until(ExpectedConditions.alertIsPresent());
				     		 Alert alert = driver.switchTo().alert();		
				     		 alert.accept();
				     	}
				     	catch (Exception e) {
				     	
				         }
					
					Assert.assertTrue(GetData.SuccessfullyUpdated.isDisplayed());
				}
				
				public static  void editVideos() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Videos button",GetData.EditVideos);
					Thread.sleep(5000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)");
					
					Input("Please Enter Youtube URL", GetData.VideoURL, TestData.YOUTUBEURL);
					Input("Please Enter Video Title", GetData.VideoTitle, TestData.VIDEOTITLE);
					Input("Please Enter Video Description", GetData.VideoDescription, TestData.VIDEODESCRIPTION);
					
					Click("Please click Save this Video to Profile button",GetData.SaveVideo);
					
					js.executeScript("window.scrollBy(0,400)");
					Click("Please click Delete Video button",GetData.DeleteVideo);
					driver.switchTo().alert().accept();
					
					Assert.assertTrue(GetData.SuccessfullyUpdated.isDisplayed());
					
				}
				
				public static  void editAccount() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Account button",GetData.EditAccount);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,700)");
					
					Select day = new Select(GetData.ChangeDOB);
					day.selectByIndex(5);
					
					js.executeScript("window.scrollBy(0,500)");
					Click("Please click on Change Password button",GetData.ChangePassword);
					
					Input("Please Enter Current Password", GetData.Password, TestData.PASS);
					Input("Please Enter New Password", GetData.NewPassword, TestData.PASS);
					Input("Please Enter Confirm Password", GetData.ConfirmPassword, TestData.PASS);
					
					Click("Please click on Update Account Details button",GetData.AccountDetails);
					
					Assert.assertTrue(GetData.ConfirmUpdated.isDisplayed());
					
				}
				
               public static  void editPersonal() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Personal button",GetData.EditPersonal);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Select body = new Select(GetData.Body);
					body.selectByIndex(3);
					
					JavascriptExecutor bottomscroll = (JavascriptExecutor) driver;
					bottomscroll.executeScript("window.scrollBy(0,1000)");
					
					Click("Please click on Update Personal Profile button",GetData.PersonalProposal);
					
				}
               
               public static  void editPartner() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Partner button",GetData.EditPartner);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Select weight = new Select(GetData.Weight);
					weight.selectByIndex(7);
					
					JavascriptExecutor bottomscroll = (JavascriptExecutor) driver;
					bottomscroll.executeScript("window.scrollBy(0,1000)");
					
					Click("Please click on Update Partner Preferences button",GetData.PartnerPreferences);
					
				}
               
               public static  void editSettings() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Settings button",GetData.EditSettings);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Click("Please click on Subscribe Email Notifications button",GetData.EmailNotification);
					Click("Please click on Update Preferences button",GetData.UpdatePreferences);

				}
               
               public static  void editVerification() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Verification button",GetData.EditVerification);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					List<WebElement> li=GetData.RealName;
					
					//li.get(0).sendKeys(TestData.REALNAME);
					if(li.size()==1) {
						Input("Please Enter Real Full Name", li.get(0), TestData.REALNAME);
						Input("Please Enter Mobile Number", GetData.MobileNumber, TestData.MOBILENUMBER);
						Click("Please click on Verify My Account button",GetData.VerifyAccount);

					}
					else {
						Input("Please Enter Verification code", GetData.VerificationCode, TestData.VERIFICATIONCODE);

					}
				}			
}

