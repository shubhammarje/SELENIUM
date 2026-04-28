package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");
       Thread.sleep(3000);

       String S1 =driver.getCurrentUrl();
        System.out.println("Current of this page is :"+ S1);

        Thread.sleep(3000);

        String T1 =driver.getTitle();
        System.out.println("Title if current page :"+ T1);

        System.out.println("------------------------------------------------------------------");

        Thread.sleep(3000);

        driver.get("https://www.indiabix.com/");
        Thread.sleep(3000);

        String S2 =driver.getCurrentUrl();
        System.out.println("Current of this page is :"+ S2);

        String T2 =driver.getTitle();
        System.out.println("Title if current page :"+ T2);

        System.out.println("----------------------------------------------------------------");

        Thread.sleep(3000);

        driver.manage().window().maximize();
       Thread.sleep(3000);

       driver.manage().window().minimize();
       Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);


       driver.navigate().back();
       Thread.sleep(3000);

       driver.navigate().refresh();
       Thread.sleep(3000);

       driver.navigate().forward();
       Thread.sleep(3000);

       driver.close();

    }
}
