
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class WhoWeServe extends HelpingFunction  {
				public static  void WhoWe_Server() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					Actions action = new Actions(driver);
					WebElement we = GetData.WhoWeServe;
					action.moveToElement(we).moveToElement(we).click().build().perform();
					
			//		Input("Please Enter UserName", GetData.UserName, TestData.USER);
			//		Input("Please Enter Password", GetData.Password, TestData.PASS);

			//		Click("Please click login button",GetData.LoginButton);
					Thread.sleep(5000);
					
					List<WebElement> li=GetData.ItemsCount;
					int count = li.size();
					System.out.println(count);
					String[] Who_We_Are = {"Students", "Instructors", "Book Authors", "Professionals", "Researchers", "Institutions", "Librarians", "Corporations", "Societies", "Journal Editors", "Bookstores", "Government"};

					for(int a=0; a<count; a++) {
						System.out.println(li.get(a).getText());
						Assert.assertEquals(li.get(a).getText(), Who_We_Are[a]);
						
					}
					
					
				}
				
				
				

	public static  void Edu() throws InterruptedException, AWTException, IOException{
						
		Thread.sleep(30000);
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					Actions action = new Actions(driver);
					WebElement we = GetData.Subjects;
					action.moveToElement(we).build().perform();
					

					Thread.sleep(5000);
					WebElement we1 = GetData.Education;
					action.moveToElement(we1).build().perform();
					
					
					List<WebElement> li=GetData.EducationItemsCount;
					int count = li.size();
					System.out.println(count);
					String[] Education = {"Assessment Evaluation Methods", "Classroom Management", "Conflict Resolution & Mediation", "Curriculum Tools", "Education & Public Policy", "Educational Research", "General Education", "Higher Education", "Information & Library Science", "Special Education", "Special Topics", "Vocational Technology"};

					for(int a=1; a<count; a++) {
						System.out.println(li.get(a).getText());
						
//						String str = li.get(a).getText();
//						str = str.replaceAll(",", "");
						Assert.assertEquals(li.get(a).getText(), Education[a]);
						
					}
					
					
				}
				
				
				

}
