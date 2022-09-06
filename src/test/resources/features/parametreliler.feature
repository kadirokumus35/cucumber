Feature: parametre kullanarak arama yapabilmeli
@pr1
  Scenario: parametree ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    And sayfayi kapatir

  #tırnak içindeki ve rakamlar dinamik algılanır
  #configde yazarak stepDef c  alıstırılır yeni stepDef e gerek kalmaz