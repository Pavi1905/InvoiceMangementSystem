package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.ListCustomerPage;

public class UpdateCustomer extends CommonFunctions {

    ListCustomerPage listCustomer = new ListCustomerPage(driver);

    @When("^I click Edit User Button$")
    public void i_click_Edit_User_Button()  {
        implicitWait(10);
        listCustomer.setEditCustomer();
    }

    @And("^I click update Customer Button$")
    public void iClickUpdateCustomerButton() {
        listCustomer.clickUpdateCustomerButton();
    }

    @Then("^I should be able to update customer detail successfully with message as \"([^\"]*)\"$")
    public void i_should_be_able_to_update_customer_detail_successfully_with_message_as(String expectedMsg)  {
        listCustomer.setValidateUpdateCustomer(expectedMsg);
    }


}
