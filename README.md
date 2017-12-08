# Run Steps

This is a [SpringBoot](https://projects.spring.io/spring-boot/) application with [MongoDB](https://www.mongodb.com/) as datasource, [Swagger](https://swagger.io/) Rest API tooling and [Spring Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready.html) to add several production grade services to your project.

## Prepare MongoDB

Create a **Person** collection inside your MongoDB database.

> **Note:**
>  Your Collection should'nt include any data. But you can insert some sample as;
{ "name": "John", "surname": "Doe" }

## Clone project
Clone or Download that project and import inside your favorite IDE
> **Note:**
>  [Spring Tool Suite](https://spring.io/tools) is recommended for Spring projects.

## Prepare your IDE for Lombok
[Lombok](https://projectlombok.org/) is a wonderful Boilerplate code cleaner. 

 1. [Download](https://projectlombok.org/download) .jar file
 2. Run from your terminal :+1:

 ```shell
 java -jar lombok.jar
```

 3. It will open a window. Select your IDE or show IDE folder and clean next
 4. Restart your IDE. IDE lombok plugin is installed. 
 
> **Note:**
>  From Eclipse based IDEs, navigate to **Help - About Eclipse** you will se lombok plugin note inside popup

## Run Project
Run project. If there are no exceptions then you are ready

# Test Steps

## Rest Endpoints
![Rest endpoints and related methods](https://github.com/dagistankaradeniz/images/blob/master/1.JPG)

## Swagger URL
All rest endpoints and related details can be seen from

>  http://localhost:8080/swagger-ui.html

![Swagger UI](https://github.com/dagistankaradeniz/images/blob/master/2.JPG)

> For details, just click each endpoint and see the magic.


Good Luck :wink:
11010
