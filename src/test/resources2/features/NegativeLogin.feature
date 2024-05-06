
@NegativeLoginFeature
Feature: Techfios billing Negative login page functionality validation
 
 @NegativeScenario1 
 Scenario:  User should not be able to login valid credentials
            
            Given User in on the techfios login page
            When  User enters username as "demo2@codefios.com"
            When  User enters password as "abc123"
            When  User clicks on sign in button
            Then  User should be land on dashboard page 
            Then User should get a colorfull report
     
  @NegativeScenario2       
 Scenario:  User should not be able to login valid credentials
            
            Given User in on the techfios login page
            When  User enters username as "demo@codefios.com"
            When  User enters password as "abc1234"
            When  User clicks on sign in button
            Then  User should be land on dashboard page 
            Then User should get a colorfull report
           