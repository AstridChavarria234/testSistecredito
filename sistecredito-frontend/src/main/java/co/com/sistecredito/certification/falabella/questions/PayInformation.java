package co.com.sistecredito.certification.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PayInformation implements Question<String> {

  public static PayInformation get() {
    return new PayInformation();
  }

  @Override
  public String answeredBy(Actor actor) {

    return actor.recall("Information Pay Product");
  }
}
