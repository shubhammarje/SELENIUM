package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_SwitchToFrame
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to frama
        driver.switchTo().frame("iframeResult");         //frame by ID
        //driver.switchTo().frame(0);                  //frame by index
        //or
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));  //webelement address

        //click on date and time button
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();








        //Thread.sleep(3000);
        //d.close();
    }
}
