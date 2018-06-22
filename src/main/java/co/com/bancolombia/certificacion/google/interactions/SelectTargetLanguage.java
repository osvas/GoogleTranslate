package co.com.bancolombia.certificacion.google.interactions;

import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.TARGET_LANGUAGE;
import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.TARGET_LANGUAGE_OPTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTargetLanguage implements Interaction{
	private String targetLanguage;
	
	public SelectTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(TARGET_LANGUAGE_OPTION),
				Click.on(TARGET_LANGUAGE.of(targetLanguage)));
	}

	public static SelectTargetLanguage called(String targetLanguage) {
		return Tasks.instrumented(SelectTargetLanguage.class, targetLanguage);
	}

}
