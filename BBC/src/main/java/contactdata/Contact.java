package contactdata;

import homepagedata.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Contact extends HomePage {

    @FindBy(linkText = "Contact the BBC")
    WebElement contactLink;
    @FindBy(linkText = "Got a question? Try our FAQs")
    WebElement faqsLink;
    @FindBy(linkText = "Send us a comment")
    WebElement commentLink;
    @FindBy(xpath = "//*[@class='blue-tit__list-item-link contact-us']")
    WebElement contactBBCNews;
    @FindBy(linkText = "report a technical issue with the News website or app")
    WebElement reportTechIssue;
    @FindBy(id = "fullName")
    WebElement fullNameInput;
    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "town")
    WebElement townInput;
    @FindBy(id = "message")
    WebElement messageInput;
    @FindBy(id = "submit")
    WebElement submitButton;

    public void clickOnContactBBC() {
        TestLogger.log("Test Contact Link");
        contactLink.click();
    }

    public void clickOnFaqsLink() {
        clickOnContactBBC();
        TestLogger.log("Test Faqs Link Link");
        faqsLink.click();
    }

    public void clickOnCommentLink() {
        clickOnContactBBC();
        TestLogger.log("Test Comment Link");
        commentLink.click();
    }

    public void clickOnContactBBCNews() {
        clickOnNewsTab();
        clickOnTechLink();
        TestLogger.log("Test Contact BBC News");
        contactBBCNews.click();
    }

    public void clickReportTechIssue() {
        clickOnNewsTab();
        clickOnTechLink();
        clickOnContactBBCNews();
        TestLogger.log("Test Report Technical Issue");
        reportTechIssue.click();
    }

    public void enterFullName() {
        TestLogger.log("Test Full Name Entry");
        fullNameInput.sendKeys("Anonymous", Keys.TAB);
    }

    public void enterEmail() {
        TestLogger.log("Test Email Entry");
        emailInput.sendKeys("Anonymous@gmail.com", Keys.TAB);

    }

    public void enterTown() {
        TestLogger.log("Test Town Entry");
        townInput.sendKeys("USA", Keys.TAB);
    }

    public void enterMessage() {
        TestLogger.log("Test Message Entry");
        townInput.sendKeys("There is a Technical Issue", Keys.TAB);
    }
    public void clickSubmitButton(){
        TestLogger.log("Test Submit Button");
        submitButton.click();
    }
    public void technicalIssueContactForm(){
       clickReportTechIssue();
        enterFullName();
        enterEmail();
        enterTown();
        enterMessage();
        clickSubmitButton();
    }
}