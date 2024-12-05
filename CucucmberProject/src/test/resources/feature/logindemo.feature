Feature: Login Test with Positive values and Negative username and Negative password

  Scenario: User successfully logs in with valid credentials
    Given the user is on the login page
    When the user enters "student" into the username field
    And the user enters "Password123" into the password field
    And the user clicks the Submit button
    Then the new page URL should contain "https://practicetestautomation.com/logged-in-successfully/"
    And the new page should display text containing "Congratulations student. You successfully logged in!"
    And the Log out button should be visible on the new page

  Scenario: User sees an error when logging in with an invalid username
    Given the user is on the login page
    When the user enters "incorrectUser" into the username field
    And the user enters "Password123" into the password field
    And the user clicks the Submit button
    Then an error message should be displayed
    And the error message text should be "Your username is invalid!"

  Scenario: User sees an error when logging in with an invalid password
    Given the user is on the login page
    When the user enters "student" into the username field
    And the user enters "incorrectPassword" into the password field
    And the user clicks the Submit button
    Then an error message should be displayed
    And the error message text should be "Your password is invalid!"
