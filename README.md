# Spring Websocket Server 
Created a Spring Websocket Server to communicate with our Android client.

## Tools used
#### Spring
is a framework provides comprehensive infrastructure support for developing Java applications.

It's packed with features like Dependency Injection and out of the box modules like:

Spring JDBC
Spring MVC
Spring Security
Spring AOP
Spring ORM
Spring Test
These modules can drastically reduce the development time of an application.

#### Spring Boot
is basically an extension of the Spring framework which eliminated the boilerplate configurations required for setting up a Spring application.

## How it works
The application is ment to simulate 'Add to Cart' functionality over websocket communication.
The android client sends Toy information {code,name,price,description,manufacturer details} to the server.It extracts the price from the json object and adds it to an array then sums up all the toy prices and then returns the cost of the items and its then dislayed on the client interface.

![](images/serverLogcat.PNG)

code for the android client can be found here: https://github.com/Sianwa/Websocket_Android_Client

## Team
Kelsey Makale 

Jeff Gichuki

Jesse Kiriungi
