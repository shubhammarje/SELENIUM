package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser
{
    static void main()
    {
        //HeadLessBrowser >> running the TC without Open Browser

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");

        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.instagram.com/");

        System.out.println(driver.getTitle());

    }
}
