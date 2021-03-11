package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Ej3ApI {

    Response response;
    String token;

    @When("Envio un Get a {}")
    public void envioUnGetAHttpsTodoLyApiAuthenticationTokenJson(String url) {
        response = given().
                auth().
                preemptive().
                basic("mautest@mautest.com","1234").
                contentType(ContentType.JSON).
                log().
                all().
                when().
                get(url);
    }

    @Then("Verifico que el codigo de respuesta sea {int}")
    public void verificoQueElCodigoDeRespuestaSea(int code) {
        response.then().statusCode(code);
    }

    @When("Envio un Delete a {}")
    public void envioUnDeleteAHttpsTodoLyApiAuthenticationTokenJson(String url) {
        response = given().
                auth().
                preemptive().
                basic("mautest@mautest.com","1234").
                contentType(ContentType.JSON).
                log().
                all().
                when().
                get(url);
    }
}
