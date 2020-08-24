@RunnerTags
Feature: Open the Banitsmo rate document

  @Rate
  Scenario: I as a Banitsmo client want to see the PDF document, so i can search the Rate

    Given That Cristian wants to open the personas section at Banitsmo page
    When he access the the banitsmo landing page named personas and get to the PDF document
    Then he should see open a new file with the selected PDF


  @Option
  Scenario: I as a Banitsmo client want to see the PDF document, in a different Rate option

    Given That Cristian wants to create a category in the blog section
    When he access the the banitsmo landing page named personas and get to a different PDF document
    Then he should see the PDF file
