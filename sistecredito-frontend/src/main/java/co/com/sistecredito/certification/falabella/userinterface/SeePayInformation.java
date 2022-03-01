package co.com.sistecredito.certification.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SeePayInformation {

  public static final Target INFORMATION_CARD_PAY =
      Target.the("price with gift card")
          .locatedBy(
              "//*[@id=\"fbra_checkoutAddGiftCard\"]//div[contains(text(),'Pagar con Gift Card o Tarjeta de Novios')]");
}
