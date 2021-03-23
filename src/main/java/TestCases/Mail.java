
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Mail extends HelpingFunction  {

				public static  void mail() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://www.nepal-matrimony.com/profile/"+user);

			//		Click("Please click Mail button",GetData.Mail);
					Click("Please click Mail button",GetData.SendEmail);

					
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					
					
					JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
					scroll2.executeScript("window.scrollBy(0,900)");
					
					Input("Please Enter Subject", GetData.Subject, TestData.SUBJECT);
					Input("Please Enter Content", GetData.Content, TestData.CONTENT);
					
					Click("Please click Select Files button",GetData.SelectFiles);
					Thread.sleep(2000);

					String Projectpath=System.getProperty("user.dir");
	    		    System.out.println(Projectpath);
	    		    ProcessBuilder pb = new ProcessBuilder(Projectpath+"/Img/upload.exe", Projectpath+"\\Img\\logo.jpg");
	    		    Thread.sleep(5000);
	    		    pb.start();
				    
	    		    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
				 	wait= new WebDriverWait(driver, Duration.ofSeconds(10));
									     	try{
			     		wait.until(ExpectedConditions.alertIsPresent());
			     		 Alert alert = driver.switchTo().alert();		
			     		 alert.accept();
			     	}
			     	catch (Exception e) {
			     	
			         }




				    Thread.sleep(2000);
				//    driver.switchTo().defaultContent();
				    Thread.sleep(2000);
					
				//    driver.switchTo().alert().accept();
				    
					Click("Please click Send Message button",GetData.SendMessage);
					
					JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
					scroll3.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.SentMessageTitle.isDisplayed());
				}

				public static  void Report() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://www.nepal-matrimony.com/profile/"+user);
					Thread.sleep(10000);
					Click("Please click Mail button",GetData.toggle);
					Click("Please click Mail button",GetData.Report);

					
					}
				public static  void Block() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://www.nepal-matrimony.com/profile/"+user);
					Thread.sleep(10000);
					Click("Please click Mail button",GetData.toggle);
					Click("Please click Mail button",GetData.Block);

					
					}

				

}

