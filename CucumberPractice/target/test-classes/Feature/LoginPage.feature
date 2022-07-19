Feature: User successfully login into loginpage 

  Scenario: Login page title
    Given User is on login Page
    When user get the title of the page
    Then page title should be "CRMPRO"
    
    Scenario: signup button displayed
    Given User is on login Page
    Then sign up button should be displayed
    
    Scenario: User login with correct credentials
    Given User is on login Page
    When user enter username "myk3394"
    And user enter password "myk3393"
    Then user click on the login
    Then user get the title of the page
    Then page title should be "User: Md Shahbaz Khan"
    
    
 
    
    
   
  
