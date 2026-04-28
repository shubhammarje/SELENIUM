package PracticePOM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement Logo;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    public String LogoText()
    {
        String actualText = Logo.getText();
        return actualText;
    }

}
