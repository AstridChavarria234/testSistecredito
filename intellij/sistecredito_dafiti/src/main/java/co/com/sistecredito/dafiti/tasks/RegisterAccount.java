package co.com.sistecredito.dafiti.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RegisterAccount implements Task {

  private final String product;
  private final String feature;

  public RegisterAccount(String product, String feature) {
    this.product = product;
    this.feature = feature;
  }

  public static RegisterAccount dafiti(String product, String feature) {

    return instrumented(RegisterAccount.class, product, feature);
  }

  public <T extends Actor> void performAs(T actor) {}
}
