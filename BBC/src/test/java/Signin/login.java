package Signin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class login extends CommonAPI {
    @Test
    public void signInLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Test
    public void signInUserName() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("user-identifier-input")).sendKeys("fazimi", Keys.ENTER);

    }

    @Test
    public void signInPassword() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("user-identifier-input")).sendKeys("fazimi", Keys.ENTER);
        driver.findElement(By.id("password-input")).sendKeys("1234", Keys.ENTER);
    }

    @Test
    public void signInSubmit() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("user-identifier-input")).sendKeys("fazimi", Keys.ENTER);
        driver.findElement(By.id("password-input")).sendKeys("1234", Keys.ENTER);
        driver.findElement(By.id("submit-button")).click();
    }
}

