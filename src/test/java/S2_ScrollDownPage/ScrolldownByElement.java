package S2_ScrollDownPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrolldownByElement
{
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement coptyright = driver.findElement(By.xpath("//span[text()='© Copyright - Demo Guru99 2025']"));

        Actions act = new Actions(driver);

        //scrolling down page by Elemen
        act.scrollToElement(coptyright).perform();

        Thread.sleep(3000);

        //scrolling up page by Elemen
        WebElement up = driver.findElement(By.xpath("(//a[text()='Selenium'])"));
        act.scrollToElement(up).perform();

    }
}
