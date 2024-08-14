Feature: Login functionality

  Background: 
    Given User open chrome browser
    And User navigate to orangehrm app

  Scenario Outline: To test the login functionality with test data
    When User enter valid <id> and <pwd>
    And User click on login
    Then User should be navigated to home page
    And User close the browser

    Examples: 
      | id     | pwd      |
      | Admin  | admin123 |
      | Admin2 | admin111 |

  Scenario Outline: To test the logout functionality with test data
    When User enter valid <id> and <pwd>
    And User click on login
    Then User should be navigated to home page
    And User click on logout button
    Then User should be navigated to login page
    And User close the browser

    Examples: 
      | id    | pwd      |
      | Admin | admin123 |
