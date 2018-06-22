package co.com.bancolombia.certificacion.google.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	public static final Target GOOGLE_APPS = Target.the("google apps button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("google translate button").located(By.id("gb51"));
}
