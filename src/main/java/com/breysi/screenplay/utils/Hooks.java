
package com.breysi.screenplay.utils;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());
    }
}
