:rocket: Spring Boot Demo App
--------------------

A sample [Spring Boot](https://start.spring.io/) + Spring Data JPA [Kotlin](https://kotlinlang.org/) project.

Build
-----
```
./gradlew clean build
```

Run
---
```
./gradlew clean bootRun
```

API End Points
--------------

 * Get all users - [http://localhost:8080/](http://localhost:8080/)
 * User Count - [http://localhost:8080/count](http://localhost:8080/count)
 * Find by first name - [http://localhost:8080/first/{name}](http://localhost:8080/first/awesome)
 * Find by last name - [http://localhost:8080/last/{name}](http://localhost:8080/last/oneops)
 * Find by name - [http://localhost:8080/last?name={name}](http://localhost:8080/last?name=oneops)


Remote Shell
------------

  By default the remote shell will listen for connections on port `2000`. The default credentials is `oneops/oneops`.

```
$ ssh -p 2000 oneops@localhost
```