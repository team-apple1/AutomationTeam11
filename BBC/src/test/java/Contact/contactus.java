package Contact;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

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
        driver.findElement(By.xpath("//*[@id=\"bbc-news-services\"]/div/ul/li[4]/a")).click();
    }
    @Test
    public void reportTechnicalIssueLink() {
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Tech")).click();
        driver.findElement(By.xpath("//*[@id=\"bbc-news-services\"]/div/ul/li[4]/a")).click();
        driver.findElement(By.linkText("report a technical issue with the News website or app")).click();
    }
    @Test
    public void technicalIssueContactForm(){
        driver.findElement(By.linkText("News")).click();
        driver.findElement(By.linkText("Tech")).click();
        driver.findElement(By.xpath("//*[@id=\"bbc-news-services\"]/div/ul/li[4]/a")).click();
        driver.findElement(By.linkText("report a technical issue with the News website or app")).click();
        driver.findElement(By.id("fullName")).sendKeys("Anonymous", Keys.TAB);
        driver.findElement(By.id("email")).sendKeys("Anonymous@gmail.com", Keys.TAB);
        driver.findElement(By.id("town")).sendKeys("USA", Keys.TAB);
        driver.findElement(By.id("message")).sendKeys("There is a technical issue", Keys.TAB);
        driver.findElement(By.id("submit")).click();
    }
}

