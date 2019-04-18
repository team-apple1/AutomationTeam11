package registrationdata;

import homepagedata.HomePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.security.Key;

public class Registration {

    @FindBy(linkText = "Sign in")
    WebElement signInLink;
    @FindBy(linkText = "Register now")
    WebElement registerNowLink;
    @FindBy(xpath = "//*[@aria-label='13 or over']")
    WebElement selectAgeLink;
    @FindBy(id ="day-input" )
    WebElement inputDay;
    @FindBy(id = "month-input")
    WebElement inputMonth;
    @FindBy(id = "year-input")
    WebElement inputYear;
    @FindBy(id = "user-identifier-input")
    WebElement inputEmail;
    @FindBy(id = "password-input")
    WebElement inputPassword;
    @FindBy(id = "submit-button")
    WebElement submitButton;

    public void clickOnSignIn(){
        TestLogger.log("Test Sign In ");
        signInLink.click();
    }

    public void clickOnRegisterNow(){
        clickOnSignIn();
        TestLogger.log("Test Register Now");
        registerNowLink.click();
    }
    public void clickOnAgeLink(){
        clickOnRegisterNow();
        TestLogger.log("Test Age Link");
        selectAgeLink.click();
    }
    public void enterDOBInfo(){
        clickOnAgeLink();
        TestLogger.log("Test date of birth entry");
        inputDay.sendKeys("10", Keys.TAB);
        inputMonth.sendKeys("12",Keys.TAB);
        inputYear.sendKeys("1992",Keys.ENTER);
    }
    public void enterInfo(){
        enterDOBInfo();
        TestLogger.log("Test email entry");
        inputEmail.sendKeys("Anonymous@gmail.com",Keys.ENTER);
        TestLogger.log("Test password entry");
        inputPassword.sendKeys("Sample1234!");
    }
    public void clickOnSubmit(){
        enterInfo();
        TestLogger.log("Test submit button");
        submitButton.click();
    }
}
