Feature:  kullanici excel bilgilerine ulasir
@excell
  Scenario: kullanici excel bilgilerini kullanir

    Given kullanici excel dosyasini kullanilabilir hale getirir
    Then 1.satirdaki 2.hucreyi yazdirir
    And baskenti Jakarta olan ulke ismini yazdirir
    And Ulke sayisinin 191 oldugunu test eder
    And Fiziki olarak kullanilan satir sayisinin 192 oldugunu test eder