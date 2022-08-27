package stepDefinitions;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY);
        cap.setVersion("104.0.5112.102");

        ChromeOptions options=new ChromeOptions();
        options.merge(cap);

        String hubUrl="http://192.168.1.126:4444";

        WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
        driver.get("https://medunna.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
}
