package co.com.bancolombia.certificacion.google.tasks;

import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA;
import static co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage.TRANSLATE_BUTTON;

import co.com.bancolombia.certificacion.google.interactions.SelectSourceLanguage;
import co.com.bancolombia.certificacion.google.interactions.SelectTargetLanguage;
import co.com.bancolombia.certificacion.google.model.translate.TranslationExpresion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TranslateTheExpression implements Task {
	private TranslationExpresion translationExpresion;

	public TranslateTheExpression(TranslationExpresion translationExpresion) {
		this.translationExpresion = translationExpresion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectSourceLanguage.called(translationExpresion.getSourceLanguage()),
				SelectTargetLanguage.called(translationExpresion.getTargetLanguage()),
				Enter.theValue(translationExpresion.getWord()).into(SOURCE_LANGUAGE_TEXTAREA),
				Click.on(TRANSLATE_BUTTON));
	}

}
