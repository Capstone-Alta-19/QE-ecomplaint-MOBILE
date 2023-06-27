@Status
  Feature: Status

    @User @Status @See @Positive
    Scenario: User can see status with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      And User click Riwayat Laporan Button
      And User go to Riwayat Laporan Page
      And User click Detail Button
      Then User see Status Complaint