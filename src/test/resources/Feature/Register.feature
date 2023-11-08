Feature: Registering the demo application using data Table
Scenario: Register the demo application
 
Given User launches the webpage
When User clicks the register
And User clicks the gender checkbox
And User provides the credentials to register
    | FirstName  | LastName    |            Email        | Password    | Confirm Password |
    | Sania      | Mirza       | saniamirza@gmail.com    | SaniaMirza  |  SaniaMirza      |
And User clicks register button
Then Checking for registration
