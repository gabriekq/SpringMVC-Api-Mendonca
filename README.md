# SpringMVC-Api-Mendonca
Simple-SpringMVC-API - Exemple

This is a Restful - API that record into a databased, this code also implements the unit test with Junit. 
This project used the follow libs:
Spring MVC 4,
Junit 4,
Java 8,
Maven,
JPA,
Hibernate,
MySQL,
Apache Tomcat 8.0,

The API has the follow methods:
http://localhost:8080/Projeto-SpringMVC/pessoas

This address call the method ListaPessoa() that get all items from the database and return it at the Json format. 

http://localhost:8080/Projeto-SpringMVC/savePessoa
This address takes an input as Json request and record into the database by calling the method  savePessoa(). To input any data you need to do at this way.
{
 
"idPerson": "1", 
"nome": "test"
 
}


http://localhost:8080/Projeto-SpringMVC/getBy/1

This Address get one element from the database and return it to json format by the id number informed by the user in the address.  The method getOnePerson() is responsible to bring the element to the browser or the app that made the request.  


