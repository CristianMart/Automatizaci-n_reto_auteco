package co.com.test.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.test.util.Constantes.URL;

@DefaultUrl(URL)
public class AutecoUserInterface extends PageObject {
    public static final Target ACCESS_AUTECO = Target.the("Botón ingreso auteco")
            .located(By.id("home-auteco"));
    public static final Target CLOSE_POLICY = Target.the("Cerrar politícas")
            .located(By.xpath("//i[contains(@class,'eicon-close')]"));
    public static final Target WHICH_TO_BUY = Target.the("Cual compro")
            .located(By.xpath(
                    "//div[@class='elementor-element elementor-element-3ecb046 elementor-align-center elementor-widget elementor-widget-button']//a[@class='elementor-button-link elementor-button elementor-size-sm']"));
    public static final Target SELECT_BIKE = Target.the("Cerrar politícas")
            .located(By.xpath("//div[18]//div[2]//a[1]//div[1]"));
    public static final Target FIRST_NAME = Target.the("Cerrar politícas")
            .located(By.id("firtsname"));
    public static final Target EMAIL = Target.the("Cerrar politícas")
            .located(By.id("email"));
    public static final Target CELLPHONE = Target.the("Cerrar politícas")
            .located(By.id("celular"));
    public static final Target QUOTE = Target.the("Cerrar politícas")
            .located(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit']"));
    public static final Target PAYMENT = Target.the("Cerrar politícas")
            .located(By.xpath("//select[@id='forma-pago']"));
    public static final Target AREA = Target.the("Cerrar politícas")
            .located(By.xpath("//select[@id='departamento-cotizador']"));
    public static final Target CITY = Target.the("Cerrar politícas")
            .located(By.xpath("//select[@id='ciudad-cotizador']"));
    public static final Target ACCEPT = Target.the("Cerrar politícas")
            .located(By.id("aceptar_condiciones"));
    public static final Target TOTAL = Target.the("Cerrar politícas")
            .located(By.xpath("//section[@id='laquiero']//tr[7]//td[1]"));
    /*public static final Target VALUE = Target.the("Valor")
            .located(By.xpath("//td[contains(text(),'$9,487,782')]"));*/
}
