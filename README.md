# Ejercicio de TDD

Puedes ver las diapositivas [aquí](https://docs.google.com/presentation/d/1BURcsjcy7h9Hx0T-fr1bP4AwrEsqkjY9GHWOfS33BjY/edit?usp=sharing).

### Tech Stack

- Java 11
- Gradle 6
- JUnit 5
- AssertJ 3
- Mockito 3
- Jacoco Gradle Plugin
- Sonarqube Gradle Plugin

### Comandos

Ejecutar pruebas:
```shell script
$ gradle clean test
```

Generación de reporte de cobertura:
```shell script
$ gradle clean jacocoTestReport
```

Ejecutar pruebas de mutación:
```shell script
$ gradle clean pitest
```

Ejecutar sonarqube localmente:
> prerequisito
```shell script
$ sudo sysctl -w vm.max_map_count=262144
$ sudo sysctl -w fs.file-max=65536
$ ulimit -n 65536
$ ulimit -u 4096
```
> ejecución de sonarqube web
```shell script
$ docker run -d --name sonarqube -p 9000:9000 sonarqube
$ docker logs -f sonarqube
```
> ejecución de análisis con sonarqube
```shell script
$ gradle clean test sonarqube -Dsonar.host.url=http://localhost:9000
```