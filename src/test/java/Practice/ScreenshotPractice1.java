package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotPractice1
{
    static void main() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://testautomationpractice.blogspot.com/");

        //take screenshot >>

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // save screenshot in folder >>>
        File dest = new File("G:\\Selenium Screenshot\\Image44.png");

        //move to pathe

        FileHandler.copy(source,dest);



    }
}
