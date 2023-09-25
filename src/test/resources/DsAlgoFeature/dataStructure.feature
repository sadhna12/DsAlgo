
Feature: Data Structures-Introduction feature

Background:
Given user has successfully logged into application
|username|password|
|tohfatul@gmail.com|Array123$$|

Scenario: Verify Data Structures-Introduction page
Given user is on home page
When user clicks on Get started button under Data Structures-Introductio module
Then user is navigated to Data Structures-Introductio Page
And  verify data structure title page
When User clicks on Time Complexity
Then The user should be redirected to "time complexity" of Data structures-Introduction
Given user is on "Data structures Time Complexity" page
When user clicks on Practice Questions button
Then The user should be redirected to "Practice Questions" of Data structures-Introduction
When  user clicks on "Try here" 
Then  The user should be redirected to a page having an tryEditor with a Run button to test







