package S3_POMdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMhomePage
{
    //POM /Regular Class >>
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement PageLogo; //private WebElemet PageLogo = driver.FindElemet(By.Xpath(""));


    //step2>> Initilise
    public POMhomePage(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    //step3 >>
    public String PageLogo()
    {
        String actualText = PageLogo.getText();
        return actualText ;
    }


}
