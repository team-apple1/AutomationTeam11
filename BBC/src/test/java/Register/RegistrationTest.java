package Register;

import base.CommonAPI;
import org.testng.Assert;
import registrationdata.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class RegistrationTest extends CommonAPI {

    @BeforeMethod
    public void initialize() {
        registerObj = PageFactory.initElements(driver, Registration.class);
    }
    Registration registerObj = null;

    @Test
    public void selectSignIn(){
        registerObj.clickOnSignIn();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC – Sign in");
    }



    @Test
    public void selectRegister() {
       registerObj.clickOnRegisterNow();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC – Register");
    }

    @Test
    public void selectAge() {
        registerObj.clickOnAgeLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC – Register – enter your date of birth");
    }

    @Test
    public void enterDob() {
        registerObj.enterDOBInfo();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC – Register – enter your details");
    }

    @Test
    public void enterInfo() {
        registerObj.enterInfo();

    }
    @Test
    public void submitRegistration() {
       registerObj.clickOnSubmit();
    }
}

