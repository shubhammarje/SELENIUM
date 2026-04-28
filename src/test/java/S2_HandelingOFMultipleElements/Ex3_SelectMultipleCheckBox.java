package S2_HandelingOFMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex3_SelectMultipleCheckBox
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        List<WebElement> DaysList = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        Thread.sleep(3000);

        for (WebElement S1 :DaysList)
        {
            S1.click();
            Thread.sleep(3000);
        }


    }
}
