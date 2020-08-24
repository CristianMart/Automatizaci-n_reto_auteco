package co.com.test.tasks;

import co.com.test.userinterface.AutecoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.util.ClassUtils;

public class AccessTheAuteco implements Task {

    private AutecoUserInterface autecoUserInterface;

    public static AccessTheAuteco QuotePage() {
        return Tasks.instrumented(AccessTheAuteco.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(autecoUserInterface),
                Click.on(autecoUserInterface.ACCESS_AUTECO),
                Click.on(autecoUserInterface.CLOSE_POLICY),
                Click.on(autecoUserInterface.WHICH_TO_BUY),
                Click.on(autecoUserInterface.SELECT_BIKE)
        );

    }
}
