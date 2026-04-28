package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPractice1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        //send data
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1212");

        Thread.sleep(3000);

        //submitt button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        Thread.sleep(3000);

        //action ALert popup
        Alert alt = driver.switchTo().alert();

        //alt.accept();
        //alt.dismiss();
        //alt.accept();
        String Text = alt.getText();
        System.out.println(Text);

        alt.accept();




    }
}
