Feature: Test Application login

Scenario: test login with valid credentials
Given Open firefox browser and navigate to url
When I enter valid "sahils" and valid "t3stf1rst"
Then Home page should appear 
