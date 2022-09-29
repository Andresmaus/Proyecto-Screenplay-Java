package andres.sanchez.swagslabs.questions;

import andres.sanchez.swagslabs.userinterfaces.RepositorioLocalizadores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar noIngreso() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RepositorioLocalizadores.LBL_MENSAJE_FALLIDO).viewedBy(actor).asString();
    }
}