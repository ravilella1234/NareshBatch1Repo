Feature: User Login  
  As a user, I want to log in to the application so that I can access my account.  

  Scenario Outline:  Successful login with valid credentials  
    Given The user navigates to the login page  
    When The user enters valid email "<username>"
    And Enter valid password "<password>"
    And Clicks the login button  
    Then The user should be redirected to the dashboard  
    
    Examples:
    | username  | password  |
    | user1     | pass123   | 
    | user2     | pass456   |
    | user3     | pass789   | 
    
    
  Scenario: Login attempt with invalid credentials  
    Given The user navigates to the login page  
    When The user enters invalid email "ravilella@gmail.com"
    And Enter invalid password "ravi123456"
    And Clicks the login button  
    Then An error message Invalid username or password should be displayed  

  Scenario: Login with invalid user and valid password credentials  
    Given The user navigates to the login page  
    When The user enters invalid email "ravilella@gmail.com"
    And Enter valid password "ravi123456"
    And Clicks the login button  
    Then user should get proper warning message

  Scenario: Login with valid user and invalid password credentials  
    Given The user navigates to the login page
    When The user enters valid email "ravilella@gmail.com"
    And Enter invalid password "ravi123456"
    And Clicks the login button  
    Then user should get proper warning message