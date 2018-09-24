	#Author: portalzoniac

@tag
Feature: To save new candidate
  
  @tag2
  Scenario Outline: Create new candidate and list the view
    Given Login zoniac website "<Corpcode>","<Userid>","<Password>"
    And Click and go to candidate module 
    And Click quick candidate button
    When To enter the all details "<FirstName>","<LastName>","<Phone>","<Mobile>","<CandidateType>"
    And click save option
    Then To view the created candidate from the list

    Examples: 
      | FirstName | LastName | Phone | Mobile | CandidateType	| Corpcode | Userid | Password |
      | Mouli | Chandran | 0124656 |	968787334 | 1099 | TESTQA | admin | admin |
      | Moorthy | Kevin | 3265989| 986548745 | W2 | TESTQA | admin | admin |
