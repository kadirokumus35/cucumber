Feature: web tablosundaki istenen isimleri yazdirma

  Scenario: sutun basligi ile liste alabilme
    Given kullanici "guruUrl" anasayfasinda
    And "CompanyList" sutunundaki tum degerleri yazdirir
    And sayfayi kapatir

