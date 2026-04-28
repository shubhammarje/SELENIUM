package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(3000);

        WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

        WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        act.scrollByAmount(0,200);

        Thread.sleep(3000);

        act.moveToElement(source).clickAndHold().moveToElement(dest).release().perform();






    }
}
