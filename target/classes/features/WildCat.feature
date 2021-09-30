Feature: WildCat needs to be fed
  WildCat should eat

  Scenario: WildCat is hungry, so WildCat eats
    Given WildCat hunger is "true"
    When WildCat is hungry
    Then WildCat will be fed

  Scenario: WildCat is not hungry, so WildCat does not eat
    Given WildCat hunger is "false"
    When WildCat is not hungry
    Then WildCat will not be fed
