package co.com.bancolombia.certificacion.google.model;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.google.model.translate.TranslationExpresion;
import co.com.bancolombia.certificacion.google.tasks.TranslateTheExpression;
import co.com.bancolombia.certificacion.google.util.Languages;

public class TranslateBuilder {
	private String word;
	private String sourceLanguage;

	public TranslateBuilder the(String word) {
		this.word = word;
		return this;
	}

	public TranslateBuilder from(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		return this;
	}

	public TranslateTheExpression to(String targetLanguage) {
		return instrumented(TranslateTheExpression.class,
				new TranslationExpresion(word, Languages.valueOf(sourceLanguage.toUpperCase()).language(),
						Languages.valueOf(targetLanguage.toUpperCase()).language()));
	}

}
