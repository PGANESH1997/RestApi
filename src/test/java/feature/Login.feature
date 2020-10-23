Feature: Login to cms
Scenario: Login to cms with valid data
Given User is in login page
When Enter number "8393737234" and otp "73731"
Then Home page is shown
And cms title is shown


Scenario: Login to cms with valid data
Given User is in login page
When Enter number "8123489899" and otp "383938"
Then Home page is shown
And cms title is shown