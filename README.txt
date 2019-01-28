# WMF-MS
Step 1: Set-up the database as per "Database Details" provided below.
Step 2: Set-up the application properties as per "Application Properties" provided below.
Step 3: Run the application
Step 4: Access the ReSTful Service


******************************************************************
Database Details
******************************************************************
Database: MySQL
Schema: hiringstack
Create Table Query:
create table hiringstack( hiring_id INT NOT NULL AUTO_INCREMENT, hiring_name VARCHAR(100) NOT NULL, hiring_address VARCHAR(100) NOT NULL, hiring_phone VARCHAR(100) NOT NULL, PRIMARY KEY ( hiring_id ));

******************************************************************
Application Properties
******************************************************************
Set following properties in application.properties file as per deployment server.
spring.datasource.url
spring.datasource.username
spring.datasource.password

******************************************************************
Run The Application
******************************************************************
Install Maven on the system, cd to location of WMF-MS directory and run the following command-
mvn spring-boot:run

******************************************************************
API
******************************************************************
Fetch Records: 
	Request Method: GET 
	URL: http://localhost:8086/wmf/hiringstack/

Insert Records: 
	Request Method: POST
	URL: http://localhost:8086/wmf/hiringstack/
	Payload: {"hiringName":"name of the Employee","hiringAddress":"Address","hiringPhone":"Phone number"}
	
******************************************************************
