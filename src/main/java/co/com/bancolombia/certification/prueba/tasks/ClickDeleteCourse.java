package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.BTN_DELETE_COURSE;

public class ClickDeleteCourse implements Task {

    public static ClickDeleteCourse clickDeleteCourse() {

        return Tasks.instrumented(ClickDeleteCourse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_DELETE_COURSE).afterWaitingUntilEnabled());
    }
}

