Feature: Customer Export Feature

  Scenario Outline: As a Admin,I should be able to export all the available customers through export options "Excel"

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    And   I select page Size as "All"
    And   I click export option as "<export Options>"
    Then  I should be able to download all the customers with filename as "<fileName>"

    Examples:
      | export Options | fileName                         |
      | Excel          | Customers · Invoice Manager.xlsx |
      | csv            | Customers · Invoice Manager.csv  |
      | PDF            | Customers · Invoice Manager.pdf  |