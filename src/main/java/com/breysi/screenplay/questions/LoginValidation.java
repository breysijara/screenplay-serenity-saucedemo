
package com.breysi.screenplay.questions;

import com.breysi.screenplay.userinterfaces.Objects;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Objects.PRODUCTS_TITLE.resolveFor(actor).isVisible();
    }

    public static LoginValidation isVisible() {
        return new LoginValidation();
    }
}
