Feature: Login functionality

Scenario Outline: To test the login functionality with test data 
Given User open chrome browser
And User navigate to orangehrm app
When User enter valid <id> and <pwd>
And User click on login
Then User should be navigated to home page
And User close the browser


Examples: 
|id|pwd|
|Admin|admin123|
|Admin2|admin111|
