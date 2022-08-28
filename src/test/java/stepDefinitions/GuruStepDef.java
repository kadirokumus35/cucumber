package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDef {

    GuruPage guruPage=new GuruPage();
    @Given("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
//Driver.getDriver().switchTo().frame(guruPage.iframe);
        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        int istenenBaslikListesi=-3;
        for (int i = 0; i < tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikListesi=i+1;
                break;
            }
        }

        if (istenenBaslikListesi != -3){
            List<WebElement> istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikListesi+"]"));
            for (WebElement each:istenenSutundakiElementler) {
                System.out.println(each.getText());
            }
        }else {
            System.out.println("baslik bulunamadi");
        }
    }
}
