package stepdefinitions;

import com.breysi.screenplay.questions.ProductSearchResult;
import com.breysi.screenplay.tasks.SearchProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ProductoStepdefs {
    @And("busca el producto {string}")
    public void buscaElProducto(String nombreProducto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchProduct.withName(nombreProducto)
        );
    }

    @Then("debería ver el producto {string} en los resultados")
    public void deberíaVerElProductoEnLosResultados(String productoEsperado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ProductSearchResult.isVisible(productoEsperado), is(true))
        );
    }
}
