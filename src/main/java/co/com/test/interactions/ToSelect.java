package co.com.test.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ToSelect implements Interaction {

    private Target list;
    private String option;

    public ToSelect(Target list, String option) {
        this.list = list;
        this.option = option;
    }

    public static ToSelect from(Target list, String option) {
        return new ToSelect(list, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObjeto = list.resolveAllFor(actor);
        for (int i = 0; i < listObjeto.size(); i++) {
            if (listObjeto.get(i).getText().trim().equals(option)) {
                listObjeto.get(i).click();
                break;
            }
        }
    }
}