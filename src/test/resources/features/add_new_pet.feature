Feature: Add a new pet to the store

  Scenario: Create a pet
    When add a new pet with name 'Jacobo'
    Then the 'Jacobo' is created correctly