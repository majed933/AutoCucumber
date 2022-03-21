#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Important
Feature: create account facebook

Background: comon login steps
Given User is on login page

  @smoke
  Scenario Outline: Validate First Name field
    When User enters user "<username>" first name  
    Then User checkss user first name is present
    And User checks user surname is present

   
   Scenario Outline: Validate First Name field
    When User enters user "<username>" first name  
    Then User checkss user first name is present
    And User checks user surname is present

   
   @smoke
   Scenario Outline: Validate First Name field
    When User enters user "<username>" first name  
    Then User checkss user first name is present
    And User checks user surname is present

    
   Examples: 
      | username  | password | Mobile  |
      | Majed     |  bejaoui | 1234    |
      | name2     |     aaaa | 12345   |