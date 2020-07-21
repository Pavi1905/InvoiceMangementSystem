Feature:Pagination under List Customer Page

  Scenario Outline: As an admin,I should Validating Pagination under List Customer Page based on Page size

    Given I Open Invoice Application URL as "http://3.13.126.58/AMS3.0/auth/login/"
    When  I enter username as "admin@gic.com"
    And   I enter password as "Admin123"
    And   I click login Button
    Then  I should be able to successfully login and landed in Home Page with message as "Logged In Successfully"
    Given I Open Invoice Application Home URL as "http://3.13.126.58/AMS3.0/home"
    When  I click List customers sub menu from customers menu
    And   I select page Size as "<PageSize>"
    Then  First Page should list "<No of entries>" customers under list customer page

    Examples:
      | PageSize | No of entries                 |
      | 10       | Showing 1 to 10 of 67 entries |
      | All      | Showing 1 to 67 of 67 entries |
      | 50       | Showing 1 to 50 of 67 entries |


