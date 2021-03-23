
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import junit.framework.Assert;


public class API extends HelpingFunction  {
				public static  void Get_Call() throws InterruptedException, AWTException, IOException, ParseException{
					

					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
				
					driver.get("https://www.wiley.com/en-us/search/autocomplete/comp_00001H9J?term=Java");
					
					String str =	driver.findElement(By.xpath("//pre")).getText();
					str.contains("term");
				
			
				}
				

public static  void Delay() throws InterruptedException, AWTException, IOException, ParseException{

					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
				
					driver.get("https://httpbin.org/#/Dynamic_data/post_delay__delay_");
					
					Thread.sleep(15000);
					driver.findElement(By.xpath("//span[contains(text(), 'POST')]")).click();
					Thread.sleep(5000);
					String status = driver.findElement(By.xpath("//td[contains(@class, 'col response-col_status')]")).getText();

					Assert.assertEquals(status, "200");
					
			
				}
				

public static  void Png() throws InterruptedException, AWTException, IOException, ParseException{
	
				Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
				test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
			
				driver.get("https://httpbin.org/#/Images/get_image_png");
				Thread.sleep(5000);
				driver.navigate().refresh();
				Thread.sleep(15000);
				String status = driver.findElement(By.xpath("//td[contains(@class, 'col response-col_status')]")).getText();
			
				Assert.assertEquals(status, "200");

}


				
				

}
