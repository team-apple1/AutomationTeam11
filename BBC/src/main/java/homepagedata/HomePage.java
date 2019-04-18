package homepagedata;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    @FindBy(linkText = "News")
    public WebElement newsTab;
    @FindBy(linkText = "Have Your Say on Twitter")
    WebElement twitterLink;
    @FindBy(linkText = "Sport")
    WebElement sportTab;
    @FindBy(linkText = "Weather")
    WebElement weatherTab;
    @FindBy(linkText = "Shop")
    WebElement shopTab;
    @FindBy(linkText = "Reel")
    WebElement reelTab;
    @FindBy(linkText = "Travel")
    WebElement travelTab;
    @FindBy(linkText = "Capital")
    WebElement capitalTab;
    @FindBy(linkText = "Food")
    WebElement foodTab;
    @FindBy(linkText = "Nature")
    WebElement natureTab;
    @FindBy(linkText = "Future")
    WebElement futureTab;
    @FindBy(linkText = "Culture")
    WebElement cultureTab;
    @FindBy(linkText = "TV")
    WebElement tvTab;
    @FindBy(linkText = "Persian")
    WebElement persianLanguage;
    @FindBy(linkText = "Advertise with us")
    WebElement advertiseLink;
    @FindBy(linkText = "Cookies")
    WebElement cookiesLink;
    @FindBy(linkText = "About the BBC")
    WebElement aboutBBCLink;
    @FindBy(linkText = "Make It Digital")
    WebElement makeItDigitalLink;
    @FindBy(xpath = "//*[@class='top-list-item__headline']")
    WebElement latestBusinessNews;
    @FindBy(linkText = "Why you can trust BBC News")
    WebElement trustBBCNewsLink;
    @FindBy(xpath = "//*[@id=\"u35846271878108382\"]/div/div/div[2]/div/div[2]/a")
    WebElement mobileAppLink;
    @FindBy(xpath = "//*[@title='Arabic service']")
    WebElement arabicLanguage;
    @FindBy(xpath = "//*[@title='Japanese service']")
    WebElement JapaneseLanguage;
    @FindBy(linkText = "Tech")
    WebElement techLink;
    @FindBy(linkText = "Business")
    WebElement businessLink;
    @FindBy(linkText = "Science")
    WebElement scienceLink;
    @FindBy(linkText = "US & Canada")
    WebElement usAndCanadaLink;
    @FindBy(linkText = "Cricket")
    WebElement cricketLink;
    @FindBy(id = "ls-c-search__input-label")
    WebElement localWeather;
    @FindBy(linkText = "Twitter")
    WebElement techTwitterLink;
    @FindBy(linkText = "Facebook")
    WebElement techFacebookLink;
    @FindBy(linkText = "Spanish")
    WebElement spanishLanguage;
    @FindBy(xpath = "//*[@title='Chinese service']")
    WebElement chineseLanguage;
    @FindBy(xpath = "//*[@title='Hindi service']")
    WebElement hindiLanguage;
    @FindBy(xpath = "//*[@title='Turkish service']")
    WebElement turkishLanguage;
    @FindBy(linkText = "Urdu")
    WebElement urduLanguage;
    @FindBy(xpath = "//*[@title='Pashto service']]")
    WebElement pashtoLanguage;
    @FindBy(xpath = "//*[@title='Russian service']")
    WebElement russianLanguage;
    @FindBy(xpath = "//*[@title='Kirundi service']")
    WebElement kirundiLanguage;
    @FindBy(xpath = "///*[@title='Vietnamese']")
    WebElement vietnameseLanguage;
    @FindBy(linkText = "Privacy Policy")
    WebElement privacyPolicyLink;
    @FindBy(linkText = "View the full version of the BBC Privacy and Cookies Policy")
    WebElement fullPrivacyPolicy;
    @FindBy(linkText = "Terms of Use")
    WebElement termsOfUse;
    @FindBy(linkText = "View the full version of the BBC Terms of Use")
    WebElement fullTermsOfUse;


    public void clickOnNewsTab() {
        TestLogger.log("Test News Link");
        newsTab.click();
    }

    public void clickOnTwitterLink() {
        clickOnNewsTab();
        TestLogger.log("Test Twitter Link");
        twitterLink.click();
    }

    public void clickOnSportTab() {
        TestLogger.log("Test Sports Link");
        sportTab.click();
    }

    public void clickOnWeatherTab() {
        TestLogger.log("Test Weather Link");
        weatherTab.click();
    }

    public void clickOnShopTab() {
        TestLogger.log("Test Shop Link");
        shopTab.click();
    }

    public void clickOnReelTab() {
        TestLogger.log("Test Reel Link");
        reelTab.click();
    }

    public void clickOnTravelTab() {
        TestLogger.log("Test Travel Link");
        travelTab.click();
    }

    public void clickOnCaptitalTab() {
        TestLogger.log("Test Capital Link");
        capitalTab.click();
    }

    public void clickOnFoodTab() {
        TestLogger.log("Test Food Link");
        foodTab.click();
    }

    public void clickOnNatureTab() {
        TestLogger.log("Test Nature Link");
        natureTab.click();
    }

    public void clickOnFutureTab() {
        TestLogger.log("Test Future Link");
        futureTab.click();
    }

    public void clickOnCultureTab() {
        TestLogger.log("Test Culture Link");
        cultureTab.click();
    }

    public void clickOnTvTab() {
        TestLogger.log("Test TV Link");
        tvTab.click();
    }

    public void clickOnPersianLanguage() {
        TestLogger.log("Test Persian Language Link");
        persianLanguage.click();
    }

    public void clickOnAdvertiseLink() {
        TestLogger.log("Test Advertise With Us Link");
        advertiseLink.click();
    }

    public void clickOnCookiesLink() {
        TestLogger.log("Test Cookies Link");
        cookiesLink.click();
    }

    public void clickOnaboutBBCLink() {
        TestLogger.log("Test About the BBC Link");
        aboutBBCLink.click();
    }

    public void clickOnMakeItDigitalLink() {
        TestLogger.log("Test Make It digital Link");
        makeItDigitalLink.click();
    }

    public void clickOnLatestBusinessNews() {
        TestLogger.log("Test Latest Business News");
        latestBusinessNews.click();
    }

    public void clickOnTrustBBCNewsLink() {
        clickOnNewsTab();
        TestLogger.log("Test Trust BBC News");
        trustBBCNewsLink.click();
    }

    public void clickOnMobileAppLink() {
        clickOnNewsTab();
        TestLogger.log("Test Mobile App Link");
        mobileAppLink.click();
    }

    public void clickOnArabicLanguage() {
        TestLogger.log("Test Arabic Language Link");
        arabicLanguage.click();
    }

    public void clickOnJapaneseLanguage() {
        TestLogger.log("Test Japanese Language Link");
        JapaneseLanguage.click();
    }

    public void clickOnTechLink() {
        clickOnNewsTab();
        TestLogger.log("Test Tech Link");
        techLink.click();
    }

    public void clickOnBusinessLink() {
        clickOnNewsTab();
        TestLogger.log("Test Business Link");
        businessLink.click();
    }

    public void clickOnScienceLink() {
        clickOnNewsTab();
        TestLogger.log("Test Science Link");
        scienceLink.click();
    }

    public void clickOnUsAndCanadaLink() {
        clickOnNewsTab();
        TestLogger.log("Test US & Canada Link");
        usAndCanadaLink.click();
    }

    public void clickOnCricketLink() {
        clickOnSportTab();
        TestLogger.log("Test Cricket Link");
        cricketLink.click();
    }

    public void searchForLocalWeather() {
        clickOnWeatherTab();
        TestLogger.log("Test Search For Local Weather");
        localWeather.sendKeys("New York", Keys.ENTER);
    }

    public void searchForChicagoWeather() {
        clickOnWeatherTab();
        TestLogger.log("Test Search For Chicago Weather");
        localWeather.sendKeys("Chicago", Keys.ENTER, Keys.ENTER);
    }

    public void clickTechTwitterLink() {
        clickOnNewsTab();
        clickOnTechLink();
        TestLogger.log("Test Tech Twitter Link");
        techTwitterLink.click();
    }

    public void clickTechFacebookLink() {
        clickOnNewsTab();
        clickOnTechLink();
        TestLogger.log("Test Tech Facebook Link");
        techFacebookLink.click();
    }

    public void clickOnSpanishLanguage() {
        TestLogger.log("Test Spanish Language Link");
        spanishLanguage.click();
    }

    public void clickOnChineseLanguage() {
        TestLogger.log("Test Chinese Language Link");
        chineseLanguage.click();
    }

    public void clickOnHindiLanguage() {
        TestLogger.log("Test Hindi Language Link");
        hindiLanguage.click();
    }

    public void clickOnturkishLanguage() {
        TestLogger.log("Test turkish Language Link");
        turkishLanguage.click();
    }

    public void clickOnUrduLanguage() {
        TestLogger.log("Test Urdu Language Link");
        urduLanguage.click();
    }

    public void clickOnPashtoLanguage() {
        TestLogger.log("Test Pashto Language Link");
        pashtoLanguage.click();
    }

    public void clickOnRussianLanguage() {
        TestLogger.log("Test Russian Language Link");
        russianLanguage.click();
    }

    public void clickOnKirundiLanguage() {
        TestLogger.log("Test Kirundi Language Link");
        kirundiLanguage.click();
    }

    public void clickOnVietnameseLanguage() {
        TestLogger.log("Test Vietnamese Language Link");
        vietnameseLanguage.click();
    }

    public void clickOnPrivacyPolicy() {
        TestLogger.log("Test Privacy Policy Link");
        privacyPolicyLink.click();
    }

    public void clickOnFullPrivacyPolicy() {
        clickOnPrivacyPolicy();
        TestLogger.log("Test Full Privacy Policy Link");
        fullPrivacyPolicy.click();
    }
    public void clickOnTermsOfUse(){
        TestLogger.log("Test Terms of Use Link");
        termsOfUse.click();
    }
    public void clickOnFullTermsOfUse(){
        clickOnTermsOfUse();
        TestLogger.log("Test Full Terms of Use Link");
        fullTermsOfUse.click();
    }
}