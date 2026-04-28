package S2_ScrollDownPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        Thread.sleep(3000);

        //select[@id='country']

        //scroll up by value -Y
        act.scrollByAmount(0,-100).perform();

        //scroll right by value X
        //act.scrollByAmount(200,0).perform();

        //scroll left by value -X
        //act.scrollByAmount(-100,0).perform();





    }
}
