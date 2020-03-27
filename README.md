# Amazon Gateway y Lambda

Utilizando los servicios de Amazon Api Gateway y Lambda para generar un servicion que calcula el cuadraro de un numero, se conecto con un servidor Spark que retorna un api rest y una formulario web.

[![CircleCI](https://circleci.com/gh/Arep-Nico/webSparkLambda-Gatway/tree/master.svg?style=svg)](https://circleci.com/gh/Arep-Nico/webSparkLambda-Gatway/tree/master)
[![Maven Central](https://img.shields.io/maven-central/v/com.sparkjava/spark-core/2.9.1)](https://mvnrepository.com/artifact/com.sparkjava/spark-core/2.9.1)
![GitHub](https://img.shields.io/github/license/Arep-Nico/Patrones-Arquitecturales)

### Prerequisitos

Se requiere maven y Java version 8 como minimo.

## Diseño

La documentacion del Api de **Apache Spark** esta a continuacion [aqui](documents/Laboratorio_7_Arep.pdf).

## Documentacion de Endpoins
```
  Gets:
  - Square: /api/v1/math/square?value={number}
```

## Running
 Para empaquetar el proyecto de Java 
 > ``` mvn package ```
 
 Para correr los test
 > ``` mvn test ```
 
 Para generar la documentacion de Java
 > ``` mvn javadoc:javadoc ```

Para ejecutar un jar
> ``` java -jar webSpark-1.0-SNAPSHOT.jar ```

## Desarrollado

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.java.com/es/download) - Framework
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Framework
* [Apache Spark](http://sparkjava.com) - Framework

## Versionamiento

Para ver las versiones disponible, mire [realese version](https://github.com/Arep-Nico/ConcurrentFramework/releases).

## Autor

| Developer |
| :--: |
| Nicolas Cardenas |

## License

This project is under GNU General Public License - see [LICENSE](LICENSE) to more info.

## Conocimientos

* StackOverflow
* Java Documnetation Api
* Apache Spark Documnetation
* Materialize Documentacion