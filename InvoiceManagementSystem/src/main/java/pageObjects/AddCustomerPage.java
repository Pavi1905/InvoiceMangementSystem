package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    public AddCustomerPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a/i")
    WebElement customersMenu;

    @FindBy(linkText = "Add Customer")
    WebElement addCustomersMenu;

    public void clickMenu(){
        customersMenu.click();
        addCustomersMenu.click();
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2/span")
    WebElement addCustomersPage;

    public void customerPage(String expectedPage){
        Assert.assertEquals(expectedPage,addCustomersPage.getText());
    }

    @FindBy(id = "company")
    WebElement company;

    public void enterCompany(String companyVal){
        company.sendKeys(companyVal);
    }

    @FindBy(id = "name")
    WebElement contactPerson;

    public void enterContactPerson(String personVal){
        contactPerson.sendKeys(personVal);
    }

    @FindBy(id = "email_address")
    WebElement emailAddress;

    public void enterEmail(String emailVal){
        emailAddress.sendKeys(emailVal);
    }

    @FindBy(id = "phone")
    WebElement phone;

    public void enterPhone(String phoneVal){
        phone.sendKeys(phoneVal);
    }

    @FindBy(id = "address")
    WebElement city;

    public void enterCity(String cityVal){
        city.sendKeys(cityVal);
    }

    @FindBy(id = "state")
    WebElement county;

    public void enterCounty(String countyVal){
        county.sendKeys(countyVal);
    }

    @FindBy(id = "postal_code")
    WebElement postalCode;

    public void enterPostal(String postVal){
        postalCode.sendKeys(postVal);
    }

    @FindBy(id = "country")
    WebElement country;

    public void enterCountry(String countryVal){
        country.sendKeys(countryVal);
    }

    @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div/input")
    WebElement clickAddCustomerButton;

    public void clickButton(){
        clickAddCustomerButton.click();
    }


}
