package Account;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Accountpage extends CommonAPI {

    @Test
    public void testAccount (){
        driver.findElement(By.id("account")).click();
    }

    @Test
    public void testSignin (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("mrahman@gmail.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("abc123", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @Test
    public void testOrders (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Orders")).click();
    }

    @Test
    public void testGiftCards (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Gift Cards")).click();
    }

    @Test
    public void testCreateAccount (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Create account")).click();
    }

    @Test
    public void testMyStore (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("My store")).click();
    }

    @Test
    public void testSignIn (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("jrondo@yahoo.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("qwe321", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }
}
