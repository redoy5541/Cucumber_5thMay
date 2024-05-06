package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
                    features = "classpath:features",
                    glue = "steps",
                    tags = "@Smoke1",
                    monochrome = true,
                    dryRun = false,
                    plugin = {
                    		
                    		"pretty",
                    		"html:target/reports/cucumber.html",
                    		"json:target/reports/cucumber.json"
                    		
                       }
		
 	
		)


public class LoginRunner {

}
