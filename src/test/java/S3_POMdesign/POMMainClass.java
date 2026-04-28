package S3_POMdesign;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMMainClass
{
    static void main() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        POMLoginPage login = new POMLoginPage(driver);
        login.EnterUN("standard_user");
        Thread.sleep(2000);

        login.EnterPwd("secret_sauce");
        Thread.sleep(2000);

        login.ClickButon();
        Thread.sleep(2000);


        POMhomePage Homepage = new POMhomePage(driver);
        String actualLogotext = Homepage.PageLogo();
        String ExpLogoText = "Swag Labs";

        if (actualLogotext.equalsIgnoreCase(ExpLogoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fails");
        }




    }
}
