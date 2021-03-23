package Master;
import static TestCases.StartBrowser.StartupBrowser;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import PageFactoryandTestdata.TestData;
import TestCases.Chat;
import TestCases.Favours;
import TestCases.Gallery;
import TestCases.Interests;
import TestCases.Login;
import TestCases.Logout;
import TestCases.Mail;
import TestCases.Members;
import TestCases.Messages;
import TestCases.Online;
import TestCases.Profile;
import TestCases.Prospects;
import TestCases.Recent;
import TestCases.Search;
import TestCases.SignUp;
import TestCases.Support;
import TestCases.Systemroperties;
import TestCases.Viewed;
public class ExecutionFile {
	
	protected static WebDriver driver;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	public static String browser="chrome";
	static String Suite="MatchMaking.html";
	protected static String email;
	
	protected static String envirnment=TestData.stage;
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{


				
			Systemroperties.Property();
	
		}

	
	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 

	@Test(priority=1)
	public   void SignUp() throws InterruptedException, AWTException, IOException{
	 	SignUp.signUp();		
 	}
	
	@Test(priority=2)
	public   void Logout() throws InterruptedException, AWTException, IOException{
	 	Logout.logout();
 	}

	@Test(priority=3)
	public   void ForgotPassword() throws InterruptedException, AWTException, IOException{
	 	Login.forgotPassword();		
 	}
	
		@Test(priority=6)
		public   void ALoginWithAdmin() throws InterruptedException, AWTException, IOException{
		 	Login.loginold();		
	 	}


		@Test(priority=7)
		public   void Viewed() throws InterruptedException, AWTException, IOException{
			Viewed.viewed();
		}
		
		@Test(priority=8)
		public   void Recent() throws InterruptedException, AWTException, IOException{
			Recent.recent();
		}
		
		@Test(priority=9)
		public   void Online() throws InterruptedException, AWTException, IOException{
			Online.online();
		}
		
		@Test(priority=10)
		public   void Favours() throws InterruptedException, AWTException, IOException{
			Favours.favours();
		}
		
		@Test(priority=11)
		public   void Interests() throws InterruptedException, AWTException, IOException{
			Interests.interests();
		}

		@Test(priority=12)
		public   void Mail() throws InterruptedException, AWTException, IOException{
			Mail.mail();
		}
	
		@Test(priority=12)
		public   void Chat() throws InterruptedException, AWTException, IOException{
		 	Chat.chat();
	 	}
		
		@Test(priority=13)
		public   void ReportProfile() throws InterruptedException, AWTException, IOException{
			Mail.Report();
		}
		
		@Test(priority=14)
		public   void BlockProfile() throws InterruptedException, AWTException, IOException{
			Mail.Block();
		}
		
	@Test(priority=15)
		public   void Profile() throws InterruptedException, AWTException, IOException{
		 	Profile.editProfile();
	 	}
	 	
	 @Test(priority=16)
		public   void EditVideos() throws InterruptedException, AWTException, IOException{
		 	Profile.editVideos();
	 	}	
	
	@Test(priority=17)
	public   void EditAccount() throws InterruptedException, AWTException, IOException{
	 	Profile.editAccount();
 	}

	@Test(priority=18)
	public   void EditPhotos() throws InterruptedException, AWTException, IOException{
	 	Profile.editPhotos();
 	}
	
	@Test(dependsOnMethods = { "EditPhotos" })
	public   void DeletePhoto() throws InterruptedException, AWTException, IOException{
	 	Profile.deletePhoto();
 	}

	@Test(priority=19)
	public   void EditPersonal() throws InterruptedException, AWTException, IOException{
	 	Profile.editPersonal();
 	}
		
	@Test(priority=20)
	public   void EditPartner() throws InterruptedException, AWTException, IOException{
	 	Profile.editPartner();
	}
	
	@Test(priority=21)
	public   void EditSettings() throws InterruptedException, AWTException, IOException{
	 	Profile.editSettings();
	}
	
	@Test(priority=22)
	public   void EditVerification() throws InterruptedException, AWTException, IOException{
	 	Profile.editVerification();
	}
	
	
	
	@Test(priority=24)
	public   void BasicSearch() throws InterruptedException, AWTException, IOException{
	 	Search.basicSearch();
	}
	
	@Test(priority=25)
	public   void AdvanceSearch() throws InterruptedException, AWTException, IOException{
	 	Search.advanceSearch();
	}
	
	@Test(priority=26)
	public   void PhotoGallery() throws InterruptedException, AWTException, IOException{
	 	Gallery.photoGallery();
	}
	
	@Test(priority=27)
	public   void VideoGallery() throws InterruptedException, AWTException, IOException{
	 	Gallery.videoGallery();
	}
	
	
	@Test(priority=28)
	public   void OnlineMembers() throws InterruptedException, AWTException, IOException{
	 	Members.onlineMembers();
	}
	
	@Test(priority=29)
	public   void RecentMembers() throws InterruptedException, AWTException, IOException{
	 	Members.recentMembers();
	}
	
	@Test(priority=30)
	public   void VerifiedMembers() throws InterruptedException, AWTException, IOException{
	 	Members.verifiedMembers();
	}
	
	@Test(priority=31)
	public   void NewestMembers() throws InterruptedException, AWTException, IOException{
	 	Members.newestMembers();
	}
	
	@Test(priority=32)
	public   void FeaturedMembers() throws InterruptedException, AWTException, IOException{
	 	Members.featuredMembers();
	}
			 
	@Test(priority=33)
	public   void MyMatchProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.myMatchProspects();
	}
	
	@Test(priority=34)
	public   void mMFavouritesProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.myFavouritesProspects();
	}
		
	@Test(priority=35)
	public   void FavoursMeProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.favoursMeProspects();
	}
	
	@Test(priority=36)
	public   void MyViewedProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.myViewedProspects();
	}
		
	@Test(priority=37)
	public   void ViewedMeProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.viewedMeProspects();
	}
		
	@Test(priority=38)
	public   void MyBlockedProspects() throws InterruptedException, AWTException, IOException{
	 	Prospects.blockedProspects();
	}
		
	@Test(priority=39)
	public   void SentMailMessages() throws InterruptedException, AWTException, IOException{
	 	Messages.sentMailMessages();
	}
		
	@Test(priority=40)
	public   void ReceivedInterestsMessages() throws InterruptedException, AWTException, IOException{
	 	Messages.receivedInterestsMessages();
	}
		
	@Test(priority=41)
	public   void SentInterestMessages() throws InterruptedException, AWTException, IOException{
	 	Messages.sentInterestMessages();
	}
	
	@Test(priority=42)
	public   void ChatConversationsMessages() throws InterruptedException, AWTException, IOException{
	// 	Messages.chatConversationsMessages();
	}
	
	@Test(priority=43)
	public   void OnlineSecuritySupport() throws InterruptedException, AWTException, IOException{
	 	Support.onlineSecuritySupport();
	}
	
	@Test(priority=44)
	public   void RelationshipAdviceSupport() throws InterruptedException, AWTException, IOException{
	 	Support.relationshipAdviceSupport();
	}
	
	@Test(priority=45)
	public   void HelpPagesSupport() throws InterruptedException, AWTException, IOException{
		Support.helpPagesSupport();
	}
	
	@Test(priority=46)
	public   void TestimonialsSupport() throws InterruptedException, AWTException, IOException{
		Support.testimonialsSupport();
	}
	
	@Test(priority=47)
	public   void AboutUsSupport() throws InterruptedException, AWTException, IOException{
		Support.aboutUsSupport();
		
	}
	
	@Test(priority=48)
	public   void ContactUsSupport() throws InterruptedException, AWTException, IOException{
		Support.contactUsSupport();
		
	}


	@Test(priority=50)
	public   void LogoutAdmin() throws InterruptedException, AWTException, IOException{
	 	Logout.logout();
 	}

	@Test(priority=51)
	 		public   void LoginNewUser() throws InterruptedException, AWTException, IOException{
				 	Login.login();		
			 	}

	@Test(priority=53)
	public   void Delete_User() throws InterruptedException, AWTException, IOException{
	 	Login.DeleteUser();
	
	 	
 	}

			@AfterMethod
			public void getResult(ITestResult result) throws IOException, InterruptedException{
				 //System.out.println(result.getStatus());
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
	 				extent.flush();

		 			
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){
				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
				 	test.fail(result.getThrowable());
			 		extent.flush();
			 		}
				
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print(result.getStatus());
	 				System.out.print("Test cases is skipped");
					test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					test.skip(result.getThrowable());
					extent.flush();
				    }				 		
	 			
			 }
			 
			@AfterTest
			public void endReport(){
			
			//	driver.get(System.getProperty("user.dir")+"/Reports/CRMReport.html");
			}
			@AfterSuite
			 public void CloseBrowser() throws IOException {
				
			//	driver.quit();
			}
			 
}
