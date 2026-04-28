package Ex2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInTable
{
    static void main()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");


        //driver.findElement(By.xpath("//table[@id='productTable']//tr[3]//input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//table[@id='productTable']//tr/td[text()='Laptop']//following-sibling::td[2]//input[@type='checkbox']")).click();


    }
}
