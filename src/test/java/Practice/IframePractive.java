package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractive
{
    static void main() throws InterruptedException {
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        Thread.sleep(3000);

        drive.switchTo().frame("iframeResult");
        Thread.sleep(2000);

        drive.findElement(By.xpath("//button[@type='button']")).click();

        Thread.sleep(2000);

        drive.switchTo().parentFrame();
        Thread.sleep(2000);


        drive.findElement(By.xpath("//a[@id='menuButton']")).click();

    }
}
