package BrowserMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDetails
{
    static void main()
    {

        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.getCapabilities().getBrowserName());       // to get browser name
        System.out.println(driver.getCapabilities().getBrowserVersion());    // to get browser version


        driver.quit();

    }
}
