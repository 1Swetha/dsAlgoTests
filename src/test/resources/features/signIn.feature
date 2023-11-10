
Feature: signIn to DsAlgo portal

Scenario Outline: sign into dsAlgo portal with invalid credential
   Given user navigates to portal
   When user click on getstarted
   Then title of the sign in page is "NumpyNinja"
   When user click on the signIn button
   Then user enter the invalid username "<Username>" and "<Password>"
   #And user enter the valid password "<Password>"
   Then click on login button
   Then User shoud get error message "Please fill out this field." or "Invalid Username and Password" if the fields are "<Username>" "<Password>" 
    
    Examples:
    | Username | Password |
    |  				 |     			|
    | warriors | test 		|
    |          | test@1234 |
    | warriors |           |
     
     
  Scenario Outline: sign into dsAlgo portal with valid credential
   Given user navigates to portal
   When user click on getstarted
   Then title of the sign in page is "NumpyNinja"
   When user click on the signIn button
   Then user enter the username "<Username>" 
   And user enter the password "<Password>"
   Then click on login button
   
    
    Examples:
    | Username | Password |
    | warriors | test@1234    |
     
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
