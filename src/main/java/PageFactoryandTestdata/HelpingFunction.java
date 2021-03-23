package PageFactoryandTestdata;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import Master.ExecutionFile;
public class HelpingFunction extends ExecutionFile{
//				static String user=System.getProperty("user.name");
//				public static String downloadPath = "C:\\Users\\"+user+"\\Downloads";
				 public static String user;
			public static void Input(String message, WebElement key,String value){
					try {
						key.clear();
						key.sendKeys(value);
					}	
		 
					/*catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
					}	*/
					catch (NoSuchElementException e) {
						System.err.println("NoSuchElementException: " + e.getMessage());
					}	
				}

			public static void RefreshPage() throws InterruptedException{
					Thread.sleep(2000);
					driver.navigate().refresh();
					Thread.sleep(6000);

			}
	
	
	
			public static void Click(String abc, WebElement key)
			{
					try {
			
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("arguments[0].click();", key);
					}
					catch (IndexOutOfBoundsException e) {
						System.err.println("IndexOutOfBoundsException: " + e.getMessage());
					}	
					 
					catch (NoSuchElementException b) {
						System.err.println("NoSuchElementException: " + b.getMessage());
					}	
			}

			public static void ClickAt(String abc, WebElement key){
					try {
						key.click();
					}
						catch (IndexOutOfBoundsException e) {
							System.err.println("IndexOutOfBoundsException: " + e.getMessage());
						}	
			}
			
			


			
			public static void Verify(String expected, String actual, String mesage){
				try {
    			SoftAssert assertion =new SoftAssert();
    			assertion.assertEquals(expected, actual, mesage);
    			assertion.assertAll();
				}
				catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
				}	
			}
			
			public static void VerifySearch(String a, String b, String c){
				try {
    			SoftAssert assertion =new SoftAssert();
    			assertion.assertNotEquals(a, b, c);
    			assertion.assertAll();
				}
				catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
				}	
			}


			
}
