Feature: Add Customer Feature
  This Feature deals with the Adding new customer into the system.

  Background:
    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"

  Scenario: As a User,I should be able to add new customer into the system.

    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click Add customers sub menu from customers menu
    Then  I should landed in Add new Customer Page with message as "Please enter the information below."
    When  I enter Company as "ERPTraining"
    And   I enter Contact Person as "Trainer"
    And   I enter Email Address as "internship15@gmail.com"
    And   I enter Phone as "0712345678"
    And   I enter city as "London"
    And   I enter County as "Essex"
    And   I enter Postcode as "CM7 3IG"
    And   I enter Country as "UnitedKingdom"
    And   I click Add Customer Button


