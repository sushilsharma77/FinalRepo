
    Feature: Login facebook.com with different scenario;
    
    Scenario: Login with valid credential
    Given user opens the browser and navigate to www.facebook.com
    When user logs in with valid credentials and clicks the login button
    Then user navigates to the home page 
    
    #Scenario: Login with invalid username
    #Given user opens the browser and navigate to www.facebook.com
    #When user logs in with invalid username and clicks the login button
    #Then user sees the some error texts 