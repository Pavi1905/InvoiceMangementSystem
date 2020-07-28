package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.ListCustomerPage;

public class Pagination extends CommonFunctions {

    ListCustomerPage listCustomer = new ListCustomerPage(driver);

    @When("^I click List customers sub menu from customers menu$")
    public void i_click_List_customers_sub_menu_from_customers_menu() {

        listCustomer.clickListMenu();
    }

    @When("^I select page Size as \"([^\"]*)\"$")
    public void i_select_page_Size_as(String pageSizeVal) {
        listCustomer.setPageSize(pageSizeVal);
        System.out.println(pageSizeVal);
    }

    @Then("^First Page should list \"([^\"]*)\" customers under list customer page$")
    public void first_Page_should_list_customers_under_list_customer_page(String expectedText) {

        implicitWait(10);
      listCustomer.setValidatePage(expectedText);
    }
}
