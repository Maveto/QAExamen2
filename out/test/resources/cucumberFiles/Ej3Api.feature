Feature:
  Scenario: como usuario
            quiero obtener el token y borrarlo
            para manipular la cuenta

    Given Tengo acceso a Todo.ly

    When Envio un Get a https://todo.ly/api/authentication/token.json
    Then Verifico que el codigo de respuesta sea 200

    When Envio un Delete a https://todo.ly/api/authentication/token.json
    Then Verifico que el codigo de respuesta sea 200