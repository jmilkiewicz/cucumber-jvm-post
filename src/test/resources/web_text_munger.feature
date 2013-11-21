Feature: web text munger kata

  @web
  Scenario Outline: : It should process a sentence
    Given I am on the home page
     When I enter <input>
      And I press "submit"
     Then I see <outcome> as the munged text
      And I see <input> as the original


  Examples:
  | input            | outcome          |
  | "an"             | "an"            |
  | "flow flow"      | "folw folw"     |
  | "spice"          | "scipe"         |