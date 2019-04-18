package Homepage;
import base.CommonAPI;
import homepagedata.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MainTest extends CommonAPI {


    @BeforeMethod
    public void initialize() {
        homePageObj = PageFactory.initElements(driver, HomePage.class);
    }
    HomePage homePageObj = null;

    @Test //test1
    public void title() {
        TestLogger.log("Test Title");
        String title = driver.getTitle();
        Assert.assertEquals(title, "BBC - Homepage");
    }

    //Testing site links
    @Test  //test2
    public void newsTest() {
        homePageObj.clickOnNewsTab();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Home - BBC News");

    }
    @Test  //test3
    public void twitterLinkTest() {
        homePageObj.clickOnTwitterLink();
      String title =driver.getTitle();
      Assert.assertEquals(title,"BBC_HaveYourSay (@BBC_HaveYourSay) | Twitter");
    }
    @Test  //test4
    public void sportsTest() {
        homePageObj.clickOnSportTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Home - BBC Sport");
    }
    @Test  //test5
    public void weather() {
        homePageObj.clickOnWeatherTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Weather");
    }
    @Test  //test6
    public void shop() {
       homePageObj.clickOnShopTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Home page | BBC Shop");
    }
    @Test  //test7
    public void reel() {
        homePageObj.clickOnReelTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Home - BBC Reel");
    }
    @Test  //test8
    public void travel() {
        homePageObj.clickOnTravelTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC - Travel - Home");
    }
    @Test  //test9
    public void capital() {
        homePageObj.clickOnCaptitalTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC - Capital - Home");
    }
    @Test  //test10
    public void food() {
        homePageObj.clickOnFoodTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Food - Recipes and inspiration from your favourite BBC programmes and chefs");
    }
    @Test  //test11
    public void nature() {
       homePageObj.clickOnNatureTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Two - Wild Arabia");
    }
    @Test  //test12
    public void future() {
        homePageObj.clickOnFutureTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC - Future - Home");
    }
    @Test  //test13
    public void culture() {
       homePageObj.clickOnCultureTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC - Culture - Home");
    }
    @Test  //test14
    public void tv() {
        homePageObj.clickOnTvTab();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC iPlayer - BBC One Guide - Wed Apr 17 2019");
    }
    @Test  //test15
    public void persianLanguage() {
        homePageObj.clickOnPersianLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"صفحه اول - BBC News فارسی");
    }

    @Test  //test16
    public void advertiseWithUs(){
        driver.findElement(By.linkText("Advertise with us")).click();

    }

    @Test  //test17
    public void cookies(){
        homePageObj.clickOnCookiesLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Cookie & Browser Settings - Using the BBC");
    }

    @Test  //test18
    public void about() {
        homePageObj.clickOnaboutBBCLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Learn more about what we do - About the BBC");
    }

    @Test  //test19
    public void makeItDigital() {
        homePageObj.clickOnMakeItDigitalLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Make It Digital");
    }

    @Test //test20
    public void latestBusinessNews() {
       homePageObj.clickOnLatestBusinessNews();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Climate change: Central banks warn of financial risks in open letter - BBC News");
    }

    @Test  //test21
    public void trustBBCNews() {
       homePageObj.clickOnTrustBBCNewsLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Learn how the BBC is working to strengthen trust and transparency in online news - BBC News");
    }

    @Test  //test22
    public void mobileApp() {
        homePageObj.clickOnMobileAppLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"The BBC News app gives you the best of BBC News wherever you are - BBC News");
    }

    @Test //test23
    public void arabicLanguage() {
        homePageObj.clickOnArabicLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"الرئيسية - BBC News Arabic");
    }

    @Test //test24
    public void japaneseLanguage() {
       homePageObj.clickOnJapaneseLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"ホーム - BBCニュース");
    }

    @Test  //test25
    public void techNews() {
       homePageObj.clickOnTechLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Technology - BBC News");
    }

    @Test  //test26
    public void businessNews() {
        homePageObj.clickOnBusinessLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Business - BBC News");
    }

    @Test  //test26
    public void scienceNews() {
       homePageObj.clickOnScienceLink();

    }

    @Test  //test27
    public void usCanadaNews() {
        homePageObj.clickOnUsAndCanadaLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"US & Canada - BBC News");
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
        String title =driver.getTitle();
        Assert.assertEquals(title,"");
    }

    @Test //test29
    public void sportsCricket() {
      homePageObj.clickOnCricketLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Cricket - BBC Sport");
    }

    @Test  //test30
    public void localWeather() {
       homePageObj.searchForLocalWeather();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Weather");
    }

    @Test  //test31
    public void chicagoWeather() {
       homePageObj.searchForChicagoWeather();
        String title =driver.getTitle();
        Assert.assertEquals(title,"BBC Weather");
    }

    @Test  //test32
    public void bbcTechTwitter() {
    homePageObj.clickTechTwitterLink();
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
        homePageObj.clickOnSpanishLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Noticias - BBC News Mundo");
    }

    @Test
    public void chineseLanguage() {
        homePageObj.clickOnChineseLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"主页 - BBC News 中文");
    }

    @Test
    public void HindiLanguage() {
        homePageObj.clickOnHindiLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Front page - BBC News हिंदी");
    }

    @Test
    public void turkishLanguage() {
        homePageObj.clickOnturkishLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Haberler - BBC News Türkçe");
    }

    @Test
    public void urduLanguage() {
        homePageObj.clickOnUrduLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"تازہ ترین خبریں - BBC News اردو");
    }

    @Test
    public void pashtoLanguage() {
       homePageObj.clickOnPashtoLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"کور پاڼه - BBC News پښتو");
    }

    @Test
    public void russianLanguage() {
        homePageObj.clickOnRussianLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Главная - BBC News Русская служба");
    }

    @Test
    public void kirundiLanguage() {
      homePageObj.clickOnKirundiLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Urupapuro rw'itangiriro - BBC News Gahuza");
    }

    @Test
    public void veitnameseLanguage() {
        homePageObj.clickOnVietnameseLanguage();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Tin chính - BBC News Tiếng Việt");
    }

    @Test
    public void privacyPolicy() {
        homePageObj.clickOnPrivacyPolicy();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Your Information & Privacy - Using the BBC");
    }

    @Test
    public void fullVersionPrivacyPolicy() {
       homePageObj.clickOnFullPrivacyPolicy();
        String title =driver.getTitle();
        Assert.assertEquals(title,"The BBC Privacy and Cookies Policy - Using the BBC");
    }

    @Test
    public void termsOfUse() {
        homePageObj.clickOnTermsOfUse();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Terms of Use - Using the BBC");
    }

    @Test
    public void fullVersionTermsOfUse() {
        driver.findElement(By.linkText("Terms of Use")).click();
        driver.findElement(By.linkText("View the full version of the BBC Terms of Use")).click();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Terms of Use for the BBC’s digital services - Using the BBC");

    }

}