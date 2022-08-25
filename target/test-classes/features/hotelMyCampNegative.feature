Feature: dogru kullanici adi ve sifre ile giris yapilabilmeli

Scenario: yanlis kullanici adi ile giris yapilamaz
Given kullanici "HMCUrl" anasayfasinda
Then Log in yazisina tiklar
And gecersiz username girer
And gecerli password girer
And Log in butonuna tiklar
Then sayfaya giris yaptigini kontrol eder
And sayfayi kapatir