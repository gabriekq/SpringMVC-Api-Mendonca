 


# SpringMVC-Api-Mendonca – Beta 2

# Introduction.
Since the first version. A Lot of things have been change.
Now this software has a different goal with is. Receive a resume’s picture and display to the user as text format.

Requirements.
 Spring MVC 4, Junit 4, Java 8, Maven, JPA, Hibernate, MySQL, Apache Tomcat 8.0, python interpreter 3.5.
How is it work.

1-The user opens the page that have the address below.
 http://localhost:8080/Projeto-SpringMVC/sendpic
 
2 – The Picture is sent to the folder through the html form.

3- Once the picture is at the folder. The java record the path of the image into the MySQL database.

4 – After the 3 th step java will run a python script that is going to read the picture base on the path found into the database previewed record by java and convert it to the text to finally create an (.txt) with the same name of the picture file. 
The python script also will remove the record of the database relate to the path of the picture and the picture itself.

5- Back to the Java application the server loads the txt file created by python and display it to the user view. 

# Installation 

To get this project up and running you have to follow these steps.

1 –Install MySql  5.7 or above and make sure it is running.

2- Download and install the python interpreter and add it to the environment variable and download this project https://github.com/gabriekq/Text-pic-Mendonca

3- Download the SpringMVC-Api-Mendonca – Beta 2 project and make sure the path are aim to the right folder, check all paths ate the java’s class and make sure they are available for using. 
obs - > at the folder resources inside the java’s project there is an (BAT) file responsible to call the python file. Make sure the path of the python interpreter and the project’s file are correct.
