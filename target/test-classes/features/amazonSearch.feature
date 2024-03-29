@tumu
Feature: Amazon Search

  @nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @java @ikisi @pr1
    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

      @iphone @pr2
      Scenario: TC03 kullanici amazonda iphone aratir
        When kullanici amazon anasayfasinda
        And kullanici iphone icin arama yapar
        And sonuclarin iphone icerdigini test eder
        And sayfayi kapatir