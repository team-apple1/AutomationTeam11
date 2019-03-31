package Search;

import Data.MySqlData;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.s;

public class Searchbar extends CommonAPI {
    @Test
    public void searchBar() {
        driver.findElement(By.id("orb-search-q")).sendKeys("climatechange", Keys.ENTER);
    }

    @Test
    public void searchButton() {
        TestLogger.log("Test search for Technology");
        driver.findElement(By.id("orb-search-q")).sendKeys("technology");
        TestLogger.log("Test click search button");
        driver.findElement(By.id("orb-search-button")).click();
    }

    @Test
    public void searchWeather() {
        driver.findElement(By.id("orb-search-q")).sendKeys("weather", Keys.ENTER);
    }
    @Test
    public void searchRadio() {
        driver.findElement(By.id("orb-search-q")).sendKeys("radio", Keys.ENTER);
    }

    @Test
    public void searchBusiness() {
        driver.findElement(By.id("orb-search-q")).sendKeys("business", Keys.ENTER);
    }
    @Test
            (description = "mysql test")
    public void testSearchItemsSql() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = null;
        try {
            list = MySqlData.getresultlistFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String s : list) {
            driver.findElement(By.id("orb-search-q")).sendKeys(s,Keys.ENTER);
        }
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " " + s);
    }

}
