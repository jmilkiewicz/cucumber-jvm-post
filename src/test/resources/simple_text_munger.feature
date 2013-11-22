Feature: simple text munger kata

  @foo
  Scenario: It should process a sentence "flow flow"
    Given I have a mocked munger which always returns "folw" for "flow"
      And I have an instance of my class
     When I call my method with "flow flow"
     Then I receive "folw folw"


  @bar
  Scenario: It should process a sentence "and and"
    Given I have a mocked munger which always returns "and" for "and"
    And I have an instance of my class
    When I call my method with "and and"
    Then I receive "and and"

  @fii
  Scenario: It should process a sentence "spice spice"
    Given I have a mocked munger which always returns "scipe" for "spice"
    And I have an instance of my class
    When I call my method with "spice spice"
    Then I receive "scipe scipe"