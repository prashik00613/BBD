Feature:
Login
	  Scenario: Successful Login with Valid Credentials
	  Given User Launch Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login
   	Then Page Title should be "Dashboard / nonCommerce administration"
    When User click on log out link
    Then page Title should be "Your store. Login"
    And close browser
    
    Scenario Outline: Successful Login with Valid Credentials DDT
    Given User Launch Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And click on Login
   	Then Page Title should be "Dashboard / nonCommerce administration"
    When User click on log out link
    Then page Title should be "Your store. Login"
    And close browser
    
    Examples:
			|email|passowrd|
			|admin@yourstore.com|admin|
			|test@yourstore.com|admin|
			
			
											