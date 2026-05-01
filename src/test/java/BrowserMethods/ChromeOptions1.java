package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1
{
    static void main() throws InterruptedException
    {
        //browser maximise

        ChromeOptions co = new ChromeOptions();   //ChromeOptions is interface use for browser related settings
        co.addArguments("start-maximized");       //addArguments is method of ChromeOptions

        WebDriver driver = new ChromeDriver(co);    //pass the  object name in constructor
        driver.get("https://www.instagram.com/");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.getStackTrace();
        }

        driver.quit();

    }
}
