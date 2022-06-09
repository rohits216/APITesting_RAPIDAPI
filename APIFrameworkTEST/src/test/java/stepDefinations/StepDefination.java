package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
//import io.restassured.path.json.JsonPath;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Root;
import pojo.Response;
import pojo.Cases;
import pojo.Deaths;
import pojo.Parameters;
import pojo.Tests;


import static org.hamcrest.Matchers.*;



public class StepDefination  {
	@JsonIgnoreProperties

	List<Response> resp;
	Root root;
	int total, recovered, newcases, active;

	@Given("user calls COVID API with GET http request")
	public void user_calls_COVID_API_with_GET_http_request() {

		Root root = given().log().all().queryParam("country", "usa").queryParam("day", "2020-06-02")
				.header("Content-Type", "application/json")
				.header("X-RapidAPI-Key", "***********")
				.header("X-RapidAPI-Host", "covid-193.p.rapidapi.com").when()
				.get("https://covid-193.p.rapidapi.com/history").as(Root.class);

		// System.out.println( root.getResponse());
		resp = root.getResponse();
		
	}

	@When("user gets response in JSON")
	public void user_gets_response_in_JSON() {
		for (Response element : resp) {
			total = element.getCases().getTotal();
			recovered = element.getCases().getRecovered();
			newcases = element.getCases().getNew();
			active = element.getCases().getActive();
			//		System.out.println("Total : " + total);
			//		System.out.println("Recovered : " + recovered);
			//		System.out.println("New : " + newcases);
			//		System.out.println("Active : " + active);

		}
	}

	@Then("the API call got success with status code")
	public void the_API_call_got_success_with_status_code() {
		// GET operation
		given().header("X-RapidAPI-Key", "328d7f0abbmsh266b5ab34494caep1aa7aajsndbfed578046e")
		.header("X-RapidAPI-Host", "covid-193.p.rapidapi.com").when()
		.get("https://covid-193.p.rapidapi.com/history").then().assertThat().statusCode(200);
		// verify status code as 200

	}

	@Then("the response has cases history")
	public void the_response_has_cases_history() {
		System.out.println("Number of records" + resp.size());
		System.out.println("Total cases EOD : " + resp.get(47).getCases().getTotal());
	}

	@Then("verify total is equal to addition of Active Death and Recovered")
	public void verify_total_is_equal_to_addition_of_Active_Death_and_Recovered() {

		int total1 = 106921;
		int deaths = (total - (active + recovered));
		// System.out.println("Deaths : " + deaths);
		assertEquals(total1, deaths);
	}

}
