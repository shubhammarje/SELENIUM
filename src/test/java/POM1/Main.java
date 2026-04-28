package POM1;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        LOGIN l = new LOGIN(driver);
        l.EnterUN("SHUBHAM");

        l.EnterPWD("11111");

        l.ClickButton();

        Homepage h = new Homepage(driver);
        String actText = h.OpenHomePage();
        String extText = "xyz";

        if (actText.equalsIgnoreCase(extText))
        {
            System.out.println("TC pass");
        }
        else
        {
            System.out.println("TC Fail");
        }

    }
}
