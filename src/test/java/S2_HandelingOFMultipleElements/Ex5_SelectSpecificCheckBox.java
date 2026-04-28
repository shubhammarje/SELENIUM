package S2_HandelingOFMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Ex5_SelectSpecificCheckBox
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,800);

        Thread.sleep(3000);

        List<WebElement> diselect = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        Thread.sleep(3000);

        for(int i =0 ; i<=diselect.size()-1 ; i++)
        {
            if(i==3 | i==5)
            {
                diselect.get(i).click();
            }
        }


    }
}
