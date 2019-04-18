package Search;

import data.MySqlData;
import base.CommonAPI;
import org.testng.Assert;
import searchdata.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.s;

public class SearchBarTest extends CommonAPI {
    @BeforeMethod
    public void initialize() {
        searchObj = PageFactory.initElements(driver, SearchBar.class);
    }

    SearchBar searchObj = null;

    @Test
   public void search1(){
        searchObj.climateChangeSearch();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Search results for climate change");

}
    @Test
    public void searchButton() {
        searchObj.searchButton();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Homepage");
    }

    @Test
    public void searchWeather() {
        searchObj.searchWeather();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Search results for weather");
    }
    @Test
    public void searchRadio() {
        searchObj.searchRadio();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Search results for radio");
    }

    @Test
    public void searchBusiness() {
        searchObj.searchBusiness();
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Search results for business");
    }
    @Test//mysql test
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
