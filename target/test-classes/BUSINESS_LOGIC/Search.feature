Feature: Search functionality

Background: Application shows main page to user
Given User open "chrome" browser 
Given User enter url as "http://primusbank.qedgetech.com/"
When user enter "Admin" as username
When user enter "Admin" as password
When user click on Login button

@RegressionTest
Scenario: Search functionality with valid data
When user click on branches
When user select "INDIA" as contry
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user click on search button
Then application shows results for given city


