Feature: kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

     Examples:
       |istenenKelime| istenenKelimeKontrol|
    |             nutella|nutella       |
    |             java|java             |
    |             elma|elma             |
    |             armut|armut           |