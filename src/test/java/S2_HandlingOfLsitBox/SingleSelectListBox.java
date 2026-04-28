package S2_HandlingOfLsitBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox
{
    static void main() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(3000);

        //STEP -1  >> find the list box to perform action
        WebElement list = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));

        Select s= new Select(list);

        //s.selectByIndex(1);
        //s.selectByValue("option2");
        s.selectByVisibleText("Option3");


        //driver.close();


    }
}
