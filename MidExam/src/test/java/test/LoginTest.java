package test;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.PostsPage;
//import page.PostsPage;
import util.BrowserFactory;

public class LoginTest {
	
WebDriver driver;

@BeforeMethod

public void launchBrowser() {
	
driver = BrowserFactory.GoToBrowser();	
	
}

@Test
public void validUserShouldBeAbleToLogin() throws InterruptedException {
	
	//Take to the site
  driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	
	//Calling the login page
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
	loginpage.login("opensourcecms", "opensourcecms");
	loginpage.clickOnLogInButton();
	Thread.sleep(3000);
	
	DashboardPage Deshboard = PageFactory.initElements(driver, DashboardPage.class);
	Deshboard.FillUpQuickDraft();
	Thread.sleep(3000);
	//String expectedTitle = DashboardPage.class();

	PostsPage PostsPage = PageFactory.initElements(driver, PostsPage.class);
	PostsPage.clickOnPosts();
	//PostsPage.clickOnAllPosts();
	Thread.sleep(3000);
}
                                          
		
@AfterMethod
public void close() {
// close and quit
driver.close();
driver.quit();

}

}
