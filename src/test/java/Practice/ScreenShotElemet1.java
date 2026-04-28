package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShotElemet1
{
    static void main() throws IOException {
        WebDriver d = new ChromeDriver();
        d.get("https://meet.google.com/acx-mkfr-bgp");

        File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

        File dest = new File("G:\\Selenium Screenshot\\Image44.png");

        FileHandler.copy(source,dest);


    }
}
