Feature: Login into application 

Scenario Outline: Positive test validating login 
	Given Initialize the browser with Chrome 
	And Navigate to <url> site 
	And Click on login link on homepage to land on Secure Sign In page. 
	When User enters <username> and <password> and logs in 
	Then Verify that user is successfully logged in 
	
	Examples: 
	|username			|password	|url							|
	|nbisht30@yahoo.com	|google123	|http://www.qaclickacademy.com/	|
	

	