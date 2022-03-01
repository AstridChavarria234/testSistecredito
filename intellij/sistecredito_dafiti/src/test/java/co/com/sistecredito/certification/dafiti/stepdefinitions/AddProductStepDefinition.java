package co.com.sistecredito.certification.dafiti.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddProductStepDefinition {

  @Given("that a customer wants to buy a product")
  public void registerDafiti() {
    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("rene");
  }

  @When("choose the product to buy")
  public void chooseTheProductToBuy() {}

  @Then("should see the product in the shopping cart")
  public void shouldSeeTheProductInTheShoppingCart() {}
}
