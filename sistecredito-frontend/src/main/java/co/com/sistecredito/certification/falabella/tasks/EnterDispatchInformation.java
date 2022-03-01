package co.com.sistecredito.certification.falabella.tasks;

import static co.com.sistecredito.certification.falabella.userinterface.EnterDispatchInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class EnterDispatchInformation implements Task {

  private final String address;
  private final String aptoNumber;

  public EnterDispatchInformation(String address, String aptoNumber) {
    this.address = address;
    this.aptoNumber = aptoNumber;
  }

  public static EnterDispatchInformation falabella(String address, String aptoNumber) {
    return instrumented(EnterDispatchInformation.class, address, aptoNumber);
  }

  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(address).into(TXT_ADDRESS),
        Enter.theValue(aptoNumber).into(TXT_APTO_NUMBER),
        Click.on(BTN_USE_ADDRESS),
        WaitUntil.the(BTN_CONTINUE_PAY, isVisible()),
        Click.on(BTN_CONTINUE_PAY));
  }
}
