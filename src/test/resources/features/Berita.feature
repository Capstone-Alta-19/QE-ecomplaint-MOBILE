@Berita
  Feature: Berita

    @User @Berita @See @Positive
    Scenario: User can see berita with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User click Lihat Berita Terkini button
      And User go to Berita page
      And User click one of the Berita
