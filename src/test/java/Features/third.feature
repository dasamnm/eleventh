Feature: Wiki

  
  Scenario: Wikipedia search
    Given i am on wikipedia page
    When i enter text in searchbox
    And click on search button
    Then results should be displayed
    
    Scenario: merge conflict
    
    Scenario: new scenario added by another
    
