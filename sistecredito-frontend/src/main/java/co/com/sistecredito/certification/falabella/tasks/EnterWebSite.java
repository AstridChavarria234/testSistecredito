package co.com.sistecredito.certification.falabella.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

public class EnterWebSite implements Task {
  EnvironmentVariables environmentVariable;

  public static EnterWebSite falabella() {
    return instrumented(EnterWebSite.class);
  }

  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Open.url(String.valueOf(environmentVariable.getProperty("environments.default.baseurl"))));
  }
}
