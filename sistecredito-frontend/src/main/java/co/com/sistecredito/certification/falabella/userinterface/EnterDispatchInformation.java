package co.com.sistecredito.certification.falabella.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public class EnterDispatchInformation {

  public static final Target TXT_ADDRESS = Target.the("Address dispatch").located(id("address"));

  public static final Target TXT_APTO_NUMBER =
      Target.the("Apto number").located(id("departmentNumber"));

  public static final Target BTN_USE_ADDRESS =
      Target.the("Use address").locatedBy("//div[contains(@class, 'useAddress')]");

  public static final Target BTN_CONTINUE_PAY =
      Target.the("Button continue")
          .locatedBy("//button[contains(@class, 'checkoutComponentDeliveryActions')]");
}
