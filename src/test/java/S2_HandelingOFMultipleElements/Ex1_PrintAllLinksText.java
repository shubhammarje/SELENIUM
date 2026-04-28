package S2_HandelingOFMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_PrintAllLinksText
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        //find all links on current page
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));


        //print all links
        for ( WebElement S1:allLinks)
        {
            System.out.println(S1.getText());
        }
    }
}
