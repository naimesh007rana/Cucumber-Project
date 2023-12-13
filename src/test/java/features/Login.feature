@Login
Feature: This feature is used to login into Simplilearn webside

  Background: 
    Given I have webside URL
    And I clicked on Login link

  @Sanity
  Scenario: Validate login success scenario
    When I enter Username
    And I enter Password
    And I click on Login button
    Then I should be navigate to Home page

  @Sanity
  Scenario: Validate login failure scenario using data parameters
    When I enter Username as "abc@gmail.com"
    And I enter Password as "Abc@1234"
    And I click on Login button
    Then I should get error message as "The email or password you have entered is invalid."

  @WIP
  Scenario Outline: Validate login failure scenario using examples
    When I enter Username as "<UserName>"
    And I enter Password as "<Password>"
    And I click on Login button
    Then I should get error message as "<ErrorMsg>"

    Examples: 
      | UserName      | Password | ErrorMsg                                           |
      | abc@gmail.com | Abc@1234 | The email or password you have entered is invalid. |
      | prq@gmail.com | Pqr@1234 | The email or password you have entered is invalid. |

  @Sanity @Regression
  Scenario: 
    Then I should get below login options
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
