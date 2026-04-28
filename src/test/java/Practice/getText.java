package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText
{

    //launch browser
    //open instagram
    //get text of login button

    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        Thread.sleep(3000);

        //Approch 1>>
       // String forgot_pwd = driver.findElement(By.xpath("//span[text()='Forgot password?']")).getText();
        //Thread.sleep(3000);
        //System.out.println(forgot_pwd);

        //Approch2 >>

        WebElement forgot_Pwd= driver.findElement(By.xpath("//span[text()='Forgot password?']"));
        Thread.sleep(3000);
        String result = forgot_Pwd.getText();
        Thread.sleep(3000);
        System.out.println(result);
        Thread.sleep(3000);

        driver.close();



    }
}

