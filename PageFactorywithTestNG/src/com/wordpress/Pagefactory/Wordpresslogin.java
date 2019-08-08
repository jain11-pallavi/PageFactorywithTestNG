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
public class Wordpresslogin 

{    
	WebDriver driver;
	
	public Wordpresslogin (WebDriver driver)
	{
		this.driver= driver;
	}
  
	@FindBy(id="user_login") 
    @CacheLookup
	WebElement username;
    

	@FindBy(how=How.ID, using= "user_pass") 
    @CacheLookup
    WebElement password;
    
   
	@FindBy(how=How.NAME, using="wp-submit")
	@CacheLookup
	WebElement Login;
	
	public void loginwordpress(String user, String Pass)
	{
		username.sendKeys(user);
		password.sendKeys(Pass);
		Login.click();
	}
}
