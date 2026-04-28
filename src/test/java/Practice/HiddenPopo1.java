package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v142.page.model.WebAppManifest;

public class HiddenPopo1
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mobikwik.com/");

        //click on Login Button
        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();

        Thread.sleep(3000);

        //enter data
        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8888905363");

        Thread.sleep(3000);
        //click on
        driver.findElement(By.xpath("//span[text()='Get OTP']")).click();


    }
}
