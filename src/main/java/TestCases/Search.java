
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Search extends HelpingFunction  {
				public static  void Suggestions() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					driver.findElement(By.xpath("//input[contains(@type, 'search')]")).sendKeys("Java");
					Thread.sleep(15000);
					List<WebElement> li1 = driver.findElements(By.xpath("//div[contains(@class, 'search-list')]/div"));
					int count1 = li1.size();
					
					for(int a=0; a<count1; a++) {
						System.out.println(li1.get(a).getText());
						Assert.assertTrue(li1.get(a).getText().contains("java"));
					}


			}
	public static  void SearchResults() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());


					driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).click();
					Thread.sleep(15000);

					List<WebElement> li2 = driver.findElements(By.xpath("//h3[contains(@class, 'product-title')]/a"));
					int count2 = li2.size();
					
					for(int a=0; a<count2; a++) {
						System.out.println(li2.get(a).getText());
						Assert.assertTrue(li2.get(a).getText().contains("Java"));
					}


			}

	public static  void SearchResultsCount() throws InterruptedException, AWTException, IOException{
		
		
		Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());


		driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).click();
		Thread.sleep(15000);

		List<WebElement> li2 = driver.findElements(By.xpath("//h3[contains(@class, 'product-title')]/a"));
		int count2 = li2.size();
		
		Assert.assertEquals(count2, 10);
//		for(int a=0; a<count2; a++) {
//			System.out.println(li2.get(a).getText());
//			Assert.assertTrue(li2.get(a).getText().contains("Java"));
//		}

		
		List<WebElement> li3 = driver.findElements(By.xpath("//h3[contains(@class, 'product-title')]/a/ancestor::div[contains(@class, 'product-content')]/descendant::ul"));
		int count3 = li3.size();
		
		for(int a=0; a<count3; a++) {
			System.out.println(li3.get(a).getText());
			Assert.assertTrue(li3.get(a).getText().contains("E-BOOK"));
		}

		for(int a=0; a<count3; a++) {
			System.out.println(li3.get(a).getText());
			Assert.assertTrue(li3.get(a).getText().contains("PRINT"));
		}
		for(int a=0; a<count3; a++) {
			System.out.println(li3.get(a).getText());
			Assert.assertTrue(li3.get(a).getText().contains("O-BOOK"));
		}


}

}

