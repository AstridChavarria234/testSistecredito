package co.com.sistecredito.certification.falabella.tasks;

import static co.com.sistecredito.certification.falabella.userinterface.SeePayInformation.INFORMATION_CARD_PAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SavePayInformation implements Task {

  public static SavePayInformation falabella() {
    return instrumented(SavePayInformation.class);
  }

  public <T extends Actor> void performAs(T actor) {

    actor.remember("Information Pay Product", INFORMATION_CARD_PAY.resolveFor(actor).getText());
  }
}
