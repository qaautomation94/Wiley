package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.ExecutionFile;



public class Locatiors extends ExecutionFile{
	

	@FindBy(xpath="//input[contains(@id,'user')]") public WebElement UserName;
	@FindBy(xpath="//input[contains(@id,'password')]") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement LoginButton;
	@FindBy(xpath="//a[contains(@href, '/publishers')]") public WebElement Publishers;
	@FindBy(xpath="//tbody/tr") public List<WebElement> publisherrecords;
	@FindBy(xpath="//a[contains(@href, '/offers')]") public WebElement Offers;
	@FindBy(xpath="//a[contains(@href, '/logout')]") public WebElement Logout;
	
	//FORGOT PASSWORD
	@FindBy(xpath="//a[contains(@title, 'Forgot password?')]") public WebElement ForgotPassword;
	@FindBy(xpath="//input[contains(@id, 'forgot_email')]") public WebElement ForgotEmail;
	@FindBy(xpath="//input[contains(@id, 'Submit_Forgot')]") public WebElement ForgotButton;
	
	@FindBy(xpath="//button[contains(@data-test, 'inspect')]") public List<WebElement> ViewBudget;

	@FindBy(xpath="//div[contains(@class, 'ant-empty-description')]") public List<WebElement> nobudget;
	@FindBy(xpath="//input[contains(@id,'user')]") public WebElement search;
	
	//CHAT
	@FindBy(xpath="//a[contains(@href, '/message/chat/messages')]") public WebElement ChatButton;
	@FindBy(xpath="//span[contains(text(), 'admin')]") public WebElement admin;
	@FindBy(xpath="//a[contains(text(),'Chat Conversations')]") public List<WebElement> ChatConversations2;
	@FindBy(xpath="//div[contains(@class, 'col-6 text-center')]") public List<WebElement> MailConversations;
	@FindBy(xpath="//div[contains(text(), 'No chat conversations found.')]") public WebElement NoChatText;
	@FindBy(xpath="//b[contains(text(),'Set Favourite')]") public WebElement SetFavourite;
	@FindBy(xpath="//div[contains(text(), 'Your favourite added successfully.')]") public WebElement SetFavouriteText;
	@FindBy(xpath="//div[contains(text(), 'Already a favourite of yours.')]") public WebElement AlreadyFavourite;
	@FindBy(xpath="//a[contains(@title, 'Show your interest')]") public WebElement ShowInterest;
	@FindBy(xpath="//div[contains(text(), 'You have shown interest in this member before.')]") public WebElement AlreadyShowedInterest;
	@FindBy(xpath="//div[contains(text(), 'Your interest sent successfully.')]") public WebElement ShowInterestSuccess;
	
	//BLOCK && REPORT PROFILE
	@FindBy(xpath="//img[contains(@class, 'lozad')]") public List<WebElement> BlockIcon;
	@FindBy(xpath="//a[contains(text(), 'Block Profile')]") public WebElement BlockProfile;
	@FindBy(xpath="//div[contains(text(), 'Your blocked profile added successfully.')]") public WebElement BlockProfileText;
	@FindBy(xpath="//div[contains(text(), 'Already a blocked profile of yours.')]") public WebElement AlreadyBlockProfileText;
	@FindBy(xpath="//a[contains(@class, 'dropdown-item small')]") public List<WebElement> ReportProfile;
	@FindBy(xpath="//textarea[contains(@id,'comment')]") public WebElement Reason;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement ReportUserProfile;
	
	
	//UNBLOCK PROFILE
	@FindBy(xpath="//a[contains(text(),'My Blocked')]") public List<WebElement> MyBlocked2;
	@FindBy(xpath="//b[contains(text(),'Remove')]") public WebElement Remove;
	@FindBy(xpath="//a[contains(text(),'My Favourites')]") public List<WebElement> MyFavourites2;
	@FindBy(xpath="//button[contains(@id,'Delete')]") public WebElement Delete;
	
	@FindBy(xpath="//a[contains(text(), 'Messages')]") public WebElement messages;
	
	@FindBy(xpath="//a[contains(text(), 'Profile')]") public WebElement profile;
	@FindBy(xpath="//a[contains(text(), 'Edit Profile')]") public WebElement EditProfile;
	@FindBy(xpath="//a[contains(text(), 'Edit Videos')]") public WebElement EditVideos;
	
	
	@FindBy(xpath="//input[contains(@id,'headline')]") public WebElement ProfileTitle;
	@FindBy(xpath="//textarea[contains(@id,'essay')]") public WebElement ProfileProposal;
	
	//EDIT PHOTOS
	@FindBy(xpath="//a[contains(text(), 'Edit Photos')]") public WebElement EditPhotos;
	@FindBy(xpath="//input[contains(@id, 'photo_name')]") public WebElement PhotoName;
	@FindBy(xpath="//textarea[contains(@id, 'description')]") public WebElement Description;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SaveProfilePhoto;
	@FindBy(xpath="//button[contains(@id, 'Delete')]") public WebElement DeletePhoto;
	
	//PROFILE EDIT VIDEO
	@FindBy(xpath="//input[contains(@id, 'audio_url')]") public WebElement VideoURL;
	@FindBy(xpath="//input[contains(@id, 'audio_name')]") public WebElement VideoTitle;
	@FindBy(xpath="//textarea[contains(@id, 'description')]") public WebElement VideoDescription;
	@FindBy(xpath="//input[contains(@id, 'Submit')]") public WebElement SaveVideo;
	@FindBy(xpath="//button[contains(@id, 'Delete')]") public WebElement DeleteVideo;
	@FindBy(xpath="//div[contains(text(), 'Successfully Updated.')]") public WebElement SuccessfullyUpdated;
	
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SubmitProposal;
	
	@FindBy(xpath="//div[contains(text(), 'Successfully Updated.')]") public WebElement SuccessMessage;
	
	//PROFILE EDIT ACCOUNt
	@FindBy(xpath="//a[contains(text(), 'Edit Account')]") public WebElement EditAccount;
	@FindBy(xpath="//select[contains(@id,'day')]") public WebElement ChangeDOB;
	@FindBy(xpath="//button[contains(@type,'submit')]") public WebElement AccountDetails;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]") public WebElement ChangePassword;
	@FindBy(xpath="//input[contains(@id, 'npassword')]") public WebElement NewPassword;
	@FindBy(xpath="//input[contains(@id, 'cpassword')]") public WebElement ConfirmPassword;
	@FindBy(xpath="//div[contains(text(), 'Successfully Updated.')]") public WebElement ConfirmUpdated;
	
	@FindBy(xpath="//a[contains(text(), 'Edit Personal')]") public WebElement EditPersonal;
	
	@FindBy(xpath="//select[contains(@id,'body')]") public WebElement Body;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement PersonalProposal;
	
	//PROFILE EDIT PARTNER
	@FindBy(xpath="//a[contains(text(), 'Edit Partner')]") public WebElement EditPartner;
	@FindBy(xpath="//select[contains(@id,'p_weight_from')]") public WebElement Weight;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement PartnerPreferences;
	
	//PROFILE EDIT SETTINGS
	@FindBy(xpath="//a[contains(text(), 'Edit Settings')]") public WebElement EditSettings;
	
	@FindBy(xpath="//*[contains(text(), 'Account Delete')]") public WebElement DeleteUser;
	
	@FindBy(xpath="//*[contains(@value, 'Delete Profile')]") public WebElement DeleteProfile;


	@FindBy(xpath="//label[contains(@class,'custom-control-label')]") public WebElement EmailNotification;
	@FindBy(xpath="//input[contains(@id,'alerts')]") public WebElement UpdatePreferences;
	
	//PROFILE EDIT VERIFICATION
	@FindBy(xpath="//a[contains(text(), 'Edit Verification')]") public WebElement EditVerification;
	@FindBy(xpath="//input[contains(@id,'real_name')]") public List<WebElement> RealName;
	@FindBy(xpath="//input[contains(@name,'mobile')]") public WebElement MobileNumber;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement VerifyAccount;
	@FindBy(xpath="//input[contains(@id, 'activation_code')]") public WebElement VerificationCode;
	
	//BASIC SEARCH
	@FindBy(xpath="//a[contains(text(), 'Search')]") public WebElement Search;
	@FindBy(xpath="//a[contains(text(),'Basic Search')]") public WebElement BasicSearch;
	@FindBy(xpath="//select[contains(@id,'p_age_to')]") public WebElement AgeRange;
	@FindBy(xpath="//select[contains(@id,'status')]") public WebElement Status;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement StartSearching;
	@FindBy(xpath="//h3[contains(text(), 'Search Results')]") public WebElement SearchResults;
	
	//ADVANCE SEARCH
	@FindBy(xpath="//a[contains(text(),'Advanced Search')]") public WebElement AdvancedSearch;
	@FindBy(xpath="//input[contains(@id,'appearance')]") public WebElement Charming;
	@FindBy(xpath="//input[contains(@id,'complexion')]") public WebElement VeryFair;
	@FindBy(xpath="//input[contains(@id,'cast')]") public WebElement Kshetri;
	@FindBy(xpath="//input[contains(@id,'class')]") public WebElement IdontCare;
	@FindBy(xpath="//label[contains(@class,'custom-control-label')]") public WebElement ProfilePhotoButton;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SearchingAdvance;
	
	//PHOTO GALLERY
	@FindBy(xpath="//a[contains(text(), 'Gallery')]") public WebElement Gallery;
	@FindBy(xpath="//a[contains(text(),'Photo Gallery')]") public WebElement PhotoGallery;
	@FindBy(xpath="//h3[contains(text(), ' Photo Gallery ')]") public WebElement PhotoGalleryTitle;
	
	//VIDEO GALLERY
	@FindBy(xpath="//a[contains(text(),'Video Gallery')]") public WebElement VideoGallery;
	@FindBy(xpath="//h3[contains(text(), ' Video Gallery ')]") public WebElement VideoGalleryTitle;
	
	//ONINE MEMBERS
	@FindBy(xpath="//a[contains(text(), 'Members')]") public WebElement Members;
	@FindBy(xpath="//a[contains(text(),'Online')]") public WebElement Online;
	@FindBy(xpath="//h3[contains(@class,'header_big bg-dark round20')]") public WebElement WhoisOnline;
	
	//RECENT MEMBERS
	@FindBy(xpath="//a[contains(text(),'Recent')]") public WebElement Recent;
	@FindBy(xpath="//h3[contains(text(), 'Recent Members')]") public WebElement RecentMembers;
	@FindBy(xpath="//b[contains(text(),'Add Favourite')]") public WebElement AddFavourite;
	
	//VERIFIED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Verified')]") public WebElement Verified;
	@FindBy(xpath="//h3[contains(text(), 'Verified Members')]") public WebElement VerifiedMembers;
	@FindBy(xpath="//b[contains(text(), 'Send Mail')]") public WebElement SendMail;
	
	//NEWEST MEMBERS
	@FindBy(xpath="//a[contains(text(),'Newest')]") public WebElement Newest;
	@FindBy(xpath="//h3[contains(text(), 'New Members')]") public WebElement NewMembers;
	
	//FEATURED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Featured')]") public WebElement Featured;
	@FindBy(xpath="//h3[contains(text(), 'Featured Members')]") public WebElement FeaturedMembers;
	
	//RECOMMENDED MEMBERS
	@FindBy(xpath="//a[contains(text(),'Recommended')]") public WebElement Recommended;
	@FindBy(xpath="//h3[contains(text(), 'Recommended Members')]") public WebElement RecommendedMembers;
	
	//MY MATCHES PROSPECTS
	@FindBy(xpath="//a[contains(text(), 'Prospects')]") public WebElement Prospects;
	@FindBy(xpath="//a[contains(text(),'My Matches')]") public WebElement MyMatches;
	@FindBy(xpath="//h3[contains(text(), 'My Matches')]") public WebElement MyMatchesTitle;
	
	//MY FAVOURITIES PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Favourites')]") public WebElement MyFavourites;
	@FindBy(xpath="//h3[contains(text(), 'My Favourites')]") public WebElement MyFavouritesTitle;
	
	//FAVOURS ME PROSPECTS
	@FindBy(xpath="//a[contains(text(),'Favours Me')]") public WebElement FavoursMe;
	@FindBy(xpath="//h3[contains(text(), 'Favours Me')]") public WebElement FavoursMeTitle;
	
	//MY VIEWED PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Viewed')]") public WebElement MyViewed;
	@FindBy(xpath="//h3[contains(text(), 'My Viewed')]") public WebElement MyViewedTitle;
		
	//VIEWED ME PROSPECTS
	@FindBy(xpath="//a[contains(text(),'Viewed Me')]") public WebElement ViewedMe;
	@FindBy(xpath="//h3[contains(text(), 'Viewed Me')]") public WebElement ViewedMeTitle;
		
	//MY BLOCKED PROSPECTS
	@FindBy(xpath="//a[contains(text(),'My Blocked')]") public WebElement MyBlocked;
	@FindBy(xpath="//h3[contains(text(), 'Blocked Profiles')]") public WebElement BlockedProfiles;
	
	//INCOMING MAIL MESSAGES
	@FindBy(xpath="//a[contains(text(), 'Messages')]") public WebElement Messages;
	@FindBy(xpath="//a[contains(text(),'Incoming Mails')]") public WebElement IncomingMails;
	@FindBy(xpath="//h3[contains(text(), ' Inbox Messages ')]") public WebElement  InboxMessages;
	
	//SENT MAIL MESSAGES
	@FindBy(xpath="//a[contains(text(),'Sent Mails')]") public WebElement SentMails;
	@FindBy(xpath="//h3[contains(text(), 'Sent Messages')]") public WebElement  SentMessages ;
	
	//RECEIVED INTERESTS MESSAGES
	@FindBy(xpath="//a[contains(text(),'Received Interests')]") public WebElement ReceivedInterests;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement   InterestsReceived;
	
	//SENT INTERESTS MESSAGES
	@FindBy(xpath="//a[contains(text(),'Sent Interests')]") public WebElement SentInterests;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement InterestsSent;
	
	//CHAT CONVERSATION MESSAGES
	@FindBy(xpath="//a[contains(text(),'Chat Conversations')]") public WebElement ChatConversations;
	@FindBy(xpath="//h3[contains(@class,'header_big')]") public WebElement ChatConversationsTitle;
	@FindBy(xpath="//button[contains(@id, 'btn_2')]") public WebElement ViewChat;
	@FindBy(xpath="//b[contains(@class,'btn btn-sm btn-success btn-block')]") public WebElement ReplyChat;

	
	//button[contains(text(), 'Send')]
	@FindBy(xpath="//b[contains(text(), 'Send Message')]") public WebElement sendmessage;

	@FindBy(xpath="//input[contains(@maxlength,'180')]") public WebElement ReplyText;
	@FindBy(xpath="//button[contains(text(),'Send')]") public WebElement Send;
	@FindBy(xpath="//button[contains(text(),'×')]") public WebElement CloseChat;
	@FindBy(xpath="//button[contains(text(),'Hide Chat')]") public WebElement HideCaht;
	
	//ONLINE SECURITY SUPPORT
	@FindBy(xpath="//a[contains(text(), 'Support')]") public WebElement Support;
	@FindBy(xpath="//a[contains(text(),'Online Security')]") public WebElement OnlineSecurity;
	
	//RELATIONSHIP ADVICE SUPPORT
	@FindBy(xpath="//a[contains(text(),'Relationship Advice')]") public WebElement RelationshipAdvice;
	
	//HELP PAGE SUPPORT
	@FindBy(xpath="//a[contains(text(),'Help Pages')]") public WebElement HelpPages;
	
	//TESTIMONIALS SUPPORT
	@FindBy(xpath="//a[contains(text(),'Testimonials')]") public WebElement Testimonials;
	
	//ABOUT US SUPPORT
	@FindBy(xpath="//a[contains(text(),'About us')]") public WebElement Aboutus;
	
	//CONTACT US SUPPORT
	@FindBy(xpath="//a[contains(text(),'Contact us')]") public WebElement Contactus;
	@FindBy(xpath="//textarea[contains(@id,'comment')]") public WebElement Comment;
	@FindBy(xpath="//input[contains(@id, 'Submit')]") public WebElement SubmitInformation;
	
	//VIEWED
	@FindBy(xpath="//a[contains(@href,'/filter/viewedme')]") public WebElement Viewed;
	@FindBy(xpath="//h3[contains(text(),'Viewed Me')]") public WebElement ViewedMeText;
	
	//FAVOURS
	@FindBy(xpath="//a[contains(text(),'Favours')]") public WebElement Favours;
	
	//INTERESTS
	@FindBy(xpath="//a[contains(text(),'Interests')]") public WebElement Interests;
	
	
	@FindBy(xpath="//a[contains(@data-toggle, 'dropdown')]/img") public WebElement toggle;

	@FindBy(xpath="(//a[contains(@class, 'dropdown-item small')])[2]") public WebElement Report;
	@FindBy(xpath="(//a[contains(@class, 'dropdown-item small')])[1]") public WebElement Block;


	//MAIL
	
	@FindBy(xpath="//a[contains(@title, 'Send an email')]") public WebElement SendEmail;

	@FindBy(xpath="//a[contains(text(),'Mail')]") public WebElement Mail;
	@FindBy(xpath="//button[contains(text(),'View Mail')]") public WebElement ViewMail;
	@FindBy(xpath="//button[contains(text(),'Reply Mail')]") public WebElement ReplyMail;
	@FindBy(xpath="//input[contains(@id,'subject')]") public WebElement Subject;
	@FindBy(xpath="//textarea[contains(@id,'text')]") public WebElement Content;
	@FindBy(xpath="//input[contains(@multiple, 'multiple')]") public WebElement SelectFiles;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement SendMessage;
	@FindBy(xpath="//div[contains(text(),'Successfully Sent.')]") public WebElement SentMessageTitle;
	
	//SIGNUP
	@FindBy(xpath="//input[contains(@id,'Join')]") public WebElement Register;
	@FindBy(xpath="//input[contains(@id,'join_handle')]") public WebElement SignUpUserName;
	@FindBy(xpath="//input[contains(@id,'join_password')]") public WebElement CreatePassword;
	@FindBy(xpath="//input[contains(@id,'email')]") public WebElement Email;
	@FindBy(xpath="//label[contains(@class,'gender-cc female')]") public WebElement FemaleGender;
	@FindBy(xpath="//select[contains(@id,'day')]") public WebElement Day;
	@FindBy(xpath="//select[contains(@id,'month')]") public WebElement Month;
	@FindBy(xpath="//select[contains(@id,'year')]") public WebElement Year;
	@FindBy(xpath="//textarea[contains(@id,'essay')]") public WebElement ProposalDescription;
	@FindBy(xpath="//select[contains(@id,'country')]") public WebElement Country;
	@FindBy(xpath="//select[contains(@id,'state')]") public WebElement State;
	@FindBy(xpath="//span[contains(@id,'select2-city-container')]") public WebElement SelectCity;
	@FindBy(xpath="//li[contains(text(),'Acampo')]") public WebElement City;
	@FindBy(xpath="//select[contains(@id,'city')]") public WebElement City1;

	@FindBy(xpath="//select[contains(@id,'height')]") public WebElement Height;
	@FindBy(xpath="//select[contains(@id,'weight')]") public WebElement Weight2;
	@FindBy(xpath="//select[contains(@id,'appearance')]") public WebElement Appearance;
	@FindBy(xpath="//select[contains(@id,'complexion')]") public WebElement Complexion;
	@FindBy(xpath="//select[contains(@id,'status')]") public WebElement Marital;
	@FindBy(xpath="//select[contains(@id,'education')]") public WebElement Education;
	@FindBy(xpath="//select[contains(@id,'career')]") public WebElement Career;
	@FindBy(xpath="//select[contains(@id,'religion')]") public WebElement Religion;
	@FindBy(xpath="//select[contains(@id,'ethnicity')]") public WebElement Ethnicity;
	@FindBy(xpath="//select[contains(@id,'class')]") public WebElement SocialClass;
	@FindBy(xpath="//select[contains(@id,'residency')]") public WebElement Residency;
	@FindBy(xpath="//select[contains(@id,'family')]") public WebElement Family;
	@FindBy(xpath="//select[contains(@id,'smoking')]") public WebElement Smoking;
	@FindBy(xpath="//select[contains(@id,'drinking')]") public WebElement Drinking;
	@FindBy(xpath="//select[contains(@id,'diet')]") public WebElement Childern;
	@FindBy(xpath="//select[contains(@id,'humor')]") public WebElement Personality;
	@FindBy(xpath="//select[contains(@id,'first_date')]") public WebElement NextStep;
	@FindBy(xpath="//a[contains(@href, '/content/terms')]") public WebElement Terms;
	@FindBy(xpath="//button[contains(text(),'Close')]") public WebElement Close;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement CompleteRegistration;

}




