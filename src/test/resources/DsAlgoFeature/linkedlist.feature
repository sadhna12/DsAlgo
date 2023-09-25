Feature: LinkedList feature

  Background: 
    Given user has successfully logged into application
      | username           | password   |
      | tohfatul@gmail.com | Array123$$ |

 
  Scenario: LinkedList feature verification
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
     And user can see following links under Topics Covered
      | Introduction|
      | Creating Linked LIst |
      | Types of Linked List |
      | Implement Linked List in Python |
      |Traversal|
      |Insertion|
      |Deletion|
      
      
  Scenario: Successful code execution on TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Introduction
    Then user should redirect to  Introduction page
    Given user is on Introduction
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
    
    
       
  Scenario: Successful code execution on TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Creating Linked LIst
    Then user should redirect to  Creating Linked LIst page
    Given user is on Creating Linked LIst
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
   
    
    
   
  Scenario: Successful code execution of Types of Linked List TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Types of Linked List
    Then user should redirect to  Types of Linked List
    Given user is on Creating Types of Linked List
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
 
    
    
        
  Scenario: Successful code execution of Implement Linked List in Python TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Implement Linked List in Python
    Then user should redirect to  Implement Linked List in Python
    Given user is on Creating Implement Linked List in Python
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
    
 
  Scenario: Successful code execution of Traversal TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Traversal
    Then user should redirect to  Traversal
    Given user is on Traversal
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
    
   
  Scenario: Successful code execution of Insertion TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Insertion
    Then user should redirect to  Insertion
    Given user is on Insertion
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
    
   
  Scenario: Successful code execution of Deletion TryHere for  LinkedList sub-module
    Given user is on home page
    When user clicks on Get started button under LinkedList module
    Then user is navigated to LinkedList Page
    When user clicks on Deletion
    Then user should redirect to  Deletion
    Given user is on Deletion
    When user clicks on try here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    Given user is on tryEditor
    When user runs the code "print(\"Hello\")"
    Then user clicks on run button
    And user validates output
      
      