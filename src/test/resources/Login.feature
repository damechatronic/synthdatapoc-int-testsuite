Feature: Login
  
  Background:
    Given User is on the landing page

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters a valid user and password
    Then User must be redirected to the inventory page
