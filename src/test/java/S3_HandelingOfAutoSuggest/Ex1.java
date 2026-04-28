package S3_HandelingOfAutoSuggest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(3000);


        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(2000);

        //String mobText = "redmi note 15 pro";

        //List<WebElement> text1 = driver.findElements(By.xpath("//div[@class='aajZCb']/li//div[@class='wM6W7d']"));
        List<WebElement> text1 = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));

        Thread.sleep(2000);

        System.out.println(text1.size());

        String ExpMobilename = "redmi note 14";

        //print all suggestion options
        for (WebElement S1 :text1)
        {
            String actMobName = S1.getText();
            if (actMobName.equalsIgnoreCase(ExpMobilename))
            {
                S1.click();
                break;
            }
        }





    }
}
