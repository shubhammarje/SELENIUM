package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMmain
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


        POMmain1 p1 = new POMmain1(driver);
        p1.EnterUsernMame("");
        Thread.sleep(2000);

        p1.EnterPassword("XYZ");
        Thread.sleep(2000);

        p1.clickLoginButton();
        Thread.sleep(2000);

        POMHomepage2 p2 = new POMHomepage2(driver);
        String explogo = p2.getHometext();
        String actLogo ="XYZ";

        if (explogo.equalsIgnoreCase(actLogo))
        {
            System.out.println("TC PASS");
        }
        else
        {
            System.out.println("TC fail");
        }



    }
}
