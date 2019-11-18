Feature: Google Search

	@web
  Scenario: Validate google search text field
    Given I open a browser at location "C:\Users\n.fathima\eclipse-workspace\org.apache.maven.delete2\TestData"
    When I navigate to google page
    Then I validate the search text field