package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed1
{
        static void main() throws InterruptedException
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.instagram.com/accounts/login/?hl=en");
            Thread.sleep(3000);

            try {
                WebElement displayed = driver.findElement(By.xpath("//span[text()='close friendsi']"));
            }
            catch (NoSuchElementException e)
            {
                System.out.println("NoSuchElementException handled");
            }

            Boolean result = false;

            if(result)
            {
                System.out.println("Displayed");
            }
            else
            {
                System.out.println("Not dsplayed");
            }

            System.out.println(result);


        }
}
