Feature: To validate the Login functionality of Inmkaes home page

Scenario: To verify the login page title of Inmakes home page
Given user launches the login page
Then the page title should be "Home | INMAKES LEARNING HUB"


Scenario Outline: To validate login with invalid credentials 
Given To launch the chrome browser and maximize the window
When to launch the url of Inmakes home page
And user has to pass the data "<emaildatas>" in email field
And user has to pass the data "<passworddatas>"in password field
And user has to click the login button
Then user has to close the browser

Examples:
|emaildatas        |passworddatas|
|umeshrh@gmail.com |password     |        
|umesh24@gmail.com |123          |           
|vishnu@gmail.com  |456          |
|ram@gmail.com     |2525         |
|suresh@gmail.com  |93546        |


