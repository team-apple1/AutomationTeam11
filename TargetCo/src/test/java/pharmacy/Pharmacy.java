package pharmacy;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Pharmacy extends CommonAPI {

    String url = "https://www.target.com/";

    @Test
    public void testPharmacy () {
        driver.findElement(By.linkText("More")).click();
        driver.findElement(By.linkText("Pharmacy")).click();
    }

    @Test
    public void testHealth () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
    }

    @Test
    public void testVitamins () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Vitamins & Supplements']"));
    }

    @Test
    public void testNutrition () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Nutrition & Weight Loss']"));
    }

    @Test
    public void testMedicines () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Medicines & Treatments']"));
    }

    @Test
    public void testCough () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Cough, Cold & Flu']"));
    }

    @Test
    public void testProbiotics () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Probiotics']"));
    }

    @Test
    public void testAllergy () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Allergy & Sinus']"));
    }

    @Test
    public void testHomeCare () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Home Health Care']"));
    }

    @Test
    public void testSexualHealth () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Sexual Health']"));
    }

    @Test
    public void testFirstAid () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='First Aid']"));
    }

    @Test
    public void testFeminine () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Feminine Products']"));
    }

    @Test
    public void testSleep () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Sleep Aids']"));
    }

    @Test
    public void testEyeCare () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Eye Care']"));
    }

    @Test
    public void testFootCare () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Foot Care']"));
    }

    @Test
    public void testEarCare () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Ear Care']"));
    }

    @Test
    public void testHumidifiers () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Humidifiers']"));
    }

    @Test
    public void testMonitors () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Home Tests & Monitors']"));
    }

    @Test
    public void testShopDeals () {
        driver.findElement(By.id("search")).sendKeys("health", Keys.ENTER);
        driver.findElement(By.xpath("//div[contains(@class, 'ItemTitle-yw3r8r-0 eZUBZY') and text()='Shop by Deals']"));
    }
}
