package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    @FindBy(xpath = "\"//div[@class='app_logo']")private WebElement PageLogo;

    public Homepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public String OpenHomePage()
    {
        String Text = PageLogo.getText();
        return Text;
    }


}
