Spring MVC hello world example (Gradle and JSP)
===============================

This is the source code for the article - [Spring MVC hello world example (Gradle and JSP)](https://mkyong.com/spring-mvc/gradle-spring-mvc-web-project-example/).

_P.S This tutorial is NOT a Spring Boot application, just pure Spring Web MVC!_

## 1. Technologies and tools used:
* Java 11
* Spring 5.2.22.RELEASE
* JSP
* JSTL 1.2
* Servlet API 4.0.1
* Bootstrap 5.2.0 (webjars)
* IntelliJ IDEA
* Gradle 7.5.1
* Gradle Gretty plugin 3.0.9 for embedded servlet containers (Tomcat 9 and Jetty 9.4)
* Spring Test 5.2.22.RELEASE
* Hamcrest 2.2
* JUnit 5.9 

## 2. How to run this project?
```shell
$ git clone https://github.com/mkyong/spring-mvc/

$ cd spring-mvc-hello-world-jsp

$ gradle tomcatRunWar

or

$ gradle jettyRunWar

# visit http://localhost:8080/

# visit http://localhost:8080/hello/mkyong
```
