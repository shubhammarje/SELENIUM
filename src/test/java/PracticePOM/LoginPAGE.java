package PracticePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPAGE
{
    //define all variable
    //initilize all variable in constructor
    //utilize all varaibale in method

    @FindBy(xpath = "//input[@placeholder='Username']")private WebElement UN;
    @FindBy(xpath = "//input[@placeholder='Password']")private WebElement PWD;
    @FindBy(xpath = "//input[@id='login-button']")private WebElement LoginBUTTON;

    //Step 2-
    public LoginPAGE(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
    }

    //Step 3-
    public void EnterUN(String username)
    {
       UN.sendKeys(username);
    }
    public void EnterPWD(String password)
    {
        PWD.sendKeys(password);
    }
    public void ClickLoginButton()
    {
        LoginBUTTON.click();
    }



}
