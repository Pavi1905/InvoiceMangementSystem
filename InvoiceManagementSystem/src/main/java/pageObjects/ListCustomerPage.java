package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class ListCustomerPage {
    public ListCustomerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a/i")
    WebElement customersMenu;

    @FindBy(linkText = "List Customers")
    WebElement listCustomers;

    public void clickListMenu(){
        customersMenu.click();
        listCustomers.click();
    }

    @FindBy(xpath = "//*[@id=\"fileData_length\"]/label/select")
    WebElement pageSize;

    public void setPageSize(String pageSizeVal ){
       Select selectObj = new Select(pageSize);
       selectObj.selectByVisibleText(pageSizeVal);
    }

    @FindBy(className = "dataTables_info")
    WebElement validatePage;

    public void setValidatePage(String expectedText){
        Assert.assertEquals(expectedText,validatePage.getText());
    }
    //Add User
    @FindBy(xpath = "//*[@id=\"fileData\"]/tbody/tr[64]/td[7]/center/div/a[2]/i")
    WebElement addUser;

    public void setAddUser(){
        addUser.click();
    }

    @FindBy(xpath = "//*[@id=\"myModalLabel\"]")
    WebElement validateAddUserTitle;

    public void setValidateAddUserTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle,validateAddUserTitle.getText());
    }

    @FindBy(id = "first_name")
    WebElement firstName;

    public void setFirstName(String firstNameVal){
        firstName.sendKeys(firstNameVal);
    }

    @FindBy(id = "last_name")
    WebElement lastName;

    public void setLastName(String lastNameVal){
        lastName.sendKeys(lastNameVal);
    }

    @FindBy(id= "phone")
    WebElement phone;

    public void setPhone(String phoneVal){
        phone.sendKeys(phoneVal);
    }

    @FindBy(id = "email")
    WebElement email;

    public void setEmail(String emailVal){
        email.sendKeys(emailVal);
    }

    @FindBy(id = "password")
    WebElement password;

    public void setPassword(String passwordVal){
        password.sendKeys(passwordVal);
    }

    @FindBy(id= "password_confirm")
    WebElement confirmPassword;

    public void setConfirmPassword(String confirmPasswordVal){
        confirmPassword.sendKeys(confirmPasswordVal);
    }

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/form/div[2]/input")
    WebElement clickAddUser;

    public void setClickAddUser(){
        clickAddUser.click();
    }
}
