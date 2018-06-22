package co.com.bancolombia.certificacion.google.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {
	public static final Target CLOSE_POP_UP = Target.the("close pop up").locatedBy("//a[@clas='gb_Ba gb_Cd gb_ld']");
}
