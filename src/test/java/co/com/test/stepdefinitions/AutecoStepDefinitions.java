package co.com.test.stepdefinitions;

import co.com.test.model.AnswerAutecoModel;
import co.com.test.model.AutecoModel;
import co.com.test.questions.VerifyTotalAuteco;
import co.com.test.tasks.AccessTheAuteco;
import co.com.test.tasks.AccessTheUserData;
import co.com.test.userinterface.AutecoUserInterface;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutecoStepDefinitions {

    private AutecoUserInterface autecoUserInterface;
    private AnswerAutecoModel answerAutecoModel;

    @Given("^That User wants to quote a bike$")
    public void thatUserWantsToQuoteABike() {
        OnStage.theActorCalled("Cristian").wasAbleTo(AccessTheAuteco.QuotePage());
    }

    @When("^he Enters the quote section$")
    public void heEntersTheQuoteSection(List<AutecoModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(AccessTheUserData.intoTheForm(dataSet));
    }

    @Then("^he verifies the message (.*)$")
    public void heVerifiesTheMessage(String question) {
        OnStage.theActorInTheSpotlight().should(seeThat(VerifyTotalAuteco.beingTheResult(question)));
        //System.out.println(autecoUserInterface.VALUE);
//        System.out.println(answerAutecoModel.getValor().toString());
    }
}
