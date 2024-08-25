Feature: Login functionality

Background: Application shows main page to user
Given User open "chrome" browser 
Given User enter url as "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Login functionality with valid credentials
When user enter "Admin" as username
When user enter "Admin" as password
When user click on Login button
Then application shows user profile to user

