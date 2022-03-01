package co.com.sistecredito.certification.falabella.tasks;

import static co.com.sistecredito.certification.falabella.userinterface.EnterDeliveryInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class EnterDeliveryInformation implements Task {

  private final String department;
  private final String city;
  private final String neighborhood;
  private final String email;

  public EnterDeliveryInformation(
      String department, String city, String neighnorhood, String email) {
    this.department = department;
    this.city = city;
    this.neighborhood = neighnorhood;
    this.email = email;
  }

  public static EnterDeliveryInformation falabella(
      String department, String city, String neighborhood, String email) {
    return instrumented(EnterDeliveryInformation.class, department, city, neighborhood, email);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        WaitUntil.the(BTN_PURCHASE, isEnabled()),
        Click.on(BTN_PURCHASE),
        Enter.theValue(email).into(TXT_EMAIL),
        SelectFromOptions.byVisibleText(department.toUpperCase()).from(DRP_DEPARTMENT),
        SelectFromOptions.byVisibleText(city.toUpperCase()).from(DRP_CITY),
        SelectFromOptions.byVisibleText(neighborhood.toUpperCase()).from(DRP_NEIGHBORHOOD),
        Click.on(BTN_CONTINUE_INFORMATION));
  }
}
