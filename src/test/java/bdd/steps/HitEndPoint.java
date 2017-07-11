package bdd.steps;


import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class HitEndPoint {
private Response response;


    @Given("^I hit the endpoint$")
    public void iHitTheEndpoint() throws Throwable {
        response = given().basePath("http://fc572.herokuapp.com/httpcodes/200")
                .when()
                .get()
                .thenReturn();
    }

    @When("^I receive the response$")
    public void iReceiveTheResponse() throws Throwable {
        assertThat(response, is(notNullValue()));
    }

    @Then("^the response code is (\\d+)$")
    public void theResponseCodeIs(int arg0) throws Throwable {
        response.then().statusCode(arg0);
    }
}

