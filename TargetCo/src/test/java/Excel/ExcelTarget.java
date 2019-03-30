package Excel;

import databases.ExcelData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ExcelTarget
{
    ChromeDriver driver;

    @Test(dataProvider="testdata")
    public void DemoProject(String search) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manju\\IdeaProjects\\AutomationTeam11-\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.target.com/");

        driver.findElement(By.id("search")).sendKeys(search);
        driver.findElement(By.xpath("//button[contains(text(),'go')]")).click();

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

        ExcelData config = new ExcelData("C:\\Users\\Manju\\IdeaProjects\\AutomationTeam11-\\TargetCo\\src\\test\\resources\\Products.xlsx");

        int rows = config.getRowCount(0);

        Object[][] products = new Object[rows][1];

        for(int i=0;i<rows;i++)
        {
            products[i][0] = config.getData(0, i, 0);

        }

        return products;
    }
}
