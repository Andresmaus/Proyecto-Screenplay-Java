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
        Boolean resultadoFinal = false;
        String mensaje = Text.of(RepositorioLocalizadores.LBL_MENSAJE_FALLIDO).viewedBy(actor).asString();

        if (resultadoFinal.equals(mensaje)) {
            resultadoFinal = true;
        }else {
            resultadoFinal = false;
        }
        return resultadoFinal;
    }
}
