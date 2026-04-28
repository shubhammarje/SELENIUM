package S2_HandelingOFMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Ex4_DeselectCheckBox
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,600).perform();

        List<WebElement> dayList = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        for(WebElement S1 : dayList)
        {
            S1.click();
            Thread.sleep(1000);
        }

        //Deselect checkBox in reverse directions
        for (int i = dayList.size()-1 ; i>=0 ; i--)
        {
            dayList.get(i).click();
            Thread.sleep(1000);
        }



    }
}
