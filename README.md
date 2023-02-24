# ALDEAMO-BAR-API
Repositorio con API rest para bar tender

## Technologies
*
A list of technologies used within the project:
* [Spring-Boot]: Version 3.0.3 
* [H2] : Version xx
* [Flyway] : Version xx
* [JUnit] : Version 4.4
* [Mockito] : Version xx

## API Reference
*
Get - Iterations - dataID

|  Parameters  |    Type     | Description     |
| -----        |     :---:   |     :---:       |
|  iterations  | int         | Required. True  |
|    dataID    | Integer     | Required. True  |

## Curl

curl --location 'http://localhost:8080/V1/API/get?iterations=3&dataID=5'

## Authors
@alexdex95