Feature: My first demo feature

  @QA
  Scenario: My first demo test
    Given I open test site
    When I fill "Париж" into form
    Then I see greeting message

  @QA
  Scenario: My second demo test
    Given I open test site
    When I fill "Лондон" into form
    Then I see greeting message

  @QA
  Scenario: My third demo test
    Given I open test site
    When I fill "Милан" into form
    Then I see greeting message