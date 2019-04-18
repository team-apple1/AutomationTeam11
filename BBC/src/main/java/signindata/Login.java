package signindata;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Login {

    @FindBy(linkText = "Sign in")
    WebElement signInLink;
    @FindBy(id = "user-identifier-input")
    WebElement userNameInput;
    @FindBy(id = "password-input")
    WebElement passwordInput;
    @FindBy(id = "submit-button")
    WebElement submitButton;


    public void clickOnSignInLink(){
        TestLogger.log("Test sign in Link");
        signInLink.click();

    }
    public void inputUserName(){
        clickOnSignInLink();
        TestLogger.log("Test user name input");
        userNameInput.sendKeys("fazimi", Keys.ENTER);
    }
    public void inputPassword(){
        inputUserName();
        TestLogger.log("Test password input");
        passwordInput.sendKeys("1234",Keys.ENTER);
    }
    public void clickSubmitButton(){
        inputPassword();
        TestLogger.log("Test submit button");
        submitButton.click();
    }
}
