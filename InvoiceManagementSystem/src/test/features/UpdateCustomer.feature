Feature: update Customer Feature
  This Feature deals with the update the customer details into the system.

  Scenario: As a User,I should be able to update the customer details into the system.

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    And   I select page Size as "All"
    When  I click Edit User Button
    And   I enter city as "London"
    And   I click update Customer Button
    Then  I should be able to update customer detail successfully with message as "×Customer Successfully Updated"
