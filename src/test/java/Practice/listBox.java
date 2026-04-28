package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listBox
{
    static void main() throws InterruptedException
    {
        WebDriver d = new ChromeDriver();
        d.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(3000);

        WebElement selectBox = d.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        String s = selectBox.getText();
        System.out.println(s);

        d.close();

    }
}
