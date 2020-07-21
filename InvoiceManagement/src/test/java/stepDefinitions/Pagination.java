package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Pagination extends CommonFunctions {
    
    @When("^I click List customers sub menu from customers menu$")
    public void i_click_List_customers_sub_menu_from_customers_menu()  {
        driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[4]/a/i")).click();
        driver.findElement(By.linkText("List Customers")).click();
        
    }

    @When("^I select page Size as \"([^\"]*)\"$")
    public void i_select_page_Size_as(String PageSizeval)  {
        implicitWait(5);
        new Select(driver.findElement(By.xpath("//*[@id=\"fileData_length\"]/label/select"))).selectByVisibleText(PageSizeval);
        
    }

    @Then("^First Page should list \"([^\"]*)\" customers under list customer page$")
    public void first_Page_should_list_customers_under_list_customer_page(String expectedtxt)  {
        implicitWait(10);
        String actualtxt = driver.findElement(By.id("fileData_info")).getText();
        Assert.assertEquals(expectedtxt,actualtxt);
        System.out.println(actualtxt);
    }
}
