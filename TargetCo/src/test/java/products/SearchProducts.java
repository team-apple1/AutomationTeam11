package products;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;


public class SearchProducts extends CommonAPI {

    String url = "https://www.target.com/";

    @Test
    public void testTV() {
        driver.findElement(By.id("search")).sendKeys("4k television", Keys.ENTER);
    }

    @Test
    public void testNike() {
        driver.findElement(By.id("search")).sendKeys("nike", Keys.ENTER);
    }

    @Test
    public void testDVDs() {
        driver.findElement(By.id("search")).sendKeys("dvds", Keys.ENTER);
    }

    @Test
    public void testPillow() {
        driver.findElement(By.id("search")).sendKeys("travel pillow", Keys.ENTER);
    }

    @Test
    public void testCoffee() {
        driver.findElement(By.id("search")).sendKeys("coffee", Keys.ENTER);
    }

    @Test
    public void testTShirts() {
        driver.findElement(By.id("search")).sendKeys("t-shirts", Keys.ENTER);
    }

    @Test
    public void testPants() {
        driver.findElement(By.id("search")).sendKeys("pants", Keys.ENTER);
    }

    @Test
    public void testJackets() {
        driver.findElement(By.id("search")).sendKeys("jackets", Keys.ENTER);
    }

    @Test
    public void testShoes() {
        driver.findElement(By.id("search")).sendKeys("shoes", Keys.ENTER);
    }

    @Test
    public void testGlasses() {
        driver.findElement(By.id("search")).sendKeys("glasses", Keys.ENTER);
    }

    @Test
    public void testCandy() {
        driver.findElement(By.id("search")).sendKeys("candy", Keys.ENTER);
    }

    @Test
    public void testDesk() {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
    }

    @Test
    public void testLuggage() {
        driver.findElement(By.id("search")).sendKeys("luggage", Keys.ENTER);
    }

    @Test
    public void testHat() {
        driver.findElement(By.id("search")).sendKeys("hat", Keys.ENTER);
    }

    @Test
    public void testBag() {
        driver.findElement(By.id("search")).sendKeys("bag", Keys.ENTER);
    }

    @Test
    public void testBeats() {
        driver.findElement(By.id("search")).sendKeys("beats", Keys.ENTER);
    }

    @Test
    public void testBike() {
        driver.findElement(By.id("search")).sendKeys("bike", Keys.ENTER);
    }

    @Test
    public void testSony() {
        driver.findElement(By.id("search")).sendKeys("sony", Keys.ENTER);
    }

    @Test
    public void testPlates() {
        driver.findElement(By.id("search")).sendKeys("plates", Keys.ENTER);
    }

    @Test
    public void testAdidas() {
        driver.findElement(By.id("search")).sendKeys("adidas", Keys.ENTER);
    }

    @Test
    public void testSunGlasses() {
        driver.findElement(By.id("search")).sendKeys("sunglasses", Keys.ENTER);
    }

    @Test
    public void testCD() {
        driver.findElement(By.id("search")).sendKeys("cd", Keys.ENTER);
    }

    @Test
    public void testChapStick() {
        driver.findElement(By.id("search")).sendKeys("chapstick", Keys.ENTER);
    }
}
