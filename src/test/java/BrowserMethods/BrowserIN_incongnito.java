package BrowserMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserIN_incongnito
{
    static void main()
    {
        //running TC on incognito

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--incognito");          //open browser in incognito

        ChromeDriver driver = new ChromeDriver(co);
        driver.get("https://www.instagram.com/");

    }
}
