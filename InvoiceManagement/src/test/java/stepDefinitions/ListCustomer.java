package stepDefinitions;


import cucumber.api.java.en.Then;

import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ListCustomer extends CommonFunctions {

    @Then("^I should be presented with List Customers page and the newly added customers should be listed on the list customer page with \"([^\"]*)\"$")
    public void iShouldBePresentedWithListCustomersPageAndTheNewlyAddedCustomersShouldBeListedOnTheListCustomerPageWith(String emailVal) {
       implicitWait(10);
        String actualemail = driver.findElement(By.xpath("//*[@id=\"fileData\"]/tbody/tr[22]/td[4]")).getText();
        Assert.assertEquals(emailVal,actualemail);
        System.out.println(actualemail);
    }
}
