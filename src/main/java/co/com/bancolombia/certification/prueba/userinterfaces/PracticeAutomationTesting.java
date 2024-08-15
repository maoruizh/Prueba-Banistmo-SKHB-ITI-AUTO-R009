package co.com.bancolombia.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeAutomationTesting {

    public static final Target BTN_ADD_COURSE_DATA_STRUCTURE = Target.the("Boton adicionar curso js data Structure").located(By.xpath("//*[@id=\"content\"]/ul/li[5]/a[2]"));
    public static final Target BTN_ADD_COURSE_RELENIUM_RUBY = Target.the("Boton adicionar curso selenium Ruby").located(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]"));
    public static final Target BTN_SHOPPING_CART = Target.the("Boton carrito de compras").located(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/i"));
    public static final Target BTN_DELETE_COURSE = Target.the("Boton borrar curso").located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td[1]/a"));
    public static final Target TXT_CHECK_PRICE = Target.the("Precio total de la compra").located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[3]/td"));
}