package Contact;

import base.CommonAPI;
import contactdata.Contact;
import homepagedata.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ContactTest extends CommonAPI {

    @BeforeMethod
    public void initialize() {
        contactObj = PageFactory.initElements(driver, Contact.class);
    }
    Contact contactObj = null;
   @Test
   public void contact1() {
       contactObj.clickOnContactBBC();
       String title =driver.getTitle();
       Assert.assertEquals(title,"BBC Contact Us - Home");
   }
    @Test
    public void contact() {
        contactObj.clickOnCommentLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Can't find what you're looking for? We'll try to help. - BBC FAQs");
    }

    @Test //failed
    public void reportError() {
        driver.findElement(By.linkText("Contact the BBC")).click();
        driver.findElement(By.linkText("Send us a comment")).click();
        driver.findElement(By.linkText("Report a fault or error on a BBC website")).click();
        driver.findElement(By.linkText("The BBC News website")).click();
        driver.findElement(By.linkText("this webform on the BBC News website.")).click();

    }

    @Test
    public void contactBBCNews() {
        contactObj.clickOnContactBBCNews();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Contact BBC News online - help, feedback and complaints - BBC News");
    }
    @Test
    public void reportTechnicalIssueLink() {
       contactObj.clickReportTechIssue();
        String title =driver.getTitle();
        Assert.assertEquals(title," Online output - technical error  - BBC News");
    }
    @Test
    public void technicalIssueContactFormTest(){
      contactObj.technicalIssueContactForm();
    }
    @Test
    public void faqs() {
        contactObj.clickOnContactBBC();
        contactObj.clickOnFaqsLink();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Today's most popular FAQs - BBC FAQs");
    }
}

