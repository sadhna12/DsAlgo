Feature:
Home page feature

Background:
Given user has already logged into application
|username|password|
|tohfatul@gmail.com|Array123$$|

Scenario: HomePage title
Given: user is on home page
When the user gets the title page
Then  page title should be "NumpyNinja"

Scenario: Home Page data structure 
Given user is on home page
Then user gets all panes of data structure
|Data Structures-Introduction|
|Array|
|Linked List|
|Stack|
|Queue|
|Tree|
|Graph|






