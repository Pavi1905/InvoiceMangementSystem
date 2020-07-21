package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "inputEmail")
    WebElement username;

    public void enterUserName(String usernameVal){
        username.sendKeys(usernameVal);
    }

    @FindBy(id = "inputPassword")
    WebElement password;

    public void enterPassword(String passwordVal){
        password.sendKeys(passwordVal);
    }

    @FindBy(xpath = "//button[text()=\"Login\"]")
    WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/p")
    WebElement validValidate;

    public void validValidate(String expectedText) {
        Assert.assertEquals(expectedText,validValidate.getText());
    }

    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div[2]/div/form/div[1]/p")
    WebElement invalidValidate;

    public void inValidValidate(String expectedErrorText){
        Assert.assertEquals(expectedErrorText,invalidValidate.getText());
    }
}
