package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home1
{
    WebElement HomepageLogo;

    Home1(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    public String GetHomepageLogo()
    {
        String TextLogo = HomepageLogo.getText();
        return TextLogo;
    }
}
