package andres.sanchez.swagslabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RepositorioLocalizadores {
    public static final Target TXT_USUARIO = Target.the("CAMPO DE USUARIO").located(By.id("user-name"));
    public static final Target TXT_CONTRASENNA = Target.the("CAMPO DE CONTRASEÑA").located(By.id("password"));
    public static final Target BTN_SIGN_IN = Target.the("BOTON INICIAR SESION").located(By.xpath("//*[@id='login-button']"));
    public static final Target LBL_MENSAJE_PRODUCTO = Target.the("MENSAJE INTERNO").located(By.xpath("//*[contains(text(),'Products')]"));

    public static final Target LBL_MENSAJE_FALLIDO = Target.the("MENSAJE USUARIO BLOQUEADO").located(By.xpath("//*[contains(text(),'Epic sadface: Sorry')]"));
}
