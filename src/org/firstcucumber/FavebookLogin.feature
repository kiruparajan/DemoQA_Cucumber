	#Author: To test facebook login page

@tag
Feature: Facebook login 
    To check and validate facebook login 

  @tag1
  Scenario: To validate facebook login textbox fields and button
    Given To lanuch facebook login page 
    When To enter username and password field
  	| kirupa || pass123 |
    | karan || pass456 |
    | kirupapandian || kirupa@21 |
    And To click login button
    Then To compare actual results and expected results

  