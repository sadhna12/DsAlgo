Feature: Login page feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "tohfatul@gmail.com"
    And user enters password "Array123$$"
    And user clicks on Login button
    Then user gets the title of the home  page
    And page title should be "NumpyNinja" home page

    
    
    
     #When User enters valid Username <username>
    #And Enters valid Password <password>
    #And user clicks on Login button
    #Then user gets the title of the home  page
    #And page title should be "NumpyNinja" home page
#
     #Examples: 
      #| username     | password |
      #| Sadhna_sdet128 | sadhna123 |
      #| tom        | tom22 |
      #| siya     | siya456 |
       #| username     | password |
      #| Sadhna_sdet128 | sadhna123 |
      #| tom        | tom22 |
      #| dsportal@gmail.com     | qwerty78$ |