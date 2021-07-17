#language: es
  Característica: Conversor de Tasas de interes
    Yo como cliente de Bancolombia
  necesito ingresar a la pagina del banco
  para realizar conversion de tasa nominal a efectiva

     Escenario: Validar que el cliente pueda realizar la Convercion de tasa nominal a efectiva
      Dado que el cliente ingresa al portal de Bancolombia
      Cuando el cliente selecciona la opcion de conversor de tasas de interes
      Y el cliente seleccione calcular de la opcion de tasa nominal a tasa efectiva
      Y el cliente ingrese los valores requeridos para el calculo
        | Valores    |
        | 20         |
      Entonces el cliente podra visualizar la informacion requerida de forma exitosa


