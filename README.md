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

 - [Rest](https://spring.io/guides/gs/rest-service/)
     * Get all users - [http://localhost:8080/](http://localhost:8080/)
     * User Count - [http://localhost:8080/count](http://localhost:8080/count)
     * Find by first name - [http://localhost:8080/first/{name}](http://localhost:8080/first/awesome)
     * Find by last name - [http://localhost:8080/last/{name}](http://localhost:8080/last/oneops)
     * Find by name - [http://localhost:8080/last?name={name}](http://localhost:8080/last?name=oneops)

 - [MVC](https://spring.io/guides/gs/serving-web-content/)
     * Get all users - [http://localhost:8080/mvc/users](http://localhost:8080/mvc/users)
     * Get all users with filter - [http://localhost:8080/mvc/users?filter={string}](http://localhost:8080/mvc/users?filter=a)

 - [Hateoas](https://spring.io/guides/gs/rest-hateoas/)
     * Get all scientists - [http://localhost:8080/scientists](http://localhost:8080/scientists)
     * Get scientist - [http://localhost:8080/scientists/{id}](http://localhost:8080/scientists/1)
     * Search scientist - [http://localhost:8080/scientists/search/findBySurname?sn={surname}](http://localhost:8080/scientists/search/findBySurname?sn=tesla)
     * Get all scientists (paginated) [http://localhost:8080/scientists?page=5&size=2](http://localhost:8080/scientists?page=5&size=2)

 - Static
     * index - [http://localhost:8080/index.html](http://localhost:8080/index.html)
     * 404 - [http://localhost:8080/404.html](http://localhost:8080/404.html)


Remote Shell
------------

  By default the remote shell will listen for connections on port `2000`. The default credentials is `oneops/oneops`.

```
$ ssh -p 2000 oneops@localhost
```