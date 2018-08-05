Pre-requisites:
Java SDK 1.8
Maven

Steps to run this project:

1) Close the applications running on localhost:8080
2) Download or fork the codebase https://github.com/rkintali/rest-api-customer-profile/tree/master/rest-api-customer-profile
3) Go to the project base directory (<application_home>/rest-api-customer-profile)
4) Run the command 'mvn clean spring-boot:run'
5) The application now runs successfully on localhost:8080
6) Logs are placed at <application_home>/rest-api-customer-profile/logs
7) The Customer REST API documentation is present in SwaggerHub at https://app.swaggerhub.com/apis/RKS89/Customer/1.0.0
8) Basic authentication has been configured and disabled. The application can be further enhanced to use OAUTH authentication mechanism.
8) H2 In-memory database has been used to persist the customer data 
9) In-memory database console: http://localhost:8080/h2-console
10) Configure JDBC URL: jdbc:h2:mem:testdb, to browse H2 in-memory database
11) Currently H2 database profile has been set to active. This application can be enhanced to point to any enterprise database. Create a profile (i.e., specify database connection details) for the enterprise db and change the 'active' flag to the enterprise db.

The APIs are developed using Spring Boot Framework.