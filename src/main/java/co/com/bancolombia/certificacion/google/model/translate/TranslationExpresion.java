package co.com.bancolombia.certificacion.google.model.translate;

public class TranslationExpresion {
	private String word;
	private String sourceLanguage;
	private String targetLanguage;

	public TranslationExpresion(String word, String sourceLanguage, String targetLanguage) {
		this.word = word;
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
	}

	public String getWord() {
		return word;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

}
