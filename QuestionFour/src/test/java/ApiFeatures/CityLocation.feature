#Author: harbir.sandhu@---
#Keywords Summary : CityBikes, API, Assignment, BDD

Feature: 	As a user
					I want to verify that the city Frankfurt is in Germany
					So that we can return the city’s corresponding latitude and longitude

Scenario: GET CityBikes Location
	Given I set GET api endpoint
	When I send GET HTTP request
	Then I receive valid HTTP response code for GET
	And I  receive valid response body  
