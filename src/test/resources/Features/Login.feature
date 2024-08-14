Feature: To test login functionality

Scenario: To test login into orangehrm with valid credentials

Given User open chrome browser
And User navigate to orangehrm app
When User enter valid id and pwd
And User click on login
Then User should be navigated to home page
And User close the browser
