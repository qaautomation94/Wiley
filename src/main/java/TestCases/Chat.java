
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Chat extends HelpingFunction  {

				public static  void chat() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://www.nepal-matrimony.com/profile/"+user);
					Thread.sleep(15000);

					Click("Please click chat button",GetData.sendmessage);
					Thread.sleep(000);
					Input("Please enter Reasons and Evidence", GetData.ReplyText, "test message");
					Thread.sleep(3000);
					Click("Please click chat button",GetData.Send);
				}
				
}

