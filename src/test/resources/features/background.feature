Feature: Kullanici ortak adimlari background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

@pr1
    Scenario: TC01 amazon nutella arama
      And kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir


      Scenario: TC02 amazon java arama
        And kullanici Java icin arama yapar
        And sonuclarin Java icerdigini test eder
        And sayfayi kapatir