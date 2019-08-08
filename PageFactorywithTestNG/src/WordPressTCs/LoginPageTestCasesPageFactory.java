/**
 * 
 */
package WordPressTCs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.wordpress.Pagefactory.PostsPage;
import com.wordpress.Pagefactory.Wordpresslogin;


import Helper.BrowserFactory;

/**
 * @author pj558w
 *
 */
public class LoginPageTestCasesPageFactory

{
	
	
	@Test
	public void ValidLoginVerification() 
	{
    	WebDriver driver = BrowserFactory.startBrowser("Chrome","http://demosite.center/wordpress/wp-login.php");
        Wordpresslogin  LoginN= PageFactory.initElements(driver, Wordpresslogin.class);
	     LoginN.loginwordpress("admin", "demo123");
     }
    
	WebDriver ldriver;
	
	
   @AfterClass
   public void ClickPost()
   {  
	  
	 PostsPage pt = PageFactory.initElements(ldriver, PostsPage.class);
	 pt.PostClick();
}
}