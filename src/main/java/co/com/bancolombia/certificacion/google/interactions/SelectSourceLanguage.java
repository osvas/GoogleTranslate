package co.com.bancolombia.certificacion.google.interactions;

import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.SOURCE_LANGUAGE;
import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.SOURCE_LANGUAGE_OPTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSourceLanguage implements Interaction {
	private String sourceLanguage;

	public SelectSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SOURCE_LANGUAGE_OPTION), 
				Click.on(SOURCE_LANGUAGE.of(sourceLanguage)));
	}

	public static SelectSourceLanguage called(String sourceLanguage) {

		return Tasks.instrumented(SelectSourceLanguage.class, sourceLanguage);
	}

}
