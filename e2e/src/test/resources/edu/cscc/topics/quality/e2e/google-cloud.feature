Feature: Google blog page test

# Gherkin is the syntax feature files are written in.  It has the traditional Given/When/Then

Scenario: Link navigates to Google Blog page
  Given I am on the Google Cloud homepage
  When I click "Blog"
  Then I am taken to the Google Cloud Blog page