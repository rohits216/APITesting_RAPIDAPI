Feature: Validating Place API's

@DeletePlace @Regression
Scenario:  Verify if total is equal to addition of Active Death and Recovered
	Given user calls COVID API with GET http request
	When user gets response in JSON
	Then the API call got success with status code 
	And the response has cases history
	And verify total is equal to addition of Active Death and Recovered


	

	
	
	
	
	
	

	
	
	