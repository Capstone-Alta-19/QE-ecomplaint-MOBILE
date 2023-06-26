Feature: Wikipedia

  @QE
  Scenario: Mencari Quality Assurance Engineer di Wikipedia
    Given Aplikasi Wikipedia terbuka
    And Skip pemilihan bahasa
    And Klik search bar
    And Ketik "Quality Assurance Engineer" dan tekan enter
    And Pilih hasil yang pertama
    Then Artikel tentang "Quality Assurance Engineer" sudah muncul

  @Yogyakarta
  Scenario: Mencari Yogyakarta di Wikipedia
    Given Aplikasi Wikipedia terbuka
    And Skip pemilihan bahasa
    And Klik search bar
    And Ketik "Yogyakarta" dan tekan enter
    And Pilih hasil yang pertama
    Then Artikel tentang "Yogyakarta" sudah muncul