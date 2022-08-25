Feature: dogru kullanici adi ve sifre ile giris yapilabilmeli
@hmc
  Scenario: Positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Log in butonuna tiklar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir


