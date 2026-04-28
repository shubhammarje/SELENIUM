package MOCK_Practice;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdownANDAddress
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(2000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,400).perform();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("PUNE");

        Thread.sleep(2000);

        driver.close();

    }

}
