package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeOfBrowser
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        Dimension d = new Dimension(200,500);
        driver.manage().window().setSize(d);


        // we need to call SetSize method of Window Interface by passing Dimanetion type Argument

    }
}
