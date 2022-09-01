package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;


public class AutoStepDef {

    AutoPage autoPage=new AutoPage();
    Faker  faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici sign in linkine tiklar")
    public void kullanici_sign_in_linkine_tiklar() {
     autoPage.singInButton.click();
    }
    @Given("kullanici Create and account bolumune email adresi girer")
    public void kullanici_create_and_account_bolumune_email_adresi_girer() {
     autoPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Create and account butonuna basar")
    public void create_and_account_butonuna_basar() {
     autoPage.createAccountButton.click();
    }
    @Given("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
     actions.click(autoPage.gender)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.name().firstName())
             .sendKeys(Keys.TAB)
             .sendKeys(faker.name().lastName())
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.internet().password())
             .sendKeys(Keys.TAB)
             .sendKeys("10")
             .sendKeys("January")
             .sendKeys("2000")
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.company().name())
             .sendKeys(Keys.TAB)
             .sendKeys(faker.address().fullAddress())
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.address().city())
             .sendKeys(Keys.TAB)
             .sendKeys("Alaska")
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.address().zipCode())
             .sendKeys(Keys.TAB)
             .sendKeys("United States")
             .sendKeys(Keys.TAB)
             .sendKeys(Keys.TAB)
             .sendKeys(faker.phoneNumber().phoneNumber())
             .sendKeys(Keys.TAB)
             .sendKeys(faker.phoneNumber().cellPhone())
             .sendKeys(Keys.TAB)
             .sendKeys("ALSK").perform();
    }
    @Given("kullanici register butonuna basar")
    public void kullanici_register_butonuna_basar() {
     autoPage.registerButton.click();
    }
    @Given("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(autoPage.positiveResultText.isDisplayed());
    }
}
