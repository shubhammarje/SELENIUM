package Ex2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable
{
    static void main()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        String text1 = driver.findElement(By.xpath("//table[@id='taskTable']//tr//td[text()='Chrome']/following-sibling::td[contains(text(),'Mbps')]")).getText();
        System.out.println(text1);
    }
}
