package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGIN
{
    @FindBy(xpath = "//input[@placeholder='Username']")private WebElement UN;
    @FindBy(xpath = "//input[@placeholder='Password']")public WebElement PWD;
    @FindBy(xpath = "//input[@name='login-button']")public WebElement clickLoginButton;

    public LOGIN (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void EnterUN(String username)
    {
        UN.sendKeys(username);
    }

    public void EnterPWD(String password)
    {
        PWD.sendKeys(password);
    }

    public void ClickButton()
    {
        clickLoginButton.click();
    }


}
