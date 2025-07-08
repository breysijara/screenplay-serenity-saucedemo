package stepdefinitions;

import com.breysi.screenplay.questions.LoginValidation;
import com.breysi.screenplay.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinitions {
    @Before
    public void setTheStage() {
        // Esto es lo que inicializa los actores (obligatorio)
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que Breysi abre la página de SauceDemo")
    public void queBreysiAbreLaPaginaDeSauceDemo() {
        OnStage.theActorCalled("Breysi").wasAbleTo(Open.url("https://www.saucedemo.com/v1/"));
    }

    @When("inicia sesión con el usuario {string} y la contraseña {string}")
    public void iniciaSesionConElUsuarioYLaContrasena(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.with(usuario, contrasena));
    }

    @Then("debería ver el título de productos")
    public void deberiaVerElTituloDeProductos() {
         OnStage.theActorInTheSpotlight().should(seeThat(LoginValidation.isVisible(), is(true)));
    }
}
