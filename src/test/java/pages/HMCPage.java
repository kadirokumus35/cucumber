package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HMCPage {
    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
    public WebElement logIn;

    @FindBy (xpath="//*[@class='form-control required']")
    public WebElement userName;

    @FindBy (className = "form-control required password")
    public WebElement password;

    @FindBy (id="btnSubmit")
    public WebElement Log2In;
}
