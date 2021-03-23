
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class SignUp extends HelpingFunction  {

				public static  void signUp() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					
					JavascriptExecutor scroll = (JavascriptExecutor) driver;
					scroll.executeScript("window.scrollBy(0,300)");
					
					Click("Please click on Register & Join Now button",GetData.Register);
					
					JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
					scroll2.executeScript("window.scrollBy(0,400)");
					Random ran = new Random(); 
				      
			        // Print next int value 
			        // Returns number between 0-9 
			        int nxt = ran.nextInt(999999); 
				       user = "test"+nxt;
				   //   String user = "test15234";
 
					Input("Please Enter UserName", GetData.SignUpUserName, user);
					Input("Please Create Password", GetData.CreatePassword, TestData.CREATEPASSWORD);
//					int min=1;
//					int max=1000;
//				      double random_double = Math.random() * (max - min + 1) + min; 

				      
					
				       email = "erandaka.indu@gmail.com";
				   //    email = "test"+nxt+"@gmail.com";

					
					
					Input("Please Enter Email", GetData.Email, email);
					
					Click("Please select Gender",GetData.FemaleGender);
					
					Select day = new Select(GetData.Day);
					day.selectByIndex(7);
					
					Select month = new Select(GetData.Month);
					month.selectByIndex(9);
					
					Select year = new Select(GetData.Year);
					year.selectByIndex(38);
					
					Input("Please Enter Proposal Description", GetData.ProposalDescription, TestData.PROPOSALDESCRIPTION);
					
					JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
					scroll3.executeScript("window.scrollBy(0,600)");
					
					Select country = new Select(GetData.Country);
					country.selectByIndex(2);
					Thread.sleep(3000);
					
					Select state = new Select(GetData.State);
					state.selectByIndex(6);
					Thread.sleep(10000);
					
//					Click("Please click on Select City",GetData.SelectCity);
//					Thread.sleep(10000);
//					Click("Please select City",GetData.City);
					Select city = new Select(GetData.City1);
					city.selectByIndex(6);
					//Thread.sleep(3000);
					
					Select height = new Select(GetData.Height);
					height.selectByIndex(6);
					
					Select weight = new Select(GetData.Weight2);
					weight.selectByIndex(6);
					
					Select body = new Select(GetData.Body);
					body.selectByIndex(6);
					
					Select appearance = new Select(GetData.Appearance);
					appearance.selectByIndex(1);
					
					Select complexion = new Select(GetData.Complexion);
					complexion.selectByIndex(2);
					
					Select marital = new Select(GetData.Marital);
					marital.selectByIndex(1);
					
					JavascriptExecutor scroll4 = (JavascriptExecutor) driver;
					scroll4.executeScript("window.scrollBy(0,400)");
					
					Select education = new Select(GetData.Education);
					education.selectByIndex(4);
					
					Select career = new Select(GetData.Career);
					career.selectByIndex(5);
					
					Select religion = new Select(GetData.Religion);
					religion.selectByIndex(5);
					
					Select ethnicity = new Select(GetData.Ethnicity);
					ethnicity.selectByIndex(1);
					
					Select socialClass = new Select(GetData.SocialClass);
					socialClass.selectByIndex(3);
					
					Select residency = new Select(GetData.Residency);
					residency.selectByIndex(1);
					
					Select family = new Select(GetData.Family);
					family.selectByIndex(1);
					
					JavascriptExecutor scroll5 = (JavascriptExecutor) driver;
					scroll5.executeScript("window.scrollBy(0,500)");
					
					Select smoking = new Select(GetData.Smoking);
					smoking.selectByIndex(3);
					
					Select drinking = new Select(GetData.Drinking);
					drinking.selectByIndex(1);
					
					Select childern = new Select(GetData.Childern);
					childern.selectByIndex(1);
					
					Select personality = new Select(GetData.Personality);
					personality.selectByIndex(3);
					
					Select nextStep = new Select(GetData.NextStep);
					nextStep.selectByIndex(1);
					
					Click("Please click on Terms & Conditions link",GetData.Terms);
					Thread.sleep(3000);
					Click("Please click on Close button",GetData.Close);
					
					Click("Please click on Complete Regiestration button",GetData.CompleteRegistration);

					
				}
				
}

