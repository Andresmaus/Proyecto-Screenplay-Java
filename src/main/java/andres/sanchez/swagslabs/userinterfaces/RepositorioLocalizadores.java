package andres.sanchez.swagslabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RepositorioLocalizadores {
    public static final Target TXT_USUARIO = Target.the("CAMPO DE USUARIO").located(By.id("user-name"));
    public static final Target TXT_CONTRASENNA = Target.the("CAMPO DE CONTRASEÑA").located(By.id("password"));
}
