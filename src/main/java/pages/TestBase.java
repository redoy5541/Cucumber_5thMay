package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	
	
	
    public static WebDriver driver;
    
    public static void initDriver() {
    	
    	
    	System.setProperty("webdriver.chrome.driver", "/Users/mehediredoy/Cucumber_May5.2024/Cucumber05_2024/drivers/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	
    	
    	
    		
    	
    	
    }
    

}
