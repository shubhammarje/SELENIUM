package MOCK_Practice;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshot
{
    static void main() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("xyzcasd");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();

        Thread.sleep(2000);

        String actText = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface:')]")).getText();
        System.out.println(actText);
        String expText = "Epic sadface: Username and password do not match any user in this service";

        if (actText.equalsIgnoreCase(expText))
        {
            System.out.println("TC PASS");
        }
        else
        {
            System.out.println("TC FAIL");
        }

        Thread.sleep(2000);


        Thread.sleep(2000);

        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File path = new File("G:\\Selenium Screenshot\\IMAGE123321.png");

        FileHandler.copy(source,path);





    }
}
