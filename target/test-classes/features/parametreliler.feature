Feature: parametre kullanarak arama yapabilmeli
@parametre
  Scenario: parametree ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    And sayfayi kapatir

  #tırnak içindeki ve rakamlar dinamik algılanır
  #configde yazarak stepDef calıstırılır yeni stepDef e gerek kalmaz