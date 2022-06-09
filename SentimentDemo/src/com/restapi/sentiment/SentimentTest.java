package com.restapi.sentiment;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReUsableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class SentimentTest {

	
    @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
	 return new Object[][] {{"I love the service"}, {"I hate the service"}};
     }
    
    
    @Test (dataProvider = "data-provider")
    public void myTest (String val) {
        //System.out.println("Passed Parameter Is : " + val);
        
        RestAssured.baseURI= "https://sentiment-analysis9.p.rapidapi.com/sentiment";
		String response=given().log().all().header("Content-Type","application/json")
		.header("X-RapidAPI-Key","**********")
		.header("X-RapidAPI-Host","sentiment-analysis9.p.rapidapi.com")
		.body(payload.AddPlace(val))
		.when().post("https://sentiment-analysis9.p.rapidapi.com/sentiment")
		.then().assertThat().statusCode(200)
		.header("server", "RapidAPI-1.2.8").extract().response().asString();
		
		//System.out.println(response);
		JsonPath js=new JsonPath(response); //for parsing Json
		JsonPath js1=ReUsableMethods.rawToJson(response);
		String placeId=js.getString("predictions");
		String placeId1=js1.getString("predictions.prediction");
		
		//System.out.println(placeId);
		System.out.println(placeId1);
    }
   
	
}
