package S2_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragANDDrop
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(3000);

        WebElement source = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));

        WebElement dst = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

        Actions act = new Actions(driver);

        //act.dragAndDrop(source,dst).perform();
        act.moveToElement(source).clickAndHold().moveToElement(dst).release().perform();





    }
}
