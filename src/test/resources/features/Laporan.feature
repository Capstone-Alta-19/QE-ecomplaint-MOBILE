@Laporan
  Feature: Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Dosen dan Staf Akademik with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Dosen dan Staf Akademik button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Sarana dan Prasarana with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Sarana dan Prasarana button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Sistem Perkuliahan with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Sistem Perkuliahan button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Organisasi Mahasiswa with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Organisasi Mahasiswa button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Organisasi Mahasiswa with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Sesama Mahasiswa button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

    @User @Laporan @See @Positive
    Scenario: User can see laporan Lainnya with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User see Kategori section
      And User click Lihat Semua button
      And User see all category
      And User click Lainnya button
      And User go to Laporan page
      And User click Selengkapnya button
      Then User see komentar of Laporan

