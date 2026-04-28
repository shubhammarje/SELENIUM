package S3_PopupHandelling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPUP1
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        Thread.sleep(3000);
        //insert data in custID
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1211");

        //click on submitt button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //Switch to alert Popup
        Alert alt = driver.switchTo().alert();

        //get Alert Popup Text
        String text = alt.getText();
        System.out.println(text);

        //accept popup - OK
        alt.accept();

        //switch to 2nd popup
        Alert A1 = driver.switchTo().alert();

        //accept 2nd popup
        A1.accept();

        //enter value in alert POPUP
        //A1.sendKeys("121212");

    }
}
