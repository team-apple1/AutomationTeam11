package Categories;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ClickonCategories extends CommonAPI{

    String url = "https://www.target.com/";

    @Test
    public void testFurniture (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Furniture")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testLuggage (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Luggage")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testDeli (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Grocery")).click();
        driver.findElement(By.linkText("Deli")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testToys (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Toys")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testBeauty (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Beauty")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testHealth (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Health")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testShoes (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }

    @Test
    public void testDJ (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Musical Instruments")).click();
        driver.findElement(By.linkText("DJ Equipment")).click();
    }

    @Test
    public void testSchoolandOffice (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("School & Office Supplies")).click();
        driver.findElement(By.linkText("Explore all")).click();
    }
}