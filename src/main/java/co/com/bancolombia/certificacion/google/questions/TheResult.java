package co.com.bancolombia.certificacion.google.questions;

import co.com.bancolombia.certificacion.google.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXTAREA).viewedBy(actor).asString();
	}

	public static TheResult is() {
		
		return new TheResult();
	}

}
