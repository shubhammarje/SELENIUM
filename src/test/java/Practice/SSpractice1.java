package Practice;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SSpractice1
{
    static void main() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com/");

        Thread.sleep(3000);

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File path = new File("G:\\Selenium Screenshot\\IMG23.png");

        FileHandler.copy(src,path);



    }
}
