package andres.sanchez.swagslabs.stepdefinitions;

import andres.sanchez.swagslabs.model.TablaDatos;
import andres.sanchez.swagslabs.questions.Validar;
import andres.sanchez.swagslabs.questions.Verificar;
import andres.sanchez.swagslabs.tasks.AbrirTask;
import andres.sanchez.swagslabs.tasks.DigitarTask;
import andres.sanchez.swagslabs.tasks.EscribirTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class MiDefinicionDePasos {
    @Before
    public void inciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingresa a la app sawg labs$")
    public void queElUsuarioIngresaALaAppSawgLabs() {
        OnStage.theActorCalled("Andres").wasAbleTo(AbrirTask.paginaUrl());
    }

    @Cuando("^ingresa las credenciales correctamente$")
    public void ingresaLasCredencialesCorrectamente(List<TablaDatos> tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitarTask.credenciales(tablaDatos.get(0)));
    }

    @Entonces("^verifica que pudo ingresar correctamente$")
    public void verificaQuePudoIngresarCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.productos(), Matchers.equalTo("PRODUCTS")));
    }

    @Cuando("^ingresa las credenciales incorrectas$")
    public void ingresaLasCredencialesIncorrectas(List<TablaDatos> tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EscribirTask.credencialesFallidas(tablaDatos.get(0)));
    }

    @Entonces("^verifica que no pudo ingresar correctamente$")
    public void verificaQueNoPudoIngresarCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.noIngreso(), Matchers.equalTo("Epic sadface: Sorry, this user has been locked out.")));
    }
}
