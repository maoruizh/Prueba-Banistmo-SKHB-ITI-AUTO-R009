package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import co.com.bancolombia.certification.prueba.interactions.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;


import static co.com.bancolombia.certification.prueba.questions.CheckPrice.checkPrice;
import static co.com.bancolombia.certification.prueba.tasks.ClickAddTwoCourses.clickAddTwoCourses;
import static co.com.bancolombia.certification.prueba.tasks.ClickDeleteCourse.clickDeleteCourse;
import static co.com.bancolombia.certification.prueba.tasks.ClickShoppingCart.clickShoppingCart;
import static co.com.bancolombia.certification.prueba.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeAutomationTestingStepDefinitions {

    @Given("Select go to practice automationtesting")
    public void SelectGoToPracticeAutomationtesting() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
    }

    @And("^Select add two Courses$")
    public void SelectAddTwoCourses() {
        theActorInTheSpotlight().attemptsTo(clickAddTwoCourses());
    }

    @And("Select button Shopping cart")
    public void SelectButtonShoppingCart() {
        theActorInTheSpotlight().attemptsTo(clickShoppingCart());
        theActorInTheSpotlight().attemptsTo(Wait.seconds(300));
    }

    @When("Select delete a course in the shopping cart page")
    public void SelectDeleteACourseInTheShoppingCartPage() {
        theActorInTheSpotlight().attemptsTo(clickDeleteCourse());
    }

    @Then("Validate the calculation result")
    public void ValidateTheCalculationResult() {
        theActorInTheSpotlight().should(seeThat(checkPrice (400.00)));
    }
}
