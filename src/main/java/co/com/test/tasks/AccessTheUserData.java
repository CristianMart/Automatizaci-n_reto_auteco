package co.com.test.tasks;

import co.com.test.model.AutecoModel;
import co.com.test.userinterface.AutecoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.test.util.Constantes.ZERO;

public class AccessTheUserData implements Task {
    private List<AutecoModel> dataSet;
    private AutecoUserInterface autecoUserInterface;

    public AccessTheUserData (List<AutecoModel> dataSet) {this.dataSet = dataSet;}


    public static AccessTheUserData intoTheForm(List<AutecoModel> dataSet) {
        return Tasks.instrumented(AccessTheUserData.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataSet.get(ZERO).getName()).into(autecoUserInterface.FIRST_NAME),
                Enter.theValue(dataSet.get(ZERO).getEmail()).into(autecoUserInterface.EMAIL),
                Enter.theValue(dataSet.get(ZERO).getCellphone()).into(autecoUserInterface.CELLPHONE),
                Click.on(autecoUserInterface.PAYMENT),
                SelectFromOptions.byVisibleText(dataSet.get(ZERO).getPayment().trim()).from(autecoUserInterface.PAYMENT),
                Click.on(autecoUserInterface.AREA),
                SelectFromOptions.byVisibleText(dataSet.get(ZERO).getArea().trim()).from(autecoUserInterface.AREA),
                Click.on(autecoUserInterface.CITY),
                SelectFromOptions.byVisibleText(dataSet.get(ZERO).getCity().trim()).from(autecoUserInterface.CITY),
                Click.on(autecoUserInterface.ACCEPT),
                Click.on(autecoUserInterface.QUOTE)

        );
    }
}
