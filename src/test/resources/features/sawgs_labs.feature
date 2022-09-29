#Autor: Andres Sanchez
  #language: es
  @HistoriaUsuario
  Característica: Verificar el funcionamiento optimo del modulo login
    Como usuario quiero ingresar a Saucedemo para ver los productos en stock

  Antecedentes:
    Dado que el usuario ingresa a la app sawg labs

  @LoginExitoso
  Esquema del escenario:
    Cuando ingresa las credenciales correctamente
    |usuario|contrasenna|
    |<usuario>|<contrasenna>|
    Entonces verifica que pudo ingresar correctamente

    Ejemplos:
      |usuario|contrasenna|
      |usuario|contrasenna|

    @LoginFallido
    Esquema del escenario:
      Cuando ingresa las credenciales incorrectas
        |usuario|contrasenna|
        |<usuario>|<contrasenna>|
      Entonces verifica que no pudo ingresar correctamente

      Ejemplos:
        |usuario|contrasenna|
        |usuario|contrasenna|