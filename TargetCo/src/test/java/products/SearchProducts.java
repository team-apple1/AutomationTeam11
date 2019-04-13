package Products;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;


public class SearchProducts extends CommonAPI{

    String url = "https://www.target.com/";

    @Test
    public void testTV () {
        driver.findElement(By.id("search")).sendKeys("4k television", Keys.ENTER);
    }

    @Test
    public void testNike () {
        driver.findElement(By.id("search")).sendKeys("nike", Keys.ENTER);
    }

    @Test
    public void testDVDs () {
        driver.findElement(By.id("search")).sendKeys("dvds", Keys.ENTER);
    }

    @Test
    public void testPillow () {
        driver.findElement(By.id("search")).sendKeys("travel pillow", Keys.ENTER);
    }

    @Test
    public void testCoffee () {
        driver.findElement(By.id("search")).sendKeys("coffee", Keys.ENTER);
    }

    @Test
    public void testTShirts () {
        driver.findElement(By.id("search")).sendKeys("t-shirts", Keys.ENTER);
    }

    @Test
    public void testPants () {
        driver.findElement(By.id("search")).sendKeys("pants", Keys.ENTER);
    }

    @Test
    public void testJackets () {
        driver.findElement(By.id("search")).sendKeys("jackets", Keys.ENTER);
    }

    @Test
    public void testShoes () {
        driver.findElement(By.id("search")).sendKeys("shoes", Keys.ENTER);
    }

    @Test
    public void testGlasses () {
        driver.findElement(By.id("search")).sendKeys("glasses", Keys.ENTER);
    }



}
