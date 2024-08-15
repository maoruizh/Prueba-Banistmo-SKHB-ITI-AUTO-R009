package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickShoppingCart implements Task {

    public static ClickShoppingCart clickShoppingCart() {
        return Tasks.instrumented(ClickShoppingCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHOPPING_CART).afterWaitingUntilEnabled());
    }
}