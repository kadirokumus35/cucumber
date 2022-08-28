package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.getDriver;

public class GuruPage {

    public GuruPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikListesi;

    @FindBy(xpath = "//tr//th[1]")
    public List<WebElement> Company;

    @FindBy (id="logwatch")
    public WebElement iframe;

}
