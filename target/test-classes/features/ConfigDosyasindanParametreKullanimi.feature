Feature: parametre ile config file kullanilabilmeli


  Scenario: TC01 config proper dosyasindan parametre kullanimi
    Given kullanici "amazonUrl" anasayfasinda
    And kullanici 3 saniye bekler
    And url'in "amazon" icerdigini test eder
    And sayfayi kapatir