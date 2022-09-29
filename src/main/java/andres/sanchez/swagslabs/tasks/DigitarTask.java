package andres.sanchez.swagslabs.tasks;

import andres.sanchez.swagslabs.model.TablaDatos;
import andres.sanchez.swagslabs.userinterfaces.RepositorioLocalizadores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class DigitarTask implements Task {

    private TablaDatos tablaDatos;

    public DigitarTask(TablaDatos tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    public static DigitarTask credenciales(TablaDatos tablaDatos) {
        return Tasks.instrumented(DigitarTask.class, tablaDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaDatos.getUsuario()).into(RepositorioLocalizadores.TXT_USUARIO),
                Enter.theValue(tablaDatos.getContrasenna()).into(RepositorioLocalizadores.TXT_CONTRASENNA),
                );
    }
}
