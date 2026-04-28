package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected
{
    static void main() throws InterruptedException {
        //launch Browser
        //open facebook url
        //go to create new Acc
        //verify check box is selected or not

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/radio-buttons");
        Thread.sleep(3000);
try
{
    driver.findElement(By.xpath("//input[@value='blue']")).click();
}
catch (ElementClickInterceptedException e)
{
    System.out.println("ElementClickInterceptedException handled");
    //e.printStackTrace();
}
        Thread.sleep(3000);


        WebElement selectBox = driver.findElement(By.xpath("//input[@value='blue']"));
        Thread.sleep(3000);
        Boolean result = selectBox.isSelected();
        Thread.sleep(3000);
        System.out.println(result);

        if(result)
        {
            System.out.println("is Selected");
        }
        else
        {
            System.out.println("Not selected");
        }

        driver.quit();

    }
}
