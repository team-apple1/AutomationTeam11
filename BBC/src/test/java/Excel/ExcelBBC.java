package Excel;

import databases.ExcelData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelBBC
{
    ChromeDriver driver;

    @Test(dataProvider="testdata")
    public void DemoProject(String search) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazli\\IdeaProjects\\AutomationTeam11\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.bbc.com/");

        driver.findElement(By.id("orb-search-q")).sendKeys(search, Keys.ENTER);


        Thread.sleep(5000);


        System.out.println("ExcelReader successful!");
    }

    @AfterMethod
    void ProgramTermination()
    {
        driver.quit();
    }

    @DataProvider(name="testdata")
    public Object[][] TestDataFeed()
    {

        ExcelData config = new ExcelData("C:\\Users\\fazli\\IdeaProjects\\AutomationTeam11\\BBC\\src\\test\\resources\\type.xlsx");

        int rows = config.getRowCount(0);

        Object[][] credentials = new Object[rows][1];

        for(int i=0;i<rows;i++)
        {
            credentials[i][0] = config.getData(0, i, 0);

        }

        return credentials;
    }
}