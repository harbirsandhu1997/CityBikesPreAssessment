# CityBikesPreAssessment

CityBikesPreAssessment is only a demo project. Further development has stopped. 

## Description

This project contains the code to my solution for creating a Java Steps Defintion file to test the following Scenario:
As a user I want to verify that the city Frankfurt is in Germany and that we can return the city’s corresponding latitude and longitude.

## Key Contents

Feature File - Contains the Feature and Scenario using the BDD approach with Given, Then, When keywords. 
Steps Definitions File - Java Step Definitions for the feature file
Runner Class - Calls the Feature File and Steps Definitions File to run the Test

## Installation

Download the code...

## Usage

1. Using a Java IDE of your choice, navigate to /QuestionFour/src/test/java/runners/TestRunner.java
2. Right Click
3. Run As
4. 1 JUnit Test

## Consolte Output

The Test should pass without any Errors or Failures and print the following in the Console:

```Response returned as: {"network":{"location":{"city":"Frankfurt","country":"DE","latitude":50.1072,"longitude":8.66375}}}
```

## Test Feature

```Feature: 	As a user
			I want to verify that the city Frankfurt is in Germany
			So that we can return the city’s corresponding latitude and longitude
```

## Test Scenario

```Scenario: GET CityBikes Location
	Given I set GET api endpoint
	When I send GET HTTP request
	Then I receive valid HTTP response code for GET
	And I  receive valid response body  
```

## Author and acknowledgment

Author: Harbir Sandhu
Acknowledgment: the brilliant team at CityBikes and their API https://api.citybik.es/v2/
