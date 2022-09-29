package andres.sanchez.swagslabs.questions;

import andres.sanchez.swagslabs.userinterfaces.RepositorioLocalizadores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {
    public static Validar productos() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RepositorioLocalizadores.LBL_MENSAJE_PRODUCTO).viewedBy(actor).asString();
    }
}
