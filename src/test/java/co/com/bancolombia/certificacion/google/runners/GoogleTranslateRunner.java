package co.com.bancolombia.certificacion.google.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/google_translate.feature",
		glue = "co.com.bancolombia.certificacion.google.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class GoogleTranslateRunner {

}
