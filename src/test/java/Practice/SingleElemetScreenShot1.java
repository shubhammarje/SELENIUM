package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SingleElemetScreenShot1
{
    static void main() throws InterruptedException, IOException {
        WebDriver d = new ChromeDriver();
        d.get("https://demo.automationtesting.in/Frames.html");

       WebElement logo = d.findElement(By.xpath("//img[@alt='image not displaying']"));

       Thread.sleep(3000);

       File source = logo.getScreenshotAs(OutputType.FILE);

       File dest = new File("G:\\Selenium Screenshot\\Image55.png");

        FileHandler.copy(source,dest);

        d.close();

    }
}
