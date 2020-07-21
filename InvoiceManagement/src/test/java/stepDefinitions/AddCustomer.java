package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddCustomer extends CommonFunctions {
    @Given("^I Open Invoice Application Home URL as \"([^\"]*)\"$")
    public void i_Open_Invoice_Application_Home_URL_as(String homeurl)  {
        driver.get(homeurl);

    }

    @When("^I click Add customers sub menu from customers menu$")
    public void i_click_Add_customers_sub_menu_from_customers_menu()  {
        implicitWait(10);
            driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[4]/a/i")).click();
        driver.findElement(By.linkText("Add Customer")).click();

    }
    @Then("^I should landed in Add new Customer Page with message as \"([^\"]*)\"$")
    public void i_should_landed_in_Add_new_Customer_Page_with_message_as(String ExpectedPage) {
        String ActualPage = driver.findElement(By.xpath("/html/body/div[3]/div[2]/h2/span")).getText();
        Assert.assertEquals(ExpectedPage,ActualPage);
        System.out.println(ActualPage);
        
    }

    @When("^I enter Company as \"([^\"]*)\"$")
    public void iEnterCompanyAs(String companyVal)  {
        driver.findElement(By.id("company")).sendKeys(companyVal);
    }


    @When("^I enter Contact Person as \"([^\"]*)\"$")
    public void iEnterContactPersonAs(String personVal)  {
        driver.findElement(By.id("name")).sendKeys(personVal);
        
    }

    @When("^I enter Email Address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String emailVal)  {
        driver.findElement(By.id("email_address")).sendKeys(emailVal);

    }

    @When("^I enter Phone as \"([^\"]*)\"$")
    public void iEnterPhoneAs(String phoneVal)  {
        driver.findElement(By.id("phone")).sendKeys(phoneVal);
        
    }

    @When("^I enter city as \"([^\"]*)\"$")
    public void iEntercityAs(String cityVal)  {
        driver.findElement(By.id("address")).sendKeys(cityVal);
        
    }

    @When("^I enter County as \"([^\"]*)\"$")
    public void iEnterCountyAs(String countyVal)  {
        driver.findElement(By.id("state")).sendKeys(countyVal);
        
    }

    @When("^I enter Postcode as \"([^\"]*)\"$")
    public void iEnterPostcodeAs(String postval)  {
        driver.findElement(By.id("postal_code")).sendKeys(postval);

    }

    @When("^I enter Country as \"([^\"]*)\"$")
    public void iEnterCountryAs(String countryVal)  {
        driver.findElement(By.id("country")).sendKeys(countryVal);
    }

    @Then("^I click Add Customer Button$")
    public void i_click_Add_Customer_Button() {
        driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/input")).click();
        implicitWait(5);
    }

    @Then("^I should be able to add new customer into the system$")
    public void i_should_be_able_to_add_new_customer_into_the_system() {
        
    }


}
