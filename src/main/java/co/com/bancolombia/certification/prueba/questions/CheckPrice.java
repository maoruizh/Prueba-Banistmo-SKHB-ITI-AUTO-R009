package co.com.bancolombia.certification.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.TXT_CHECK_PRICE;

public class CheckPrice implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

    return TXT_CHECK_PRICE.resolveFor(actor).getText().equals("₹153.00");//todo el valor correcto es 153.00
    }

    public static CheckPrice checkPrice() {
        return new CheckPrice();
    }
}
