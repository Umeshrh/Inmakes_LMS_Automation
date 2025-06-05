Feature: To validate search and add to cart functionality in the LMS application
Scenario: To validate adding 'Software Testing Internship' course to the cart
Given the user is on the homepage 
When the user clicks the search box 
And searches for "Software Testing"
And clicks on "Add to cart" for the Software Testing Internship course
Then the button should change to "Remove from cart"

