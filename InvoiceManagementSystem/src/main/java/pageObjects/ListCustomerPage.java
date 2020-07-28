package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

import java.io.File;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;

public class ListCustomerPage {

    public ListCustomerPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a/i")
    WebElement customersMenu;

    @FindBy(linkText = "List Customers")
    WebElement listCustomers;

    public void clickListMenu() {
        customersMenu.click();
        listCustomers.click();
    }

    @FindBy(xpath = "//*[@id=\"fileData_length\"]/label/select")
    WebElement pageSize;

    public void setPageSize(String pageSizeVal) {
        Select selectObj = new Select(pageSize);
        selectObj.selectByVisibleText(pageSizeVal);
    }

    @FindBy(xpath = "//*[@id=\"fileData_info\"]")
    WebElement validatePage;

    public void setValidatePage(String expectedText) {
        Assert.assertEquals(expectedText, validatePage.getAttribute("textContent"));
        System.out.println(validatePage.getAttribute("textContent"));
    }

    //Add User
    @FindBy(xpath = "//*[@id=\"fileData\"]/tbody/tr[64]/td[7]/center/div/a[2]/i")
    WebElement addUser;

    public void setAddUser() {
        addUser.getAttribute("href");
        addUser.click();
    }

    @FindBy(id = "first_name")
    WebElement firstName;

    public void setFirstName(String firstNameVal) {
        firstName.sendKeys(firstNameVal);
    }

    @FindBy(id = "last_name")
    WebElement lastName;

    public void setLastName(String lastNameVal) {
        lastName.sendKeys(lastNameVal);
    }

    @FindBy(id = "phone")
    WebElement phone;

    public void setPhone(String phoneVal) {
        phone.sendKeys(phoneVal);
    }

    @FindBy(id = "email")
    WebElement email;

    public void setEmail(String emailVal) {
        email.sendKeys(emailVal);
    }

    @FindBy(id = "password")
    WebElement password;

    public void setPassword(String passwordVal) {
        password.sendKeys(passwordVal);
    }

    @FindBy(id = "password_confirm")
    WebElement confirmPassword;

    public void setConfirmPassword(String confirmPasswordVal) {
        confirmPassword.sendKeys(confirmPasswordVal);
    }

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/form/div[2]/input")
    WebElement clickAddUser;

    public void setClickAddUser() {
        clickAddUser.click();
    }

    //Update Customer

    @FindBy(xpath = "//*[@id=\"fileData\"]/tbody/tr[9]/td[7]/center/div/a[3]/i")
    WebElement editCustomerIcon;

    public void setEditCustomer() {
        editCustomerIcon.getAttribute("href");
        editCustomerIcon.click();
    }

    @FindBy(xpath = "/html/body/div[3]/div[4]/div/form/div[2]/div/input")
    WebElement updateCustomerButton;

    public void clickUpdateCustomerButton() {
        updateCustomerButton.click();
    }

    @FindBy(css = "body > div.mainbar > div.alert.alert-success")
    WebElement validateUpdateCustomer;

    public void setValidateUpdateCustomer(String expectedMsg) {
        Assert.assertEquals(expectedMsg, validateUpdateCustomer.getAttribute("textContent"));
    }
}
