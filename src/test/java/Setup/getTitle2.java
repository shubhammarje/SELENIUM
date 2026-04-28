package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle2
{
    static void main() throws InterruptedException
    {
        WebDriver d = new ChromeDriver();
        d.get("https://www.linkedin.com/");


        d.manage().window().maximize();
        Thread.sleep(3000);

        String ExpTitle="LinkedIn: Log In or Sign Up";
        String ActTitle = d.getTitle();


        if(ActTitle.equals(ExpTitle))
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("NOT");
        }

        String url =d.getCurrentUrl();
        System.out.println("CURRENT URL :"+ url);

        Thread.sleep(3000);

        d.close();


    }
}
