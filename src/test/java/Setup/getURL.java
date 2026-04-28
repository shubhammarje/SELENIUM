package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURL
{
    static void main() throws InterruptedException {

        WebDriver d = new ChromeDriver();
        d.get("https://www.linkedin.com/");
        Thread.sleep(3000);

       String S1 =  d.getCurrentUrl();
        System.out.println(S1);

        Thread.sleep(3000);
        d.close();

    }
}
