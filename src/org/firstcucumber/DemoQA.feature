
 #Author: Login DemoQA website

@tag
Feature: To register the demoqa 

@tag2
  Scenario Outline: Register demoqa login in website
    Given Go to demoqa register page
    When To enter the all values "<Firstname>" , "<Lastname>" , "<Address>" , "<Emailaddress>" , "<Phone>" , "<Gender>" , "<Hobbies>" , "<Languages>" , "<Skills>" , "<Country>" , "<SelectCountry>" , "<Year>" , "<Month>" , "<Date>" , "<Password>" , "<ConfirmPassword>"    
    And Click Submit buttton
    Then To verify sucessfully message shown or not

  Examples: 
    | Firstname | Lastname | Address | Emailaddress | Phone | Gender | Hobbies | Languages | Skills | Country | SelectCountry | Year | Month | Date | Password | ConfirmPassword | 
    | Kirupa | Karan | AnnaNagar | kiruparaj@mail123.com | 9685741425 | Male | Cricket | English | CSS | India | India | 1991 | September | 21 | Kirupa@21 | Kirupa@21 |
 