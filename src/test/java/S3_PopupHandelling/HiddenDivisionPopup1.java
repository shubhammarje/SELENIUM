package S3_PopupHandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mobikwik.com/");

        //1.Hidden Popup
        //it is colourful
        //We can inspect the popup elements present in Hidden popup
        //we can perform drap and Drop operation

        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8888905363");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Get OTP']")).click();

        Thread.sleep(3000);
        driver.close();


    }
}
