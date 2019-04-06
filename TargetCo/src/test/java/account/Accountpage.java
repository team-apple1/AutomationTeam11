package account;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    public void testButton (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @Test
    public void testAcc (){
        driver.findElement(By.id("account")).click();
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

    @Test
    public void testSignIn2 (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("krondo@yahoo.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("qwe321", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @Test
    public void testSignIn3 (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("prondo@nbc.com", Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("qwe321", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }

    @Test
    public void testUsername (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("username")).sendKeys("mrahman@espn.com", Keys.ENTER);
    }

    @Test
    public void testPassword (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("password")).sendKeys("qwe321", Keys.ENTER);
    }

    @Test
    public void testSignInButton (){
        driver.findElement(By.id("account")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
    }
}
