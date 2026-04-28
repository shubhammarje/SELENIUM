package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        //Approch1 >>
       // boolean enabled = driver.findElement(By.xpath("//span[text()='Log in']")).isEnabled();
        //System.out.println(enabled);

        //Approch2 >>
        WebElement Button = driver.findElement(By.xpath("//span[text()='Log in']"));
        Thread.sleep(3000);
        boolean result = Button.isEnabled();
        Thread.sleep(3000);
        if(result)
        {
            System.out.println("Is Enabled");
        }
        else
        {
            System.out.println("is Disabled");
        }

        driver.quit();

    }
}
