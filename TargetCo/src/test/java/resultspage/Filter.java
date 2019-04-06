package resultspage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Filter extends CommonAPI{

    String url = "https://www.target.com/";

    @Test
    public void testXboxGames () {
        driver.findElement(By.id("search")).sendKeys("xbox", Keys.ENTER);
        driver.findElement(By.linkText("Xbox One Games")).click();
    }

    @Test
    public void testCrestToothpaste () {
        driver.findElement(By.id("search")).sendKeys("toothpaste", Keys.ENTER);
        driver.findElement(By.linkText("Crest")).click();
    }

    @Test
    public void testColgateToothpaste () {
        driver.findElement(By.id("search")).sendKeys("toothpaste", Keys.ENTER);
        driver.findElement(By.linkText("Colgate")).click();
    }

    @Test
    public void testGarnierShampoo () {
        driver.findElement(By.id("search")).sendKeys("shampoo", Keys.ENTER);
        driver.findElement(By.linkText("Garnier")).click();
    }

    @Test
    public void testMoreFilters () {
        driver.findElement(By.id("search")).sendKeys("lamp", Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(text(),'More filters')]")).click();
    }

    @Test
    public void testCookiesSnacks () {
        driver.findElement(By.id("search")).sendKeys("snacks", Keys.ENTER);
        driver.findElement(By.linkText("Cookies")).click();
    }

    @Test
    public void testChipsSnacks () {
        driver.findElement(By.id("search")).sendKeys("snacks", Keys.ENTER);
        driver.findElement(By.linkText("Chips")).click();
    }

    @Test
    public void testCompDesks () {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
        driver.findElement(By.linkText("Computer Desks")).click();
    }

    @Test
    public void testWritingDesks () {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
        driver.findElement(By.linkText("Writing Desks")).click();
    }

    @Test
    public void testCornerDesks () {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
        driver.findElement(By.linkText("Corner Desks")).click();
    }

    @Test
    public void testKidsDesks () {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
        driver.findElement(By.linkText("Kids' Desks")).click();
    }

    @Test
    public void testCraftDesks () {
        driver.findElement(By.id("search")).sendKeys("desk", Keys.ENTER);
        driver.findElement(By.linkText("Craft Desks")).click();
    }

    @Test
    public void testFeltPens() {
        driver.findElement(By.id("search")).sendKeys("pens", Keys.ENTER);
        driver.findElement(By.linkText("felt tip pens")).click();
    }

    @Test
    public void testGelPens() {
        driver.findElement(By.id("search")).sendKeys("pens", Keys.ENTER);
        driver.findElement(By.linkText("gel pens")).click();
    }

    @Test
    public void testRollerBallPens() {
        driver.findElement(By.id("search")).sendKeys("pens", Keys.ENTER);
        driver.findElement(By.linkText("rollerball pens")).click();
    }

    @Test
    public void testSpecialtyPens() {
        driver.findElement(By.id("search")).sendKeys("pens", Keys.ENTER);
        driver.findElement(By.linkText("specialty pens")).click();
    }
}
