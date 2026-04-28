package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey_Practice
{
    static void main() throws InterruptedException {
    //launch Browser
    //open link >> Facebook
    //send keys in username field
    //clear given values in field
        // reenter values
        //close

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

        //Approch 1 >>
        //driver.findElement(By.xpath("//input[@autocomplete='username webauthn']")).sendKeys("shubhammarje@gmail.com");
        //Thread.sleep(3000);

        //Approch 2 >>
        WebElement username =driver.findElement(By.xpath("//input[@autocomplete='username webauthn']"));
        Thread.sleep(3000);

        username.sendKeys("shubhammarje@gmail.com");
        Thread.sleep(3000);

        username.clear();
        Thread.sleep(3000);

        username.sendKeys("ZXCVBNM");

        driver.close();


    }
}
