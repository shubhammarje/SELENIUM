package S3_PopupHandelling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        Thread.sleep(3000);
        //insert data in custID
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1211");

        //click on submitt button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //get Alert Popup Text
        String Text = driver.switchTo().alert().getText();
        System.out.println("1st Alert :"+Text);

        Thread.sleep(3000);

        //perform cancel from Alert Popup >>
        //driver.switchTo().alert().dismiss();

        //perform OK from alert POPUP >>
        driver.switchTo().alert().accept();

        // 2nd alert popup text
        String b = driver.switchTo().alert().getText();
        System.out.println("2nd Alert :"+b);

        //perform 2nd alert popup
        //driver.switchTo().alert().accept();





    }
}
