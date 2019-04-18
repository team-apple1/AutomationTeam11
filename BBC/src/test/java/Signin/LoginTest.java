package Signin;

import base.CommonAPI;
import org.testng.Assert;
import signindata.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class LoginTest extends CommonAPI {
    @BeforeMethod
    public void initialize() {
        loginObj = PageFactory.initElements(driver, Login.class);
    }
    Login loginObj = null;

    @Test
    public void signInLink() {
        loginObj.clickOnSignInLink();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC – Sign in");
    }

    @Test
    public void signInUserName() {
       loginObj.inputUserName();

    }

    @Test
    public void signInPassword() {
        loginObj.inputPassword();
    }

    @Test
    public void signInSubmit() {
       loginObj.clickSubmitButton();
    }
}

