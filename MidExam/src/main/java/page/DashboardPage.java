package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	
	 WebDriver driver;
	 
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	 
	 }

	 public void QuickDraft(WebDriver driver) {
		 
		
	 
	 }

	 @FindBy(how = How.ID, using ="title")
	 WebElement Title ;
	 

	 @FindBy(how = How.ID, using ="content")
	 WebElement Content  ;


	 @FindBy(how = How.ID, using ="save-post")
	 WebElement SaveDraft;
	 

//	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Your Recent Drafts')]/parent::div/descendant::a")
	
	 
	 
	 public void FillUpQuickDraft() {
		 
		 Title.sendKeys("Gmail");
		 Content.sendKeys("Enter valid Gmail address");
		 SaveDraft.click();
	 }

	 public void clickOnLogInButton() {
			
		 SaveDraft.click();
		
	 }
	 
	 
public String getPageTitle() {
	return driver.getTitle();
	
	
}
	
	 
		 
}
