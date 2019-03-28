package ResultsPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Filter extends CommonAPI{

    String url = "https://www.target.com/";

    @Test
    public void test2Day () {
        driver.findElement(By.id("search")).sendKeys("phone holder for car", Keys.ENTER);
        driver.findElement(By.linkText("Free 2-Day Shipping")).click();
    }

    @Test
    public void testOrderPickup () {
        driver.findElement(By.id("search")).sendKeys("phone holder for car", Keys.ENTER);
        driver.findElement(By.linkText("Free Order Pickup")).click();
    }

    @Test
    public void test2DAY () {
        driver.findElement(By.id("search")).sendKeys("car freshner", Keys.ENTER);
        driver.findElement(By.linkText("Free 2-Day Shipping")).click();
    }

    @Test
    public void test2 () {
        driver.findElement(By.id("search")).sendKeys("car freshner", Keys.ENTER);
        driver.findElement(By.linkText("Free Order Pickup")).click();
    }

    @Test
    public void testMoreFilters () {
        driver.findElement(By.id("search")).sendKeys("lamp", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'More filters')]")).click();
    }

}
