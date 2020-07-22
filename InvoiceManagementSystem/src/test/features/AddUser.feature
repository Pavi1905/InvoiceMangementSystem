Feature: Add User Feature
  This Feature deals with the Adding new User for newly added customers.

  Scenario: As a User,I should be able to add new user for new customers into the system.

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    When  I click Add User Button for newly added Customer
    When  I enter FirstName as "user1"
    And   I enter LastName as "ERP"
    And   I enter phone as "0798765432"
    And   I enter email as "automation@gmail.com"
    And   I enter userpassword as "selenium@123"
    And   I enter confirmpassword as "selenium@123"
    And   I click Add user Button

