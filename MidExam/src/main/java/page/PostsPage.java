package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsPage {

	WebDriver driver;
	 
	public PostsPage(WebDriver driver) {
		this.driver=driver;
		
	 
	 }
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Your Recent Drafts')]/parent::div/descendant::a")
	WebElement Posts;
	
//	@FindBy(how = How.XPATH, using = "//h2[contains(text(),Your Recent Drafts')]/parent::dive/descendant::p")
	WebElement AllPosts;		
    public void clickOnPosts () {
    	
    	Posts.click();
    }
			
//	public void clickOnAllPosts() {
		
		//AllPosts.click();
//	}
			
}
