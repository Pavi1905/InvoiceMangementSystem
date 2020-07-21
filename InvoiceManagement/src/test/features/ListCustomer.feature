Feature: List Customer Feature
  This Feature deals with the Validating List Customer Feature.

  Background:

  Scenario Outline: As an admin, I should validate the newly added customer should be listed on the list customer page.

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    Then  I should be presented with List Customers page and the newly added customers should be listed on the list customer page with "<email>"

    Examples:
      | email                  |
      | internship19@gmail.com |