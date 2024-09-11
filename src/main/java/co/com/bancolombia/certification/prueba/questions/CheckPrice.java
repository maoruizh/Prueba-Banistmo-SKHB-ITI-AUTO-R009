package co.com.bancolombia.certification.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.bancolombia.certification.prueba.userinterfaces.PracticeAutomationTesting.TXT_CHECK_PRICE;

public class CheckPrice implements Question<Boolean> {
    private final double maxPrice;

    public CheckPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String value = TXT_CHECK_PRICE.resolveFor(actor).getText(); // todo toma el valor del elemento ₹150.00
        String numericText = value.replaceAll("[^\\d.]", ""); // todo  Elimina cualquier carácter no numérico excepto el punto decimal
        double actualPrice = Double.parseDouble(numericText); // todo Convierte el texto numérico a un valor double
        return actualPrice < maxPrice;  // todo valida que el valor actual sea menos < con maxPrice que esta en el step
    }

    public static CheckPrice checkPrice(double maxPrice) {
        return new CheckPrice(maxPrice);
    }
}