package S3_PopupHandelling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupSendKeys
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/alerts/");

        driver.findElement(By.xpath("//input[@value='PromptMe']")).click();

        Thread.sleep(3000);

       Alert Al =  driver.switchTo().alert();
       Thread.sleep(3000);

       String Altext = Al.getText();
        System.out.println(Altext);

       Al.sendKeys("ABC");

       //Thread.sleep(3000);

       Al.accept();
    }
}
