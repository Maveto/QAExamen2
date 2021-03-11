Feature:
  Scenario: como cliente
            quiero crear y actualizazr un usuario
            para usar los servicios de todo.ly

    Given Tengo acceso a Todo.ly
    When Envio una peticion POST a https://todo.ly/api/user.json con el json
    """
    {
      "Email" : "mau1@m1.com",
      "FullName" : "Mauri",
      "Password" : "1234"
    }
    """
    Then Reviso que el codigo del response sea 200
    And Reviso que en el response el FullName sea "Mauri"


    When Envio una peticion PUT  a https://todo.ly/api/user/0.json autentificado con el usuario "mau1@m1.com" y contrasena "1234" con el json
    """
    {
      "FullName" : "Mauri Update"
    }
    """
    Then Reviso que el codigo del response sea 200
    And Reviso que en el response el FullName sea "Mauri Update"