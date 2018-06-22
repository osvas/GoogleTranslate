package co.com.bancolombia.certificacion.google.util;

public enum Languages {
	ENGLISH("inglés"),
	JAPANESE("japonés"),
	SPANISH("español"),
	KOREAN("coreano");
	
	private String language;
	
	Languages(String language){
		this.language = language;
	}
	
	public String language() {
		return language;
	}
}
