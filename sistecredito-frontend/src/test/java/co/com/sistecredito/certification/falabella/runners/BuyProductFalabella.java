package co.com.sistecredito.certification.falabella.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/buyproduct.feature",
    glue = {"co.com.sistecredito.certification.falabella.stepdefinitions"})
public class BuyProductFalabella {}
