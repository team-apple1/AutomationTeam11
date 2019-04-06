package registriesandlist;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RegistriesListPage extends CommonAPI {

    @Test
    public void testFreeShip (){
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.linkText("Free shipping on eligible items with $35+ orders*")).click();
    }

    @Test
    public void testLearnMoreabtFreeShip (){
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.linkText("Free shipping on eligible items with $35+ orders*")).click();
        driver.findElement(By.linkText("Learn more")).click();
    }

    @Test
    public void testFeedback (){
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.linkText("pharmacy")).click();
        driver.findElement(By.xpath("//button[contains(text(),'feedback')]")).click();
        driver.findElement(By.linkText("website feedback")).click();
        driver.findElement(By.id("textArea160610")).sendKeys("you guys have a great website", Keys.ENTER);
        driver.findElement(By.linkText("submit")).click();
    }

    @Test
    public void testWedddingReg () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a wedding registry')]")).click();
    }

    @Test
    public void testBabyReg () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a baby registry')]")).click();
    }

    @Test
    public void testCollegeReg () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a college registry')]")).click();
    }

    @Test
    public void testHouseReg () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a housewarming registry')]")).click();
    }

    @Test
    public void testCustomReg () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a custom registry')]")).click();
    }

    @Test
    public void testKidList () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a kid's wish list')]")).click();
    }
    @Test
    public void testShoppingList () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'create a shopping list')]")).click();
    }

    @Test
    public void testClassList () {
        driver.findElement(By.linkText("Registries & Lists")).click();
        driver.findElement(By.xpath("//button[contains(text(),'find a class list')]")).click();
    }
}
