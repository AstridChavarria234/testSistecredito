package co.com.sistecredito.certification.falabella.tasks;

import static co.com.sistecredito.certification.falabella.userinterface.ChooseProduct.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChooseProduct implements Task {

  private final String product;
  private final String feature;

  public ChooseProduct(String product, String feature) {
    this.product = product;
    this.feature = feature;
  }

  public static ChooseProduct falabella(String product, String feature) {

    return instrumented(ChooseProduct.class, product, feature);
  }

  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        WaitUntil.the(IMG_PRODUCT.of(String.format("%s-%s", product, feature)), isEnabled()),
        Click.on(IMG_PRODUCT.of(String.format("%s-%s", product, feature))));

    actor.attemptsTo(Click.on(ADD_PRODUCT), Click.on(SEE_PRODUCT));
  }
}
