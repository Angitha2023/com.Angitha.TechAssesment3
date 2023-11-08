Feature: To check the login functionlality of the Website. 

@ValidCredential
Scenario: Login the website using valid credentials

Given User launches the website
When User enters the valid username and password
Then User successfully loged in the application