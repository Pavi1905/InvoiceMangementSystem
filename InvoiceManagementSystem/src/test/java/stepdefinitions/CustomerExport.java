package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ListCustomerPage;

import java.io.File;
import java.util.List;

public class CustomerExport extends CommonFunctions {

    ListCustomerPage listCustomer = new ListCustomerPage(driver);

    @When("^I click export option as \"([^\"]*)\"$")
    public void i_click_export_option_as(String exportOptions)  {
        if(exportOptions.equals("Excel")) {
            WebElement exportMethod = driver.findElement(By.xpath("//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[3]/span"));
            exportMethod.click();
        }
        if(exportOptions.equals("csv")) {
          WebElement  exportMethod = driver.findElement(By.xpath("//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[2]/span"));
            exportMethod.click();
        }
        if(exportOptions.equals("PDF")) {

          WebElement  exportMethod = driver.findElement(By.xpath("//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[4]/span"));
            exportMethod.click();
            implicitWait(10);
        }
    }

    @Then("^I should be able to download all the customers with filename as \"([^\"]*)\"$")
    public void i_should_be_able_to_download_all_the_customers_with_filename_as(List<String> expectedFile)
    {
        implicitWait(10);
        File files = new File("C:\\Users\\pavia\\Downloads");
        File[] totalFiles = files.listFiles();
        System.out.println(totalFiles.length);
        for (File file:totalFiles) {
            if (expectedFile.contains(file.getName())){
                System.out.println("File is downloaded");
                break;
            }
        }
    }

}
