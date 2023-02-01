package bdd.steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class HitEndPoint {
private Response response;


    @Given("^I hit the endpoint$")
    public void iHitTheEndpoint() throws Throwable {
        response = given()
                .when()
                .get("http://localhost:8080/codes?code=200")
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

