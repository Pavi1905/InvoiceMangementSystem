Feature: Sorting Columns on list customer Page

  Scenario: As an admin,I Validating the Sorting Functionality of columns on the list customer page

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    And   I Click the Ascending order icon on Column "<column>"
    Then  I should be able to sort the "<column>" in Ascending order
    And   I Click the Descending order icon on column "<column>"
    Then  I should be able to sort the "<column>" in Descending order
