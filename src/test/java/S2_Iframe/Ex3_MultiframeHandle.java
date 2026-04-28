package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_MultiframeHandle
{
    static void main()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");

        //switch to inner fram >>
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer nested frame']")));

        //switch to inner frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));

        //get text
        String text = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(text);



    }
}
