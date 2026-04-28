package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Text
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);
//Approch 1 >>
        //driver.findElement(By.xpath("//span[text()='Create new account']"));
        //String S= driver.getTitle();
        //System.out.println(S);
//Thread.sleep(3000);

//Approch 2>>
        WebElement NewAccount = driver.findElement(By.xpath("//span[text()='Create new account']"));
        Thread.sleep(3000);
        String result = NewAccount.getText();
        Thread.sleep(3000);
        System.out.println(result);



        driver.quit();

    }
}
