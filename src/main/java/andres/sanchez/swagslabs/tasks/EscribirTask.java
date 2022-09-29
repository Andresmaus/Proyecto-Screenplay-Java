package andres.sanchez.swagslabs.tasks;

import andres.sanchez.swagslabs.model.TablaDatos;
import andres.sanchez.swagslabs.userinterfaces.RepositorioLocalizadores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribirTask implements Task {
    private TablaDatos tablaDatos;

    public EscribirTask(TablaDatos tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    public static EscribirTask credencialesFallidas(TablaDatos tablaDatos) {
        return Tasks.instrumented(EscribirTask.class, tablaDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaDatos.getUsuario()).into(RepositorioLocalizadores.TXT_USUARIO),
                Enter.theValue(tablaDatos.getContrasenna()).into(RepositorioLocalizadores.TXT_CONTRASENNA),
                Click.on(RepositorioLocalizadores.BTN_SIGN_IN)
        );
    }
}
