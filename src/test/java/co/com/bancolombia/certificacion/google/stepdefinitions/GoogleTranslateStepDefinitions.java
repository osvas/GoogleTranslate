package co.com.bancolombia.certificacion.google.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.google.model.translate.Translate;
import co.com.bancolombia.certificacion.google.questions.TheResult;
import co.com.bancolombia.certificacion.google.tasks.GoTo;
import co.com.bancolombia.certificacion.google.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.google.userinterface.GoogleAppsComponent;
import co.com.bancolombia.certificacion.google.userinterface.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;

	private Actor susan = Actor.named("Susan");

	private GoogleHomePage googleHomePage;

	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that Susan wants to use Google Translate$")
	public void thatSusanWantsToUseGoogleTranslate() {
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage), GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^She translates the word (.*) from (.*) to (.*)$")
	public void sheTranslatesTheWordFromTo(String word, String sourceLanguage, String targetLanguage) {
		susan.attemptsTo(Translate.theExpressionDefinedBy().the(word).from(sourceLanguage).to(targetLanguage));
	}

	@Then("^she should see the word (.*) en the screen$")
	public void sheShouldSeeTheWordTheScreen(String expectedWord) {
		susan.should(seeThat(TheResult.is(), equalTo(expectedWord)));
	}
}
