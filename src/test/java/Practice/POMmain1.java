package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMmain1
{
    @FindBy(xpath = "")private WebElement UN;
    @FindBy(xpath = "")private WebElement PWD;
    @FindBy(xpath = "")private WebElement LoginButton;

    public POMmain1(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void EnterUsernMame(String username)
    {
        UN.sendKeys(username);
    }
    public void  EnterPassword(String passwrod)
    {
        PWD.sendKeys(passwrod);
    }
    public void clickLoginButton()
    {
        LoginButton.click();
    }
}
