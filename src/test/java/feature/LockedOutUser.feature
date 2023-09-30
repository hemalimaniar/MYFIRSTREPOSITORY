Feature:

  Background:
    Given user navigates to saucedemo Website


  Scenario: Verify the locked out user
    When the user enters "locked_out_user" in the username field
    Then the user enters "secret_sauce" in the password field
    And  the user clicks on the login button
    Then the user can see "Epic sadface: Sorry, this user has been locked out."  text in the page
  @hemali
  Scenario Outline:
    When I enter correct username as "<username>" & password as "<password>"
    And  the user clicks on the login button
    Then the user can see "<expectedtext>"  text in the page

    Examples:
      | username        | password | expectedtext                                        |
      | locked_out_user |secret_sauce        | Epic sadface: Sorry, this user has been locked out. |
      | locked_out_use! | secret_sauce       | Epic sadface: Username and password do not match any user in this service|