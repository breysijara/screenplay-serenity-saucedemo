
package com.breysi.screenplay.tasks;

import com.breysi.screenplay.userinterfaces.Objects;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask with(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(Objects.USERNAME),
                Enter.theValue(password).into(Objects.PASSWORD),
                Click.on(Objects.LOGIN_BUTTON)
        );
    }
}
