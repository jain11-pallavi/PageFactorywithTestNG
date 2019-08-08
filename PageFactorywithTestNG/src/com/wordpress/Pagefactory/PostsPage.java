/**
 * 
 */
package com.wordpress.Pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pj558w
 *
 */
public class PostsPage 

{

	   WebDriver driver;
		
		public PostsPage (WebDriver ldriver)
		
		{ this.driver =ldriver;}
	
	


	@FindBy(how=How.CLASS_NAME, using="wp-menu-name")
    @CacheLookup
    WebElement Posts;
    
   // @FindBy(how=How.LINK_TEXT, using ="href=\"http://demosite.center/wordpress/wp-admin/post-new.php\"")
   // @CacheLookup
    // WebElement Addnew;
    
    public void PostClick ()
    {
    	Posts.click();
    }
    
    
    
}
