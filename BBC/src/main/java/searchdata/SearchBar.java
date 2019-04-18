package searchdata;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchBar {

    @FindBy(id = "orb-search-q")
    WebElement searchBar;


    public void climateChangeSearch() {
        TestLogger.log("Test search");
        searchBar.sendKeys("climate change", Keys.ENTER);
    }

    public void searchButton() {
        TestLogger.log("Test search button");
        searchBar.sendKeys("Technology");
        searchBar.click();
    }

    public void searchWeather() {
        TestLogger.log("Test weather search");
        searchBar.sendKeys("weather", Keys.ENTER);
    }

    public void searchRadio() {
        TestLogger.log("Test radio search");
        searchBar.sendKeys("radio", Keys.ENTER);
    }

    public void searchBusiness() {
        TestLogger.log("Test Business search");
        searchBar.sendKeys("business", Keys.ENTER);
    }
}
