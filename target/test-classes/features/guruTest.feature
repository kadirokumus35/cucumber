Feature: web tablosundaki istenen isimleri yazdirma
@guru
  Scenario: sutun basligi ile liste alabilme
    Given kullanici "guruUrl" anasayfasinda
    And "Company" sutunundaki tum degerleri yazdirir
    And sayfayi kapatir

