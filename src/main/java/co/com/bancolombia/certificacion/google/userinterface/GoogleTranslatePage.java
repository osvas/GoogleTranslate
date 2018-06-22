package co.com.bancolombia.certificacion.google.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button")
			.located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button")
			.located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE = Target.the("Source language")
			.locatedBy("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(),'{0}')]");
	public static final Target TARGET_LANGUAGE = Target.the("Target language")
			.locatedBy("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td/div//div[contains(text(),'{0}')]");
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea")
			.located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXTAREA = Target.the("Target language textarea")
			.located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate button").located(By.id("gt-submit"));

}
