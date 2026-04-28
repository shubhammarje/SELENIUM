package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomepage2
{
    @FindBy(xpath = "") private WebElement homeText;

    public POMHomepage2(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    public String getHometext()
    {
        String actlogo = homeText.getText();
        return actlogo;
    }
}

