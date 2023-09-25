Feature: Array feature

  Background: 
    Given user has successfully logged into application
      | username           | password   |
      | tohfatul@gmail.com | Array123$$ |

  Scenario: Array Page verification
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    And user can see following links under Topics Covered
      | Arrays in Python         |
      | Arrays Using List        |
      | Basic OPerations in List |
      | Applications of Array    |

  @Smoke
  Scenario: Successful code execution on TryHere for  Array in python sub-module
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    When user clicks on Array in python
    Then user should redirect to "Array in python page"page
    Given user is on Array in python page
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output

  @Regression
  Scenario: Successful code execution on TryHere for  Arrays using list sub-module
   Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    When user clicks on Arrays using list
    Then user should redirect to "Arrays using list"page
    Given user is on Arrays using list
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Then user clicks on run button
    And user validates output
   
   
    @basic_operation 
  Scenario: Successful code execution on TryHere for Basic Operations in Lists sub-module
     Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    When user clicks on Basic Operations in Lists
    Then user should redirect to "Basic Operations in Lists"page
    Given user is on Basic Operations in Lists
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Then user clicks on run button
    And user validates output
    
    
@applicationOFArray
  Scenario: Successful code execution on TryHere for Applications of Array sub-module
   Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
    When user clicks on Applications of Array
    Then user should redirect to "Applications of Array"page
    Given user is on Applications of Array
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Then user clicks on run button
    And user validates output
    
    
    @search_the_array
  Scenario: Successful code execution of search the array  of practice question  
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
     When user clicks on Array in python
    Then user should redirect to "Array in python page"page
    When user clicks on practice Question 
    Then user should redirect to practice Question page
    Given user is on practice Question page
    When user click on search the Array Link
   Then The user should be redirected to Question  contains a question,an tryEditor with Run and Submit buttons
    When  user write the code
    When User click on the Run Button
    And user click on the submit button
    
    @MaxConsecutiveOnes
    Scenario: Successful code execution  Max Consecutive Ones earch of practice question 
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
     When user clicks on Array in python
    Then user should redirect to "Array in python page"page
    When user clicks on practice Question 
    Then user should redirect to practice Question page
    Given user is on practice Question page
       When user click on  Max Consecutive Ones earch the Array Link
       Then The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
    #Given   User is on practice Question page
     When  user write the code
    When User click on the Run Button
    And user click on the submit button
    
    
    @Find_Numbers_with_Even_Number 
    Scenario: Successful code execution of Find Numbers with Even Number of Digits of  practice question 
     Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
     When user clicks on Array in python
    Then user should redirect to "Array in python page"page
    When user clicks on practice Question 
    Then user should redirect to practice Question page
    Given user is on practice Question page
    When  The user clicks Find Numbers with Even Number of Digits link
    Then The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons 
     When  user write the code
    When User click on the Run Button
    And user click on the submit button
    
    
     @Squares_ofSorted_Array 
    Scenario: Successful code execution of Squares of a  Sorted Array of practice question 
    Given user is on home page
    When user clicks on Get started button under Array module
    Then user is navigated to Array Page
     When user clicks on Array in python
    #Then user should redirect to Array in python page page
    When user clicks on practice Question 
    Then user should redirect to practice Question page
    Given user is on practice Question page
    #Given   User is on practice Question page
    When  The user clicks Squares of a  Sorted Array link
    Then The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons
     When  user write the code
    When User click on the Run Button
    And user click on the submit button 
    
    
    
   
     
    
   
