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
@tag
Feature: create account facebook

Background: comon login steps
Given User is on login page
  @tag1
  Scenario: Validate First Name field
    When User enters first name
    Then User checks user first name is present
    Then close browser
    
  @tag2
  Scenario: Validate create user multiple fields
    When User enters user "Majed" first name
    And User enters user surname
    Then User checkss user first name is present
    And User checks user surname is present
    But User Mobile field should be blank