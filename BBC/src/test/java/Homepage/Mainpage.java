package Homepage;
import Data.MySqlData;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.s;

public class Mainpage extends CommonAPI {

    @Test //test1
    public void title() {
        TestLogger.log("Test Title");
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Homepage");
    }

    //Testing site links
    @Test  //test2
    public void news() {
        TestLogger.log("Test News Link");
        driver.findElement(By.linkText("News")).click();

    }

    @Test  //test3
    public void twitterLink() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Have Your Say on Twitter")).click();
    }

    @Test  //test4
    public void sports() {
        TestLogger.log("Test Sports Link");
        driver.findElement(By.linkText("Sport")).click();
    }

    @Test  //test5
    public void weather() {
        driver.findElement(By.linkText("Weather")).click();
    }

    @Test  //test6
    public void shop() {
        driver.findElement(By.linkText("Shop")).click();
    }

    @Test  //test7
    public void reel() {
        driver.findElement(By.linkText("Reel")).click();
    }

    @Test  //test8
    public void travel() {
        driver.findElement(By.linkText("Travel")).click();
    }

    @Test  //test9
    public void capital() {
        driver.findElement(By.linkText("Capital")).click();
    }

    @Test  //test10
    public void food() {
        driver.findElement(By.linkText("Food")).click();
    }

    @Test  //test11
    public void nature() {
        driver.findElement(By.linkText("Nature")).click();
    }

    @Test  //test12
    public void future() {
        driver.findElement(By.linkText("Future")).click();
    }

    @Test  //test13
    public void culture() {
        driver.findElement(By.linkText("Culture")).click();
    }

    @Test  //test14
    public void tv() {
        driver.findElement(By.linkText("TV")).click();
    }

    @Test  //test15
    public void persianLanguage() {
        driver.findElement(By.linkText("Persian")).click();
    }

    @Test  //test16
    public void contact() {
        driver.findElement(By.linkText("Contact the BBC")).click();

    }

    @Test  //test17
    public void faqs() {
        driver.findElement(By.linkText("Contact the BBC")).click();
        driver.findElement(By.linkText("Got a question? Try our FAQs")).click();
    }

    @Test  //test18
    public void about() {
        driver.findElement(By.linkText("About the BBC")).click();
    }

    @Test  //test19
    public void makeItDigital() {
        driver.findElement(By.linkText("Make It Digital")).click();
    }

    @Test //test20
    public void latestBusinessNews() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[6]/div/div/div[2]/div/ul/li[1]/a/h3")).click();
    }

    @Test  //test21
    public void trustBBCNews() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Why you can trust BBC News")).click();
    }

    @Test  //test22
    public void mobileApp() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.xpath("//*[@id=\"u3227339487057179\"]/div/div/div[2]/div/div[2]/a")).click();
    }

    @Test //test23
    public void arabicLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[1]/a/span[1]")).click();
    }

    @Test //test24
    public void japaneseLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[10]/a/span[1]")).click();
    }

    @Test  //test25
    public void techNews() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Tech")).click();
    }

    @Test  //test26
    public void businessNews() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Business")).click();
    }

    @Test  //test26
    public void scienceNews() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Science")).click();
    }

    @Test  //test27
    public void usCanadaNews() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("US & Canada")).click();
    }

    @Test  //test28 //failed
    public void newsAlertSignup() {
        TestLogger.log("Test News Link");
        driver.findElement(By.linkText("News")).click();
        TestLogger.log("Test Business Link");
        driver.findElement(By.linkText("Business")).click();
        TestLogger.log("Test News Services");
        driver.findElement(By.xpath("//*[@id=\"bbc-news-services\"]/div/ul/li[3]/a")).click();
        TestLogger.log("Test Sign up Link");
        driver.findElement(By.linkText("Sign up here")).click();
        TestLogger.log("Input Information Test");
        driver.findElement(By.id("email")).sendKeys("Anonymous@gmail.com", Keys.ENTER);
    }

    @Test //test29
    public void sportsCricket() {
        driver.findElement(By.linkText("Sport")).click();
        driver.findElement(By.linkText("Cricket")).click();
    }

    @Test  //test30
    public void localWeather() {
        driver.findElement(By.linkText("Weather")).click();
        driver.findElement(By.id("ls-c-search__input-label")).sendKeys("New York", Keys.ENTER);
    }

    @Test  //test31
    public void chicagoWeather() {
        driver.findElement(By.linkText("Weather")).click();
        driver.findElement(By.id("ls-c-search__input-label")).sendKeys("Chicago", Keys.ENTER);
    }

    @Test  //test32
    public void bbcTechTwitter() {
        TestLogger.log("Test News Link");
        driver.findElement(By.linkText("News")).click();
        TestLogger.log("Test Tech Link");
        driver.findElement(By.linkText("Tech")).click();
        TestLogger.log("Test Twitter Link");
        driver.findElement(By.linkText("Twitter")).click();
    }

    @Test  //test33
    public void bbcTechFacebook() {
        TestLogger.log("Test News Link");
        driver.findElement(By.linkText("News")).click();
        TestLogger.log("Test Tech Link");
        driver.findElement(By.linkText("Tech")).click();
        TestLogger.log("Test Facebook Link");
        driver.findElement(By.linkText("Facebook")).click();

    }

    @Test
    public void spanishLanguage() {
        driver.findElement(By.linkText("Spanish")).click();
    }

    @Test
    public void chineseLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[5]/a/span[1]")).click();
    }

    @Test
    public void HindiLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[8]/a/span[1]")).click();
    }

    @Test
    public void turkishLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[25]/a/span[1]")).click();
    }

    @Test
    public void urduLanguage() {
        driver.findElement(By.linkText("Urdu")).click();
    }

    @Test
    public void pashtoLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[16]/a/span[1]")).click();
    }

    @Test
    public void russianLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[19]/a/span[1]")).click();
    }

    @Test
    public void kirundiLanguage() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/section[14]/div/div/div[2]/ul/li[12]/a/span[1]")).click();
    }
}


