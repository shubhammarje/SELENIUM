package S3_HandellingOFDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamicElemet
{
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();

        Thread.sleep(2000);

        //search field
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn25'])[1]")).sendKeys("redmi 15 5G");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        //get rating
        String totalRating = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span)[6]")).getText();
        System.out.println(totalRating);

        //get review >>
       String review = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span)[8]")).getText();
        System.out.println(review);

        //get prise
        String prise = driver.findElement(By.xpath("(((//div[@class='jIjQ8S'])[2]//div)[16]//div)[3]")).getText();
        System.out.println(prise);



    }
}
