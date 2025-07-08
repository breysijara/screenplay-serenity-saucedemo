package com.breysi.screenplay.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class ProductPage {

    public static final Target SEARCH_INPUT = Target.the("input de búsqueda").located(By.id("search_input"));

    public static Target productByName(String name) {
        return Target.the("producto por nombre")
                .located(By.xpath("//div[@class='inventory_item_name' and contains(text(),'" + name + "')]"));
    }
}
