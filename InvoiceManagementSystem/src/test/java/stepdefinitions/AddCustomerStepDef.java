package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.AddCustomerPage;

public class AddCustomerStepDef extends CommonFunctions {

    AddCustomerPage addCustomer = new AddCustomerPage(driver);

    @Given("^I Open Invoice Application Home URL as \"([^\"]*)\"$")
    public void i_Open_Invoice_Application_Home_URL_as(String url1) {
       driver.get(url1);
    }

    @When("^I click Add customers sub menu from customers menu$")
    public void i_click_Add_customers_sub_menu_from_customers_menu() {
       implicitWait(5);
       addCustomer.clickMenu();
    }

    @Then("^I should landed in Add new Customer Page with message as \"([^\"]*)\"$")
    public void i_should_landed_in_Add_new_Customer_Page_with_message_as(String expectedPage) {
        addCustomer.customerPage(expectedPage);
    }

    @When("^I enter Company as \"([^\"]*)\"$")
    public void i_enter_Company_as(String companyVal) {
        addCustomer.enterCompany(companyVal);

    }

    @When("^I enter Contact Person as \"([^\"]*)\"$")
    public void i_enter_Contact_Person_as(String personval) {
        addCustomer.enterContactPerson(personval);
    }

    @When("^I enter Email Address as \"([^\"]*)\"$")
    public void i_enter_Email_Address_as(String emailVal) {
        addCustomer.enterEmail(emailVal);
       
    }

    @When("^I enter Phone as \"([^\"]*)\"$")
    public void i_enter_Phone_as(String phoneVal) {
       addCustomer.enterPhone(phoneVal);
    }

    @When("^I enter city as \"([^\"]*)\"$")
    public void i_enter_city_as(String cityVal) {
       addCustomer.enterCity(cityVal);
    }

    @When("^I enter County as \"([^\"]*)\"$")
    public void i_enter_County_as(String countyVal) {
       addCustomer.enterCounty(countyVal);
    }

    @When("^I enter Postcode as \"([^\"]*)\"$")
    public void i_enter_Postcode_as(String postVal) {
       addCustomer.enterPostal(postVal);
    }

    @When("^I enter Country as \"([^\"]*)\"$")
    public void i_enter_Country_as(String countryVal) {
        addCustomer.enterCountry(countryVal);
       
    }

    @When("^I click Add Customer Button$")
    public void i_click_Add_Customer_Button() {
        addCustomer.clickButton();
       
    }

}

