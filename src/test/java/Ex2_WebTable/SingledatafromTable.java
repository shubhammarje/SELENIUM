package Ex2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SingledatafromTable
{
    static void main() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,1700).perform();

        Thread.sleep(3000);

        String specifixText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[4]")).getText();
        System.out.println(specifixText);








        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(1000);

        File dest = new File("G:\\Selenium Screenshot\\image555.png");
        Thread.sleep(1000);

        FileHandler.copy(source,dest);


    }
}
