package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CityLocationSteps {
	
	String baseUri = "http://api.citybik.es/v2/networks";
	RequestSpecification REQ_SPEC;
	Response RESP;
	ValidatableResponse VAL_RESP;

	@Given("I set GET api endpoint")
	public void i_set_get_api_endpoint() {
		REQ_SPEC = given().baseUri(baseUri);
	}

	@When("I send GET HTTP request")
	public void i_send_get_http_request() {
		RESP = REQ_SPEC.when().get("/visa-frankfurt?fields=location");
		System.out.println("Response returned as: "+RESP.asString());
	}

	@Then("I receive valid HTTP response code for GET")
	public void i_receive_valid_http_response_code_for_get() {
		VAL_RESP = RESP.then();
		VAL_RESP.statusCode(200);
	}
	
	@Then("I  receive valid response body")
	public void i_receive_valid_response_body() {
		VAL_RESP.assertThat().body(containsString("Frankfurt")).
		and().body(containsString("DE")).
		and().body(containsString("50.1072")).
		and().body(containsString("8.66375"));
	}

}