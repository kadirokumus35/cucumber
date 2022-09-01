Feature:register yapabilmeli

  @auto
  Scenario:uygun datalarla register olabilmeli
    Given kullanici "automationUrl" anasayfasinda
    And kullanici sign in linkine tiklar
    And kullanici Create and account bolumune email adresi girer
    And Create and account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici register butonuna basar
    And hesap olustugunu dogrular
    And sayfayi kapatir