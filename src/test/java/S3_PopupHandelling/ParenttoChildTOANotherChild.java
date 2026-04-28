package S3_PopupHandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class ParenttoChildTOANotherChild
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");

        //click on new tab
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get childAddress of new tab to switch focus
        Set<String> addressed = driver.getWindowHandles();   //[mainpageAddress , ChildpageAddress]
        ArrayList<String> al = new ArrayList<>(addressed);   //mainPage[0] , childpage[1]]

//        String mainpage = al.get(0);
//        System.out.println(mainpage);
//        String childpage = al.get(1);
//        System.out.println(childpage);


        //switch focus on child Tab>>
        driver.switchTo().window(al.get(1));

        Thread.sleep(3000);

        //click on selenium on child tab
        // driver.findElement(By.xpath("(//span[text()='Demo'])[1]")).click();

        //switch to Main page
        driver.switchTo().window(al.get(0));

        Thread.sleep(3000);

        //click on NEW window on Main Page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

        Thread.sleep(3000);

        //switch focus on child2
        Set<String> AllAddress1 = driver.getWindowHandles();      //[mainpage , chid1pageID , Child2 ID]
        ArrayList<String> alladd = new ArrayList<>(AllAddress1);
        driver.switchTo().window(al.get(2));

        Thread.sleep(3000);

        //action on child2
        driver.manage().window().maximize();


    }
}
