package S2_HandelingOFMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_PrintAllLinksTextSizeOfCurrentPage
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

//        //find all links on current page
//        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//
//        //all link size
//        int alllinksize = allLinks.size();
//        System.out.println(alllinksize);

        Dimension LinkSizeALl = driver.findElement(By.xpath("//a")).getSize();
        System.out.println(LinkSizeALl);
        
    }
}
