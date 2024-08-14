Feature: To test the login function

Scenario: User should be able to login with valid credentials

Given User open chrome browser
And User navigate to orangehrm app
When User enter valid id and pwd
And User click on login
Then User should be navigated to home page
And User logout of app
And User close the browser
