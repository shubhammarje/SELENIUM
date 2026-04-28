import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class PrintCoutryList
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        act.scrollByAmount(0,800);

        WebElement allCountryList = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Thread.sleep(3000);
        String text = allCountryList.getText();
        System.out.println(text);

        Thread.sleep(2000);

        act.click(allCountryList).perform();
        Thread.sleep(2000);

        // arrow down >>
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.ARROW_DOWN).perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.ENTER).perform();

        for(int i = 1 ; i<=7 ; i++)
        {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(1000);
        }

        act.sendKeys(Keys.ENTER).perform();


    }
}
