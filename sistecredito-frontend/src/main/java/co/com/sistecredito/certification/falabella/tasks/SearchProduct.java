package co.com.sistecredito.certification.falabella.tasks;

import static co.com.sistecredito.certification.falabella.userinterface.SearchFalabella.BTN_SEARCH_PRODUCT;
import static co.com.sistecredito.certification.falabella.userinterface.SearchFalabella.TXT_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchProduct implements Task {
  private final String product;
  private final String feature;

  public SearchProduct(String product, String feature) {
    this.product = product;
    this.feature = feature;
  }

  public static SearchProduct falabella(String product, String feature) {
    return instrumented(SearchProduct.class, product, feature);
  }

  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Click.on(TXT_PRODUCT),
        Enter.theValue(String.format("%s %s", product, feature)).into(TXT_PRODUCT),
        Click.on(BTN_SEARCH_PRODUCT));
  }
}
