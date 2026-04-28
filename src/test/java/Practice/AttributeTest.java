package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTest
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("abcd");
        Thread.sleep(3000);

        String Attr =driver.findElement(By.xpath("//input[@name='email'][1]")).getAttribute("value");
        Thread.sleep(3000);
        System.out.println(Attr);

        driver.close();




    }
}
