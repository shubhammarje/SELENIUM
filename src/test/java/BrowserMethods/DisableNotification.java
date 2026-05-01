package BrowserMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification
{
    static void main()
    {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable--notification");   //allow - Enable     , Block-Disable

        ChromeDriver driver = new ChromeDriver(co);
        driver.get("https://www.instagram.com/");

    }
}
