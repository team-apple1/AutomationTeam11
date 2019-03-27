package Search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Searchbar extends CommonAPI {
    @Test
    public void searchBar() {
        driver.findElement(By.id("orb-search-q")).sendKeys("climatechange", Keys.ENTER);
    }
    @Test
    public void searchButton() {
        driver.findElement(By.id("orb-search-q")).sendKeys("technology");
        driver.findElement(By.id("orb-search-button")).click();
    }
        @Test
        public void search() {
            driver.findElement(By.id("orb-search-q")).sendKeys("weather", Keys.ENTER);
        }
    }

