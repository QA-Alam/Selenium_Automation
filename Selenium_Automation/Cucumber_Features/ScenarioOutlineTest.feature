Feature: Login function validations 

Scenario Outline: Login with data table 
	Given As a user i can open any browser 
	And As a user i can enter the "https://admin-demo.nopcommerce.com/" and go to the login page 
	When As a user i can enter as "<userName>" and password "<passWord>" 
	And Click on login 
	And Homepage title should be "Dashboard / nopCommerce administration" 
	And As a user i can click on logout link 
	Then Loginpage title should be "Your store. Login" 
	And Close the browser 
	
	Examples: 
		|userName            |passWord|
		|admin@yourstore.com | admin|
		|admin@yourstore.com | admin|
		
		
		
