package Home;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {


    @Test
    public void testRedCard (){
        driver.findElement(By.linkText("REDcard")).click();
    }

    @Test
    public void testEssentials (){
        driver.findElement(By.linkText("Household Essentials")).click();
    }

    @Test
    public void testMens (){
        driver.findElement(By.linkText("Men's")).click();
    }

    @Test
    public void testWomens (){
        driver.findElement(By.linkText("Women's")).click();
    }

    @Test
    public void testSpringBreak (){
        driver.findElement(By.linkText("Spring Break")).click();
    }

    @Test
    public void testEaster (){
        driver.findElement(By.linkText("Easter")).click();
    }

    @Test
    public void testFinds (){
        driver.findElement(By.linkText("Target Finds")).click();
    }

    @Test
    public void testKids (){
        driver.findElement(By.linkText("Kids'")).click();
    }

    @Test
    public void testBaby(){
        driver.findElement(By.linkText("Baby")).click();
    }

    @Test
    public void testHome (){
        driver.findElement(By.linkText("Home")).click();
    }

    @Test
    public void testWeeklyAd (){
        driver.findElement(By.linkText("Weekly Ad")).click();
    }

    @Test
    public void testFurniture (){
        driver.findElement(By.linkText("Furniture")).click();
    }

    @Test
    public void testPat (){
        driver.findElement(By.linkText("Patio & Garden")).click();
    }

    @Test
    public void testKitch (){
        driver.findElement(By.linkText("Kitchen & Dining")).click();
    }

    @Test
    public void testElectronics (){
        driver.findElement(By.linkText("Electronics")).click();
    }

    @Test
    public void testToys (){
        driver.findElement(By.linkText("Toys")).click();
    }

    @Test
    public void testBeauty (){
        driver.findElement(By.linkText("Beauty")).click();
    }

    @Test
    public void testGrocery (){
        driver.findElement(By.linkText("Grocery")).click();
    }

    @Test
    public void testClearance (){
        driver.findElement(By.linkText("Clearance")).click();
    }

    @Test
    public void testPatio (){
        driver.findElement(By.linkText("Patio & Garden")).click();
    }

    @Test
    public void testTerms (){
        driver.findElement(By.linkText("Terms")).click();
    }

    @Test
    public void testRecalls (){
        driver.findElement(By.linkText("Recalls")).click();
    }

    @Test
    public void testAds (){
        driver.findElement(By.linkText("Internet-Based Ads")).click();
    }

    @Test
    public void testRights (){
        driver.findElement(By.linkText("CA Privacy Rights")).click();
    }

    @Test
    public void testAct (){
        driver.findElement(By.linkText("CA Supply Chain Act")).click();
    }

    @Test
    public void testPrivacy (){
        driver.findElement(By.linkText("Privacy")).click();
    }

    @Test
    public void testCart (){
        driver.findElement(By.id("cart")).click();
    }

    @Test
    public void testTopDeals (){
        driver.findElement(By.xpath("//a[@href='#secondaryMenu']")).click();
        driver.findElement(By.id("deals-topDeals")).click();
    }


}
