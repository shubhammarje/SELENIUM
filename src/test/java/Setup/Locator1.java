package Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1
{
    static void main() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        String S1 = driver.getCurrentUrl();
        System.out.println(S1);
        Thread.sleep(3000);


        String T1 = driver.getTitle();
        System.out.println(T1);
        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);



        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More'][1]")).sendKeys("IPHONE");

        driver.close();

    }
}
