/**
 * 
 */
package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author pj558w
 *
 */
public class BrowserFactory

{    static WebDriver driver;
 
   public static WebDriver startBrowser ( String browsername, String url)
   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pj558w\\chromedriver.exe");
	
	if(browsername.equalsIgnoreCase("firefox"))
			{ driver= new FirefoxDriver();
			
			} 
	
	else if (browsername.equalsIgnoreCase("Chrome"))
			{ 
		    driver= new ChromeDriver(); 
		     }
	else if (browsername.equalsIgnoreCase("IE"))
			 {
		       driver=new InternetExplorerDriver();
			 }
			
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
			
   }
}
