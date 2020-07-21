Feature: Login Feature
  This feature deals with the login functionality

  Scenario: As a User I should validate the login functionality with valid credentials.

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"


  Scenario Outline: As a User I should Validate the login functionality using scenario outline

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "<username>"
    And   I enter password as "<password>"
    And   I click login Button
    Then  I should not be able to Successfully login and ends up with an error message as "<errormessage>"

    Examples:
      | username      | password | errormessage                                                   |
      | admin@gic.com | ADMIN    | The Password field is incorrect.                               |
      | admin@gic.com |          | The Password field is required.                                |
      |               | Admin123 | The Identity field is required.                                |
      |               |          | The Identity field is required.The Password field is required. |