package stores;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchStores extends CommonAPI{

    String url = "https://www.target.com/";

    @Test //test1
    public void atlantaStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("atlanta", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("GA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void charlotteStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("charlotte", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("NC")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void losangelesStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("los angeles", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("CA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void sanfranciscoStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("san francisco", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("CA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void chicagoStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("chicago", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("IL")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void arlingtonStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("arlington", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("VA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void bostonStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("boston", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("MA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void philadelphiaStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("philadelphia", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("PA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void miamiStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("miami", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("FL")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void detroitStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("detroit", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("MI")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void portlandStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("portland", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("OR")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void clevelandStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("cleveland", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("OH")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void sanantonioStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("san antonio", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("TX")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void phoenixStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("phoenix", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("AZ")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void neworleansStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("new orleans", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("LA")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void denverStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("denver", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("CO")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void okcStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("oklahoma city", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("OK")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void kansasStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("kansas city", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("KS")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void omahaStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("omaha", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("NE")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }

    @Test
    public void baltimoreStores() {
        driver.findElement(By.linkText("Find Stores")).click();
        driver.findElement(By.xpath("//button[contains(text(),'enter zip or city, state')]")).click();
        driver.findElement(By.id("city")).sendKeys("baltimore", Keys.ENTER);
        driver.findElement(By.xpath("//button[@aria-label='state']")).click();
        driver.findElement(By.linkText("MD")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find store')]")).click();
    }
}

