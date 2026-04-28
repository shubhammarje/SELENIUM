package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValue
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

       driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("ABCD");
        Thread.sleep(3000);

        String Attri = driver.findElement(By.xpath("//input[@name='email'][1]")).getAttribute("value");
        System.out.println(Attri);

        driver.close();



    }
}
