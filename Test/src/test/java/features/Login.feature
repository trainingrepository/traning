Feature: Leaftaps login
@regression@smoke
Scenario: Login with valid credentials
#Given Open the chrome browser
#And launch the application
And  Enter username as DemoSalesManager
And  Enter password as crmsfa
When Click on login button
Then Homepage should be dispalyed

@smoke
Scenario: Login with invalid credentials with parameteres
#Given Open the chrome browser
#And launch the application
And  Enter username as 'DemoSalesManager'
And  Enter password as 'crmsfar'
When Click on login button
But  Error should be dispalyed

#And  Enter username as 'DemoSalesManager' and password as 'crmsfar'
