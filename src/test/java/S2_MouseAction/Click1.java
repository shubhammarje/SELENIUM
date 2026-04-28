package S2_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click1
{
    static void main() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        //create Object of Acction >>
        Actions act = new Actions(driver);

        //scroll down to element >>
        act.scrollByAmount(0,700).perform();

        Thread.sleep(3000);

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        String Text = country.getText();
        System.out.println(Text);

        //click on list Box >>
        act.click(country).perform();

        //KeyBoard Arrow UP >>
        //act.sendKeys(keys.ARROW_UP).perform();

        //KeyBoard Arrow DOWN >>
        //act.sendKeys(keys.ARROW_UP).perform();


        //if to select 4th option then >>
//        for (int i = 0 ; i<=7 ; i++ )
//        {
//            act.sendKeys(key.ARROW_DOWN).perform();
//        }

        //KeyBoard ENTER >>
        //act.sendKeys(keys.ENTER).perform();






    }
}
