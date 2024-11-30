Feature: User Login  
  As a user, I want to log in to the application so that I can access my account.  

Background:
	Given The user navigates to the login page

@SmokeTest @Regression @Login  @valid-credentials
  Scenario Outline:  Successful login with valid credentials   
		When The user enters valid email "<username>"
		And Enter valid password "<password>"
 		And Clicks the login button  
   	Then The user should be redirected to the dashboard  
    
    Examples:
    | username  | password  |
    | user1     | pass123   | 
    | user2     | pass456   |
    | user3     | pass789   | 
    
    
@SmokeTest @Regression @Login  @invalid-credentials
  Scenario: Login attempt with invalid credentials    
    When The user enters invalid email "ravilella@gmail.com"
    And Enter invalid password "ravi123456"
    And Clicks the login button  
    Then An error message Invalid username or password should be displayed  

@Regression @Login  @invalid-valid-credentials
  Scenario: Login with invalid user and valid password credentials  
    When The user enters invalid email "ravilella@gmail.com"
    And Enter valid password "ravi123456"
    And Clicks the login button  
    Then user should get proper warning message

@Regression @Login  @valid-invalid-credentials
  Scenario: Login with valid user and invalid password credentials  
    When The user enters valid email "ravilella@gmail.com"
    And Enter invalid password "ravi123456"
    And Clicks the login button  
    Then user should get proper warning message