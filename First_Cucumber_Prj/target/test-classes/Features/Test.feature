

Feature: Facebook Login

  Scenario: Login facebook with valid credentials
    Given user navigates to facebook application
    When user enters valid credentials
    Then display user logged in successfully
    And Close browser
    
    Scenario: Login facebook with invalid credentials
    Given user navigates to facebook application
    When user enters invalid credentials
    Then display user will not be logged in successfully
    And Close Browser