package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.ExecutionFile;



public class Locatiors extends ExecutionFile{
	

	@FindBy(xpath="//a[contains(text(), 'WHO WE SERVE')]") public WebElement WhoWeServe;
	@FindBy(xpath="//div[contains(@id, 'Level1NavNode1')]/ul/li") public List <WebElement>  ItemsCount;

	@FindBy(xpath="//a[contains(text(), 'SUBJECTS')]") public WebElement Subjects;
	@FindBy(xpath="//a[contains(text(), 'SUBJECTS')]/parent::li/descendant::ul/li/a[contains(text(), 'Education')]") public WebElement Education;

	
	@FindBy(xpath="//a[contains(text(), 'Education')]/parent::li/descendant::ul[contains(@class, 'sub-list')]/li") public List <WebElement>  EducationItemsCount;

	
	
}




