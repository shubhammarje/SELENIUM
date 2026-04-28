package S2_ScreenshotCapture;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShotofSpecificElement
{
    static void main() throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");

        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.xpath("//span[text()='See everyday moments from your ']"));

        File source = logo.getScreenshotAs(OutputType.FILE);

        File path = new File("G:\\Selenium Screenshot\\Image23.png");

        FileHandler.copy(source,path);

        Thread.sleep(3000);

        driver.close();


    }
}
