Feature: Swag Labs login

@SmokeTest
  Scenario: 1 Verify if a user will be able to login with a valid username and valid password

    Given user navigates to saucedemo Website
    When I enter correct username as "standard_user" & password as "secret_sauce"
    Then login should be successful