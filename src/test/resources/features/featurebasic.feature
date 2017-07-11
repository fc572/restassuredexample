
Feature: hit an endpoint

  As a tester
  I would restassured help with API
  So I can have a boilerplate


  Scenario: Successful GET request
    Given I hit the endpoint
    When I receive the response
    Then the response code is 200

