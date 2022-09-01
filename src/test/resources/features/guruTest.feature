Feature: web tablosundaki istenen isimleri yazdirma
@pr2
  Scenario: sutun basligi ile liste alabilme
    Given kullanici "guruUrl" anasayfasinda
    And "Company" sutunundaki tum degerleri yazdirir
    And sayfayi kapatir

