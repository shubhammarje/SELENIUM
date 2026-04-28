package S3_POMdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage
{

    //POM /Regular Class >>

    @FindBy(xpath = "//input[@placeholder='Username']")private WebElement UN;           //private WebElement UN = driver.FindElement(By.Xpath(""))
    @FindBy(xpath = "//input[@placeholder='Password']")private WebElement PWD;            //private WebElement PWD = driver.FindElement(By.Xpath(""))
    @FindBy(xpath = "//input[@name='login-button']")private WebElement LoginButton;     //private WebElement LoginButton = driver.FindElement(By.Xpath(""))

    //Step 2>>Initilise-------------------------------------
    public  POMLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);         //classname.methodname(Webdriver Object , this keyword)
    }

    // Utilise >> perform Action-----------------------------
    public void EnterUN(String username)
    {
        UN.sendKeys(username);
    }
    public void EnterPwd(String password)
    {
        PWD.sendKeys(password);
    }
    public void ClickButon()
    {
        LoginButton.click();
    }

}
