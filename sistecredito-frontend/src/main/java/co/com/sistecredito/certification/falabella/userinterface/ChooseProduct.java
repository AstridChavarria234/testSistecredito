package co.com.sistecredito.certification.falabella.userinterface;

import static org.openqa.selenium.By.id;

import net.serenitybdd.screenplay.targets.Target;

public class ChooseProduct {

  public static final Target IMG_PRODUCT =
      Target.the("Choose product").locatedBy("//a[contains(@href, '{0}')]");

  public static final Target ADD_PRODUCT =
      Target.the("Add product").located(id("buttonForCustomers"));

  public static final Target SEE_PRODUCT = Target.the("See product").located(id("linkButton"));

  public static final Target PRICE_PRODUCT_INITIAL =
      Target.the("Choose product").locatedBy("//div[@class='fb-pod__prices']//span");
}
