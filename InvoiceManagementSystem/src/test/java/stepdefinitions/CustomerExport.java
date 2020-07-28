package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ListCustomerPage;

import java.io.File;

public class CustomerExport extends CommonFunctions {

    ListCustomerPage listCustomer = new ListCustomerPage(driver);

    @When("^I click export option as \"([^\"]*)\"$")
    public void i_click_export_option_as(String exportExcel)  {
        for(int i=2;i<4;i++)
        {
            WebElement exportMethod = driver.findElement(By.xpath("//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a["+(i+1)+"]/span"));
            exportMethod.click();
            System.out.println(exportExcel);
        }

    }

    @Then("^I should be able to download all the customers with filename as \"([^\"]*)\"$")
    public void i_should_be_able_to_download_all_the_customers_with_filename_as(String expectedFile)
    {

    }
}
