package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        //driver.manage().window().maximize();
        //Thread.sleep(3000);

//Approch1 >> this is use to perform only single time on same element
        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABCH");
        //Thread.sleep(3000);

//Approch2 >>this is use to perform multiple time on same element
        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        Thread.sleep(2000);
        username.sendKeys("XYZ");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        username.sendKeys("SHUBHAM");

        driver.quit();

    }

}
