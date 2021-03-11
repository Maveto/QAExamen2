package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class EjApi1 {

    Response response;

    @Given("Tengo acceso a Todo.ly")
    public void tengoAccesoATodoLy() {

    }

    @When("Envio una peticion POST a {} con el json")
    public void envioUnaPeticionPOSTAHttpsTodoLyApiUserJsonConElJson(String url, String body) {
        response = given().
                contentType(ContentType.JSON).
                body(body).
                log().all().
                when().post(url);
    }

    @Then("Reviso que el codigo del response sea {int}")
    public void revisoQueElCodigoDelResponseSea(int code) {
        response.then().log().all().statusCode(code);
    }

    @And("Reviso que en el response el FullName sea {string}")
    public void revisoQueEnElResponseElFullNameSea(String name) {
        Assert.assertEquals("Error: No se pudo crear o actualizar el ususario", name, response.then().extract().path("FullName"));
    }

    @When("Envio una peticion PUT  a {} autentificado con el usuario {string} y contrasena {string} con el json")
    public void envioUnaPeticionPUTAHttpsTodoLyApiUserJsonAutentificadoConElUsuarioYContrasenaConElJson(String url, String usr, String pwd, String body) {
        response = given().
                auth().
                preemptive().
                basic(usr, pwd).
                contentType(ContentType.JSON).
                body(body).
                log().all().
                when().put(url);
    }
}
