package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled
{
    //launch browser
    //fetch instagram
    //verify login button is enable or not

    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

       // driver.findElement(By.xpath(""))


    }
}
