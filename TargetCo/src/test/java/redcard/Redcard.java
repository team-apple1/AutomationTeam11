package redcard;
import base.CommonAPI;
import data.MySQLData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.s;


public class Redcard extends CommonAPI{

    String url = "https://www.target.com/";


    @Test(description = "mysql test")
    public void testRedCardBenefitsSql() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = null;
        try {
            list = MySQLData.getRedCardBenefitsFromDB();
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
    public void testRedCardpage () {
        driver.findElement(By.linkText("REDcard")).click();
    }

    @Test
    public void testApplicationC () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Apply for credit online")).click();
    }

    @Test
    public void testApplicationD () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Apply for debit online")).click();
    }

    @Test
    public void testManage () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Manage your REDcard")).click();
    }

    @Test
    public void testCreditCardSignUp () {
        TestLogger.log("Test Redcard Link");
        driver.findElement(By.linkText("REDcard")).click();
        TestLogger.log("Test RedCreditCard Application Link");
        driver.findElement(By.linkText("Apply for credit online")).click();
        TestLogger.log("Test Apply Now Link");
        driver.findElement(By.xpath("//button[contains(text(),'apply now')]")).click();
    }


    @Test
    public void testPriv () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Privacy Policy for Target Credit Card")).click();
    }

    @Test
    public void testScroll () {
        driver.findElement(By.linkText("REDcard")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void testScrollElement () {
        driver.findElement(By.linkText("REDcard")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.linkText("which REDcard is right for you?"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void testPerks () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Perks & savings")).click();
    }

    @Test
    public void testApplyMailC () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Apply for Target credit card by mail")).click();
    }

    @Test
    public void testApplyMailD () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Apply for Target debit card by mail")).click();
    }

    @Test
    public void testReturntoApplication () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Return to application")).click();
    }

    @Test
    public void testContact () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Contact us")).click();
    }

    @Test
    public void testActivate () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Activate your REDcard")).click();
    }

    @Test
    public void testChip () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Chip-and-PIN FAQ")).click();
    }

    @Test
    public void testRatesandFees () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Target Credit Card rates & fees")).click();
    }

    @Test
    public void testAgreementD () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Target Debit Card agreement")).click();
    }

    @Test
    public void testAgreementC () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Target Credit Card agreement")).click();
    }

    @Test
    public void testGuide () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Identity protection guide")).click();
    }

    @Test
    public void testCreditAccAgreement () {
        driver.findElement(By.linkText("REDcard")).click();
        driver.findElement(By.linkText("Request credit account agreement")).click();
    }
}

