package Contact;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class contactus extends CommonAPI {
    @Test
    public void contact() {
        driver.findElement(By.linkText("Contact the BBC")).click();
        driver.findElement(By.linkText("Send us a comment")).click();
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
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Tech")).click();
        driver.findElement(By.xpath("//*[@class='blue-tit__list-item-link contact-us']")).click();
    }
    @Test
    public void reportTechnicalIssueLink() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Tech")).click();
        driver.findElement(By.xpath("//*[@class='blue-tit__list-item-link contact-us']")).click();
        driver.findElement(By.linkText("report a technical issue with the News website or app")).click();
    }
    @Test
    public void technicalIssueContactForm(){
        TestLogger.log("Test News Link");
        driver.findElement(By.linkText("News")).click();
        TestLogger.log("Test Tech Link");
        driver.findElement(By.linkText("Tech")).click();
        TestLogger.log("Test News Services Link");
        driver.findElement(By.xpath("//*[@class='blue-tit__list-item-link contact-us']")).click();
        TestLogger.log("Test Technical Issue Link");
        driver.findElement(By.linkText("report a technical issue with the News website or app")).click();
        TestLogger.log("Test Enter Full Name Using Form");
        driver.findElement(By.id("fullName")).sendKeys("Anonymous", Keys.TAB);
        TestLogger.log("Test Enter Email Using Form");
        driver.findElement(By.id("email")).sendKeys("Anonymous@gmail.com", Keys.TAB);
        TestLogger.log("Test Enter town Using Form");
        driver.findElement(By.id("town")).sendKeys("USA", Keys.TAB);
        TestLogger.log("Test Enter Message Using Form");
        driver.findElement(By.id("message")).sendKeys("There is a technical issue", Keys.TAB);
        TestLogger.log("Test Submit Form Link");
        driver.findElement(By.id("submit")).click();
    }
}

