package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SitchToFrame1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

Thread.sleep(3000);

driver.switchTo().frame(0);
//driver.switchTo().frame("iframeResult");
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));

String text = driver.findElement(By.xpath(" //button[@type='button']")).getText();
        System.out.println(text);



    }
}
