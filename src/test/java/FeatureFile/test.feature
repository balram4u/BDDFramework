Feature: Login to the admin portal

  Scenario: Successful Login with Valid Credentials
    Given User Launch chrome browser
    When User opens URL "http://10.10.0.197:8080/admin"
    And User enters Email as "root" and Password as "visby1234"
    And Click on Login
    Then  Page title Should be"Dashboard / nopCommerce administration"
    When  User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser


