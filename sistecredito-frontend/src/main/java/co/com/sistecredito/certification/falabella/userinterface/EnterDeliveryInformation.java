package co.com.sistecredito.certification.falabella.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public class EnterDeliveryInformation {

  public static final Target BTN_PURCHASE =
      Target.the("Continue purchase").locatedBy("//button[contains(@class, 'continue-purchase')]");

  public static final Target TXT_EMAIL =
      Target.the("Input address email").located(id("emailAddress"));

  public static final Target DRP_DEPARTMENT =
      Target.the("Department dropdown").located(id("region"));

  public static final Target DRP_CITY = Target.the("City dropdown").located(id("ciudad"));

  public static final Target DRP_NEIGHBORHOOD =
      Target.the("neighborhood dropdown").located(id("comuna"));

  public static final Target BTN_CONTINUE_INFORMATION =
      Target.the("Button continue")
          .locatedBy("//div[contains(@class, 'formItem--Button ')]//button");
}
