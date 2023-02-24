Feature: Login

  @positive_case @seller @LGN1001
  Scenario: User want to login using correct credential
    Given User open URL "https://secondhand-store.herokuapp.com/"
    When User click login in Dashboard Page
    And User redirect to Login Page
    And User input email "qurates@yopmail.com"
    And User input password "qwertyuiop"
    And User click login
#    Then User redirect to homepage


