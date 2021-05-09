# CityBikesPreAssessment

CityBikesPreAssessment is only a demo project. Further development has stopped. 

## Description

This project implements Automated API testing using Rest Assured and Cucumber with Eclipse.

I use the CityBikes API - Documentation can be found at https://api.citybik.es/v2/

I have included the source code to my Feature File which contains the BDD Test Scenario, written in the Gherkin Syntax (Given, When, Then). This Feature File is then mapped with Java Step Definitions. 

## Key Contents

Feature File - Contains the Feature and Test Scenario using a BDD approach

Steps Definitions File - Java Step Definitions for the feature file

Runner Class - Calls the Feature File and Steps Definitions File to run the Test

pom.xml - Contains dependencies, plugins and build properties

## Installation

Download the code using the green dropdown at the top right-handside of the page.

## Usage

1. Using a Java IDE of your choice, navigate to /QuestionFour/src/test/java/runners/TestRunner.java
2. Right Click
3. Run As
4. 1 JUnit Test

## Console Output

The Test should pass without any Errors or Failures and print the following in the Console:

```
Response returned as: {"network":{"location":{"city":"Frankfurt","country":"DE","latitude":50.1072,"longitude":8.66375}}}
```

## Test Feature

```
Feature: 		

	As a user
	I want to verify that the city Frankfurt is in Germany
	So that we can return the city’s corresponding latitude and longitude
```

## Test Scenario

```
Scenario: GET CityBikes Location
	Given I set GET api endpoint
	When I send GET HTTP request
	Then I receive valid HTTP response code for GET
	And I  receive valid response body  
```

## Author and acknowledgment

Author: Harbir Sandhu

Acknowledgment: the brilliant team at CityBikes and their API https://api.citybik.es/v2/
