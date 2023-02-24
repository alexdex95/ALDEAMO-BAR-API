# ALDEAMO-BAR-API
Desarrolado por: JEFFERSON ALEXANDER MORENO BARRERA
***********************************************************************************************************************************
Repositorio con API rest para bar tender
******************************
## Technologies

1.  Maven: Gestor de dependencias para el manejo del empaquetado e implementación de librerías externas
2.  Spring Boot: Modulo de spring para el desarrollo de la API REST 
3.  Java 11: leguaje de codificación del aplicativo
4.  Eclipse: IDE de desarrollo
5.  Google Cloud: Plataforma cloud para hostear la API
6.  GIT: software de manejo de versiones de la API
7.  Postaman: Plataforma para el diseño y pruebas de API
8.  JUnit: Biblioteca para desarrollo de pruebas unitarias a la API
9.  H2: Base de datos en memoria
10. Flyway: dependencia para la migracion de base de datos H2


versiones usadas en el proyecto:
* [Spring-Boot]: Version 3.0.3 
* [H2] : Version 2.1.212 
* [Flyway] : Version 9.0.0
* [JUnit] : Version 4.4
* [Mockito] : Version ‎4.2.0

## API Reference
*
Get - Iterations - dataID

|  Parameters  |    Type     | Description     |
| -----        |     :---:   |     :---:       |
|  iterations  | int         | Required. True  |
|    dataID    | Integer     | Required. True  |


### URL API REST

Metodo GET

https://bartenderapi.uc.r.appspot.com/V1/API/get?iterations=3&dataID=5

```curl
    curl --location 'https://bartenderapi.uc.r.appspot.com/V1/API/get?iterations=3&dataID=5'
```

Header

Key = Content-Type 

Value = application/json

## Authors
@alexdex95