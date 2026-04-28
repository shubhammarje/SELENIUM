package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwitchToManiPagefromFrame
{
    static void main()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to frama
        // driver.switchTo().frame("iframeResult");         //frame by ID
        driver.switchTo().frame(0);                  //frame by index
        //or
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));  //webelement address

        //click on date and time button
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();


        //switch to main page
        driver.switchTo().parentFrame();    //focus switched to its parent
        //driver.switchTo().defaultContent(); //focus switched to main page

        driver.findElement(By.xpath("//a[@id='menuButton']")).click();


    }
}
