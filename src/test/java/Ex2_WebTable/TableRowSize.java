package Ex2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableRowSize
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> allrow = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int totalsize = allrow.size();
        System.out.println("total ROW :"+ totalsize);



        Thread.sleep(2000);

        List<WebElement> allcolumn = driver.findElements(By.xpath("//table[@name='BookTable']//td"));
        int totalColumn = allcolumn.size();
        System.out.println("total Colum :"+ totalColumn);

        Thread.sleep(2000);

        driver.close();


    }
}
