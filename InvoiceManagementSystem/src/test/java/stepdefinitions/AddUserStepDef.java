package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.ListCustomerPage;

public class AddUserStepDef extends CommonFunctions {

    ListCustomerPage listCustomer = new ListCustomerPage(driver);

    @When("^I click Add User Button for newly added Customer$")
    public void i_click_Add_User_Button_for_newly_added_Customer()  {
        implicitWait(10);
        listCustomer.setAddUser();
        
    }

    @When("^I enter FirstName as \"([^\"]*)\"$")
    public void i_enter_FirstName_as(String firstnameVal)  {
        listCustomer.setFirstName(firstnameVal);
        
    }

    @When("^I enter LastName as \"([^\"]*)\"$")
    public void i_enter_LastName_as(String lastNameVal)  {
        listCustomer.setLastName(lastNameVal);
    }

    @When("^I enter phone as \"([^\"]*)\"$")
    public void iEnterPhoneAs(String phoneVal) {
        listCustomer.setPhone(phoneVal);
    }

    @When("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String emailVal)  {
        listCustomer.setEmail(emailVal);
        
    }

    @When("^I enter userpassword as \"([^\"]*)\"$")
    public void i_enter_userpassword_as(String passwordVal)  {
        listCustomer.setPassword(passwordVal);
        
    }

    @When("^I enter confirmpassword as \"([^\"]*)\"$")
    public void i_enter_confirmpassword_as(String confirmPasswordVal)  {
        listCustomer.setConfirmPassword(confirmPasswordVal);
        
    }

    @When("^I click Add user Button$")
    public void i_click_Add_user_Button()  {
        listCustomer.setClickAddUser();
        
    }

}
