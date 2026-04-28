package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkOnallPage
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/;");

        Thread.sleep(2000);

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int linksize = allLinks.size();
        System.out.println(linksize);

        Thread.sleep(2000);

        for(WebElement S1 : allLinks)
        {
            System.out.println(S1.getText());
        }


    }
}
