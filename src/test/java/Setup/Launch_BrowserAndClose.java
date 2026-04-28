package Setup;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_BrowserAndClose
{
    static void main() throws InterruptedException {
        WebDriver d = new ChromeDriver();
        d.get("https://www.linkedin.com/");

        //setSize is methoid use to set size of browser
        //set the diamnetion of browser by passing Dimanetional type Orgumet
        Dimension d1= new Dimension(800,200);
        d.manage().window().setSize(d1);

        Thread.sleep(3000);
        d.close();




    }
}
