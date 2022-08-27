package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridStepDef {
WebDriver driver;
    @Given("kullanici medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() throws MalformedURLException {
    driver=new RemoteWebDriver(new URL("http://192.168.1.126:4444"),new ChromeOptions());
    driver.manage().window().maximize();
    driver.get("https://medunna.com");

    }
    @Given("sayfa tittle {string} oldugunu test eder")
    public void sayfa_tittle_oldugunu_test_eder(String title) {

        String actualTitle=driver.getTitle();
        String expectedTitle=title;
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("remote driver kapatir")
    public void remote_driver_kapatir() {

        driver.close();
    }

    @Given("kullanici firefox ile medunna sayfasina gider")
    public void kullanici_firefox_ile_medunna_sayfasina_gider() throws MalformedURLException {

        driver=new RemoteWebDriver(new URL("http://192.168.1.126:4444"),new FirefoxOptions());
        driver.manage().window().maximize();
        driver.get("https://medunna.com");
    }


}
