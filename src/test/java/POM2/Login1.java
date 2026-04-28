package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login1
{
    private WebElement UN;
    private WebElement pass;
    private WebElement clickLoginButton;


    public Login1(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    public void Enterusername(String username)
    {
        UN.sendKeys(username);
    }
    public void EnterPassword(String password)
    {
        password.split(password);
    }

    public void ClcikButton()
    {
        clickLoginButton.click();
    }
}
