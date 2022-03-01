package co.com.sistecredito.certification.falabella.stepdefinitions.frontend;

import static co.com.sistecredito.certification.falabella.utils.EnumFailMessages.PAY_MESSAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import co.com.sistecredito.certification.falabella.questions.PayInformation;
import co.com.sistecredito.certification.falabella.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import net.serenitybdd.screenplay.GivenWhenThen;

public class BuyProductStepDefinition {

  @Given("that a customer wants to buy a product")
  public void loginFalabella() {
    theActorInTheSpotlight().attemptsTo(EnterWebSite.falabella());
  }

  @When("choose the product to buy")
  public void chooseTheProductToBuy(Map<String, String> productInformation) {

    theActorInTheSpotlight()
        .attemptsTo(
            SearchProduct.falabella(
                productInformation.get("Product"), productInformation.get("Feature Product")));

    theActorInTheSpotlight()
        .attemptsTo(
            ChooseProduct.falabella(
                productInformation.get("Product"), productInformation.get("Feature Product")));

    theActorInTheSpotlight()
        .attemptsTo(
            EnterDeliveryInformation.falabella(
                productInformation.get("Department"),
                productInformation.get("City"),
                productInformation.get("Neighborhood"),
                productInformation.get("Email")));

    theActorInTheSpotlight()
        .attemptsTo(
            EnterDispatchInformation.falabella(
                productInformation.get("Address"), productInformation.get("Apto Number")));
    theActorInTheSpotlight().attemptsTo(SavePayInformation.falabella());
  }

  @Then("should see the payment information")
  public void checkPriceProduct() {

    theActorInTheSpotlight()
        .should(GivenWhenThen.seeThat(PayInformation.get(), equalTo(PAY_MESSAGE.getFailMessage())));
  }
}
