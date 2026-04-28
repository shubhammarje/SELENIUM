package Ex2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableColumSIze
{
    static void main()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> TotalCloum = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        int columSize = TotalCloum.size();
        System.out.println(columSize);

        //2nd Approch
        int size1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
        System.out.println(size1);

        String columText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]")).getText();
        System.out.println(columText);

        String test1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]")).getText();
        System.out.println(test1);


        String specifixText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[4]")).getText();
        System.out.println(specifixText);



    }
}
