@RunnerTags
Feature: Quotation of an auteco bike

  @Action
  Scenario: to quote a bike using the auteco tool

    Given That User wants to quote a bike
    When he Enters the quote section
      |name|email         |cellphone |payment|area     |city    |
      |John|John@gmail.com|1234567890|Crédito|Antioquia|Medellin|
    Then he verifies the message "Total"


  @Option
  Scenario: Alternative flux

