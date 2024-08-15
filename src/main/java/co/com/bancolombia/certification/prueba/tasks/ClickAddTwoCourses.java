package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.BTN_ADD_COURSE_DATA_STRUCTURE;
import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.BTN_ADD_COURSE_RELENIUM_RUBY;

public class ClickAddTwoCourses implements Task {

    public static ClickAddTwoCourses clickAddTwoCourses() {
        return Tasks.instrumented(ClickAddTwoCourses.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_ADD_COURSE_DATA_STRUCTURE),
                Click.on(BTN_ADD_COURSE_DATA_STRUCTURE).afterWaitingUntilEnabled(),
                Click.on(BTN_ADD_COURSE_RELENIUM_RUBY).afterWaitingUntilEnabled());
    }
}