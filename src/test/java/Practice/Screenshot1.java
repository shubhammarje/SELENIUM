package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot1
{
    static void main() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");

        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File Path = new File("G:\\Selenium Screenshot\\Image1.png");

        FileHandler.copy(source,Path);



    }

}
