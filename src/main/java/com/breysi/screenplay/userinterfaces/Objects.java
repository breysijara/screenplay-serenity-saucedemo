
package com.breysi.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Objects {
    public static final Target USERNAME = Target.the("Campo de usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Campo de contraseña").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Botón de login").located(By.id("login-button"));
    public static final Target PRODUCTS_TITLE = Target.the("Título productos").located(By.className("product_label"));
}
