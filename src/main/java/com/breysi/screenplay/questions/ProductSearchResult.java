package com.breysi.screenplay.questions;

import com.breysi.screenplay.page.ProductPage;
import net.serenitybdd.screenplay.Question;

public class ProductSearchResult {
    public static Question<Boolean> isVisible(String productName) {
        return actor -> ProductPage.productByName(productName).resolveFor(actor).isVisible();
    }
}
