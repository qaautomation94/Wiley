
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Login extends HelpingFunction  {

				public static  void login() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);


					Input("Please Enter UserName", GetData.UserName, user);
					Input("Please Enter Password", GetData.Password, TestData.CREATEPASSWORD);
					Thread.sleep(3000);

					Click("Please click login button",GetData.LoginButton);
					Thread.sleep(5000);

					
				}
				
				public static  void loginold() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					
					Input("Please Enter UserName", GetData.UserName, TestData.USER);
					Input("Please Enter Password", GetData.Password, TestData.PASS);

//					Input("Please Enter UserName", GetData.UserName, email);
//					Input("Please Enter Password", GetData.Password, TestData.CREATEPASSWORD);
//					Thread.sleep(3000);

					Click("Please click login button",GetData.LoginButton);
					Thread.sleep(5000);
					String url = driver.getCurrentUrl();
					
					driver.get("https://www.nepal-matrimony.com/profile/"+user);
				}
				public static  void DeleteUser() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Settings button",GetData.EditSettings);
					Thread.sleep(10000);
					Click("Please click Edit Settings button",GetData.DeleteUser);
					Thread.sleep(5000);
					Click("Please click Edit Settings button",GetData.DeleteProfile);

					
				}
				

				public static  void forgotPassword() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					
					Click("Please click Forgot Password link",GetData.ForgotPassword);
					
					JavascriptExecutor scroll = (JavascriptExecutor) driver;
					scroll.executeScript("window.scrollBy(0,300)");
					
					Input("Please Enter UserName", GetData.ForgotEmail, email);
					Thread.sleep(3000);

					Click("Please click Forgot Password button",GetData.ForgotButton);
					Thread.sleep(5000);
					
				}
}

