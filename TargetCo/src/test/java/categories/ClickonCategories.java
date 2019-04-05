package categories;
import base.CommonAPI;
import data.MySQLData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.s;

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


    @Test(description = "mysql test")
    public void testPhoneCardsSql() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = null;
        try {
            list = MySQLData.getPhoneCardsFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String s : list) {
            driver.findElement(By.linkText(s)).click();

        }
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " " + s);
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

    @Test
    public void testSchool (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("School & Office Supplies")).click();
    }

    @Test
    public void testMusic (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Musical Instruments")).click();
    }

    @Test
    public void testGrocery (){
        driver.findElement(By.linkText("Categories")).click();
        driver.findElement(By.linkText("Grocery")).click();
    }
}