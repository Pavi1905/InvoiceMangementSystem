package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;

import pageObjects.LoginPage;

public class Login extends CommonFunctions {

    LoginPage login = new LoginPage(driver);

    @Given("^I Open Invoice Application URL as \"([^\"]*)\"$")
    public void i_Open_Invoice_Application_URL_as(String url) {

        driver.get(url);
       
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as(String userNameVal) {
        login.enterUserName(userNameVal);
       
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String passwordVal) {
        login.enterPassword(passwordVal);
       
    }

    @When("^I click login Button$")
    public void i_click_login_Button() {
        login.clickLoginButton();
       
    }

    @Then("^I should be able to successfully login and landed in Home Page with message as \"([^\"]*)\"$")
    public void i_should_be_able_to_successfully_login_and_landed_in_Home_Page_with_message_as(String expectedText) {
        login.validValidate(expectedText);
       
    }

    @Then("^I should not be able to Successfully login and ends up with an error message as \"([^\"]*)\"$")
    public void i_should_not_be_able_to_Successfully_login_and_ends_up_with_an_error_message_as(String expectedErrorText)  {
        login.inValidValidate(expectedErrorText);
    }


}
