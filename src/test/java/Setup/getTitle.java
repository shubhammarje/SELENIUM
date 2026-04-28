package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle
{
    static void main() throws InterruptedException

    {
        WebDriver d = new ChromeDriver();
        d.get("https://www.linkedin.com/");

        String s =d.getTitle();
        System.out.println(s);

        Thread.sleep(3000);

        d.close();
    }
}
