package S3_POMdesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1
{
    static void main() throws InterruptedException {

        WebDriver drive = new ChromeDriver();
        drive.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        drive.manage().window().maximize();
        Thread.sleep(2000);

        drive.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");

        Thread.sleep(2000);

        drive.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

        Thread.sleep(2000);

        drive.findElement(By.xpath("//input[@name='login-button']")).click();

        Thread.sleep(2000);


        //get text >>
        String actLogoText = drive.findElement(By.xpath("//div[@class='app_logo']")).getText();
        String ExpLogo = "Swag Laibs";

        if (actLogoText.equalsIgnoreCase(ExpLogo))
        {
            System.out.println("TC PASS");
        }
        else
        {
            System.out.println("TC FAILED");
        }

    }
}
