package co.com.sistecredito.certification.falabella.userinterface;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class SearchFalabella {
  public static final Target TXT_PRODUCT =
      Target.the("Input product to search").located(id("testId-SearchBar-Input"));

  public static final Target BTN_SEARCH_PRODUCT =
      Target.the("Search product").located(xpath("//*[@id=\"testId-search-wrapper\"]/div/button"));

  private SearchFalabella() {}
}
