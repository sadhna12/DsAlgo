 Feature: Pracctice question verification
 
 
 @applicationOFArray
  Scenario: Successful code execution on practice question 
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    When user clicks on practice Question 
    Then user should redirect to "practice Question"page
    Given user is on practice Question page
    When user click o "search the Array" Link
    Then The user should be redirected to "Question"page contains a question,an tryEditor with Run and Submit buttons
    Given   User is on practice Question page
    When user click on "Max Consecutive Ones" link
    Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
    Given   User is on practice Question page
    When  The user clicks "Find Numbers with Even Number of Digits" link
    Then The user should be redirected to "Question"page contains a question,an tryEditor with Run and Submit buttons 
    Given   User is on practice Question page
    When  The user clicks "Squares of a  Sorted Array" link
    Then The user should be redirected to "Question"page contains a question,an tryEditor with Run and Submit buttons 