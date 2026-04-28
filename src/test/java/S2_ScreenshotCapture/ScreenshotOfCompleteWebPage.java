package S2_ScreenshotCapture;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotOfCompleteWebPage
{
    static void main() throws InterruptedException, IOException {
        WebDriver d = new ChromeDriver();
        d.get("https://www.flipkart.com/");

        d.manage().window().maximize();

        //Thread.sleep(3000);

        //STEP 1 >>
        File source = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
        System.out.println(source); // defaut location of screenshot saved

        //STEP 2 >>
        //store screenshot in our destination >>
        File dest = new File("G:\\Selenium Screenshot\\image2.png");

        //STEP 3 >>
        //moving screenshot in destination path

        FileHandler.copy(source,dest);    //className.methodName(source,path)





    }
}
