package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

       WebElement displayed = driver.findElement(By.xpath("//span[text()='close friends']"));
       Boolean result = displayed.isDisplayed();


       if(result)
       {
           System.out.println("Displayed");
       }
       else
       {
           System.out.println("Not dsplayed");
       }


    }
}
