
Feature: Login al sistema de SauceDemo

  @LoginOK
  Scenario: Ingreso exitoso con credenciales válidas
    Given que Breysi abre la página de SauceDemo
    When inicia sesión con el usuario "standard_user" y la contraseña "secret_sauce"
    Then debería ver el título de productos


  @BusquedaProducto
  Scenario: Buscar un producto por nombre en la lista de productos
    Given que Breysi abre la página de SauceDemo
    When inicia sesión con el usuario "standard_user" y la contraseña "secret_sauce"
    And busca el producto "backpack"
    Then debería ver el producto "Sauce Labs Backpack" en los resultados
