#created by: Kriti agrawal
Feature: To display the query to be searched by user in google.
Scenario: To display the query to be searched by user in google.
Given user lands on google home page
When searches for a query "holocaust"
Then display the query in console
