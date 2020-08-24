package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.userinterface.AutecoUserInterface.TOTAL;

public class VerifyTotalAuteco implements Question<Boolean> {
    private String question;
    public VerifyTotalAuteco (String question){
        this.question = question;
    }

    public static VerifyTotalAuteco beingTheResult(String question) {
        return new VerifyTotalAuteco(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(TOTAL).viewedBy(actor).asString();
        return question.contains(answer);
    }
}
