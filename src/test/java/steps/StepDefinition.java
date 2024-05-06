package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class StepDefinition extends TestBase{
	 
	
	 
	
	LoginPage loginpage;
	
	@Before
	public void beforeRun() {
		 
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	
	@Given("^User in on the techfios login page$")
	public void user_in_on_the_techfios_login_page()  {
		
		
		driver.get("https://www.codefios.com/ebilling/login");
		
	    
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  throws InterruptedException{
		
		
	    loginpage.enterUserName(username);
		
		
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
	   
		loginpage.enterPassword(password);
		
	}

	@When("^User clicks on sign in button$")
	public void user_clicks_on_sign_in_button()  {
		
		loginpage.clickSignInButton();
		
	    
	}

	@Then("^User should be land on dashboard page$")
	public void user_should_be_land_on_dashboard_page() {
	   
		 String expectedTitle = "Codefios";
		 String actualTitle = loginpage.getPageTitle();
		 Assert.assertEquals(expectedTitle, actualTitle);
		 
		
		 
	}
	
	@Then("^User should get a colorfull report$")
	public void user_should_get_a_colorfull_report()  {
		
		
		 ExtentReports extent;
		
		 ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("extentReport.html");
		   
	     extent = new ExtentReports();
	     extent.attachReporter(htmlreport);
	     ExtentTest  test = extent.createTest("Cucumber Test Reports", "Description");
	  
	}

	
	@After
	public void tearDown() {
		
     
	
        driver.close();
		driver.quit();
		
		
		
		
	}
	
	
	        

}
