@tag
Feature: Login into USAC
  User will be able access the system.
@positive
  Scenario: Correct username and password
    Given user opens browser
    And user navigates to application
    And clicks agree button
    When user enters username "test.pa1@itgfirm.com"
    And user enters password "usac123!"
    And user enters submit
    Then user is able to log into system
    
 @negative    
 Scenario: Incorrect username and password
    Given user opens browser
    And user navigates to application
    And clicks agree button
    When user enters username "tesirm.com"
    And user enters password "usa23!"
    And user enters submit
    Then user is not able to log into system
    