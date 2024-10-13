Feature: Login Page	
		
  	Scenario Outline: Test Login Page 
  	Given user is already on LoginPage
		When user enters "<username>" and "<Password>"
    And user click on Login button    
    Then user is navigated to home page  
   
    
    Examples: 
    | username  | Password |       
    |Admin|admin123|
    