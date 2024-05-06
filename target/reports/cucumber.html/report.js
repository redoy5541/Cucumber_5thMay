$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 3,
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "id": "techfios-billing-login-page-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@loginFeature"
    }
  ]
});
formatter.before({
  "duration": 5693647667,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to login valid credentials",
  "description": "",
  "id": "techfios-billing-login-page-functionality-validation;user-should-be-able-to-login-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@loginScenario1"
    },
    {
      "line": 5,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User in on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should be land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should get a colorfull report",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_in_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 2725457666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@codefios.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 2848730917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2265697584,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 18840822709,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_land_on_dashboard_page()"
});
formatter.result({
  "duration": 13254750,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_get_a_colorfull_report()"
});
formatter.result({
  "duration": 74865917,
  "status": "passed"
});
formatter.after({
  "duration": 181642083,
  "status": "passed"
});
});