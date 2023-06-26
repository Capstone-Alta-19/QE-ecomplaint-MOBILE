@RegisterPage
  Feature: Register

    @User @Authentication @Register @Positive
    Scenario: User can register with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Buat Akun Baru
      And User input register Username "randomFullName"
      And User input register Email "randomEmail"
      And User input register Nomor Whatsapp "08123456789"
      And User input register Password "12345678"
      And User input register Confirm Password "12345678"
      And User click Daftar button
      Then User see register message "Register Berhasil"

    @User @Authentication @Register @Negative
    Scenario: User can register with invalid data wrong Email
      Given User open complaintz app
      And User click Skip button
      And User click Buat Akun Baru
      And User input register Username "randomFullName"
      And User input register Email "randomEmail"
      And User input register Nomor Whatsapp "08123456789"
      And User input register Password "12345678"
      And User input register Confirm Password "salahpass"
      And User click Daftar button
      Then User see register message "Username atau password salah"