package andres.sanchez.swagslabs.tasks;

import andres.sanchez.swagslabs.userinterfaces.PaginaSawgsLags;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirTask implements Task {
    private PaginaSawgsLags paginaSawgsLags;

    public static AbrirTask paginaUrl() {
        return Tasks.instrumented(AbrirTask.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSawgsLags));
    }
}

