package co.com.bancolombia.certificacion.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;;

public class OpenTheBrowser implements Task {
	private PageObject page;

	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
		//Esta es otra manera de hacerlo por si hay que presionar sobre un popup
		/*actor.attemptsTo(Open.browserOn(page),
				Click.on(GoogleHomePage.CLOSE_POP_UP));*/
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}

}
