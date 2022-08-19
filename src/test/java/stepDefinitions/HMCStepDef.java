package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDef {

    HMCPage hmcPage=new HMCPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
    hmcPage.logIn.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
    hmcPage.userName.sendKeys(ConfigReader.getProperty("manager"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
    hmcPage.password.sendKeys(ConfigReader.getProperty("Manager1!"));
    }
    @Then("Log in butonuna tiklar")
    public void log_in_butonuna_tiklar() {
    hmcPage.Log2In.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {

    }
}
