package POM2;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        Login1 l = new Login1(driver);
        l.Enterusername("8888905363");
        Thread.sleep(2000);

        l.EnterPassword("11223344");
        Thread.sleep(2000);

        l.ClcikButton();

        Home1 h = new Home1(driver);
       String actText = h.GetHomepageLogo();
       String expText = "xyz";

       if (actText.equalsIgnoreCase(expText))
       {
           System.out.println("TC Pass");
       }
       else
       {
           System.out.println("Tc Fails");
       }


    }
}
