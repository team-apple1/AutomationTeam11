package Register;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class Registration extends CommonAPI {
    @Test
    public void selectRegister() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Register now")).click();
    }

    @Test
    public void selectAge() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Register now")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[2]")).click();
    }

    @Test
    public void enterDob() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Register now")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[2]")).click();
        driver.findElement(By.id("day-input")).sendKeys("10", Keys.TAB);
        driver.findElement(By.id("month-input")).sendKeys("12", Keys.TAB);
        driver.findElement(By.id("year-input")).sendKeys("1992", Keys.ENTER);

    }

    @Test
    public void enterInfo() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Register now")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[2]")).click();
        driver.findElement(By.id("day-input")).sendKeys("10", Keys.TAB);
        driver.findElement(By.id("month-input")).sendKeys("12", Keys.TAB);
        driver.findElement(By.id("year-input")).sendKeys("1992", Keys.ENTER);
        driver.findElement(By.id("user-identifier-input")).sendKeys("@gmail.com", Keys.ENTER);
        driver.findElement(By.id("password-input")).sendKeys("1234");

    }
    @Test
    public void submitRegistration() {
        TestLogger.log("Test Sign in Link");
        driver.findElement(By.linkText("Sign in")).click();
        TestLogger.log("Test Register now Link");
        driver.findElement(By.linkText("Register now")).click();
        TestLogger.log("Test 13 Or Over Button");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/div[2]/div[2]/div/div[3]/fieldset/div[1]/a[2]")).click();
        TestLogger.log("Test Day Input");
        driver.findElement(By.id("day-input")).sendKeys("10", Keys.TAB);
        TestLogger.log("Test Month Input");
        driver.findElement(By.id("month-input")).sendKeys("12", Keys.TAB);
        TestLogger.log("Test Year Input");
        driver.findElement(By.id("year-input")).sendKeys("1992", Keys.ENTER);
        TestLogger.log("Test Email Input");
        driver.findElement(By.id("user-identifier-input")).sendKeys("@gmail.com", Keys.ENTER);
        TestLogger.log("Test Password Input");
        driver.findElement(By.id("password-input")).sendKeys("1234");
        TestLogger.log("Test Submit Button");
        driver.findElement(By.id("submit-button")).click();
    }
}

