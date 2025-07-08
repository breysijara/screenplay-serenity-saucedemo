package com.breysi.screenplay.tasks;

import com.breysi.screenplay.page.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {

    private final String product;

    public SearchProduct(String product) {
        this.product = product;
    }

    public static SearchProduct withName(String product) {
        return Tasks.instrumented(SearchProduct.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product).into(ProductPage.SEARCH_INPUT)
        );
    }
}
