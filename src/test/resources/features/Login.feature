@LoginPage
  Feature: Login

    @User @Authentication @Login @Positive
    Scenario: User can login with valid data
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "12345678"
      And User click Masuk button
      Then User see login success message

    @User @Authentication @Login @Negative
    Scenario: User can login with invalid data wrong password
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "halim"
      And User input login Password "salahpass"
      And User click Masuk button
      Then User see login error message

    @User @Authentication @Login @Negative
    Scenario: User can login with invalid data wrong username
      Given User open complaintz app
      And User click Skip button
      And User click Sudah Punya Akun, Masuk button
      And User input login Username or Email "salah"
      And User input login Password "12345678"
      And User click Masuk button
      Then User see login error message

