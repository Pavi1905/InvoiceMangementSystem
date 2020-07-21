package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends CommonFunctions {
    @Given("^I Open Invoice Application URL as \"([^\"]*)\"$")
    public void i_Open_Invoice_Application_URL_as(String url)  {
        driver.get(url);
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as(String emailVal)  {
        driver.findElement(By.id("inputEmail")).sendKeys(emailVal);
        
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String passwordVal)  {
        driver.findElement(By.id("inputPassword")).sendKeys(passwordVal);
        
    }

    @When("^I click login Button$")
    public void i_click_login_Button()  {
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
        
    }

    @Then("^I should be able to successfully login and landed in Home Page with message as \"([^\"]*)\"$")
    public void iShouldBeAbleToSuccessfullyLoginAndLandedInHomePageWithMessageAs(String ExpectedMsg) {
        String ActualMsg = driver.findElement(By.xpath("/html/body/div[2]/div[1]/p")).getText();
        Assert.assertEquals(ExpectedMsg,ActualMsg);
        System.out.println(ActualMsg);

    }

    @Then("^I should not be able to Successfully login and ends up with an error message as \"([^\"]*)\"$")
    public void iShouldNotBeAbleToSuccessfullyLoginAndEndsUpWithAnErrorMessageAs(String expectederrormsg)  {
        String ActualerrorMsg = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/div/form/div[1]/p")).getText();
        Assert.assertEquals(expectederrormsg,ActualerrorMsg);
        System.out.println(ActualerrorMsg);

    }
}
