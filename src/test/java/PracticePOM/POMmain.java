package PracticePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMmain
{
    static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPAGE login = new LoginPAGE(driver);
        login.EnterUN("standard_user");
Thread.sleep(2000);
        login.EnterPWD("secret_sauce");
Thread.sleep(2000);
        login.ClickLoginButton();


        HomePage Home = new HomePage(driver);
        String actLogo = Home.LogoText();
        String ExpLogoText = "Swag Labs";

        if (actLogo.equalsIgnoreCase(ExpLogoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("Tc Fail=" +
                    "");
        }








    }
}
