<h1 align="center">🏛️ Banking Application with Spring Boot Microservices 🏛️</h1>
<h2>📋📚 Table of Contents</h2>

- [🔍 About](#-about)
- [🏛️ Architecture](#-architecture)
- [🚀 Microservices](#-microservices)
- [🛠️ Technologies Used](#-technologies-used)
    - [🌱 Spring Boot](#spring-boot)
    - [🗄️ Spring Data JPA](#spring-data-jpa)
    - [🐬 MySQL](#mysql)
    - [☁️ Spring Cloud](#spring-cloud)
    - [🔍 Eureka Server](#eureka-server)
    - [📝 Feign Client](#feign-client)
    - [🔧 Lombok](#lombok)
- [⚠️ Error Handling](#error-handling)
- [🔒 Security](#security)
- [⚙️ Configuration](#configuration)
- [📈 Monitoring](#monitoring)
- [📝 Logging](#logging)
- [🧪 Testing](#testing)
- [🚀 Build and Deployment](#build-and-deployment)

## 🔍 About
<p>
    The Banking Application is built using a microservices architecture, incorporating the Spring Boot framework along with other Spring technologies such as Spring Data JPA, Spring Cloud, and Spring Security, alongside tools like Maven for dependency management. These technologies play a crucial role in establishing essential components like Service Registry, API Gateway, and more.<br><br>
    Moreover, they enable us to develop independent microservices such as the user service for user management, the account service for account generation and other related functionalities, the fund transfer service for various transfer operations, and the transaction service for viewing transactions and facilitating withdrawals and deposits. These technologies not only streamline development but also enhance scalability and maintainability, ensuring a robust and efficient banking system.
</p>

## 🏛️ Architecture

- **Service Registry:** The microservices uses the discovery service for service registration and service discovery, this helps the microservices to discovery and communicate with other services, without needing to hardcode the endpoints while communicating with other microservices.

- **API Gateway:** This microservices uses the API gateway to centralize the API endpoint, where all the endpoints have common entry point to all the endpoints. The API Gateway also facilitates the Security inclusion where the Authorization and Authentication for the Application.

- **Database per Microservice:** Each of the microservice have there own dedicated database. Here for this application for all the microservices we are incorparating the MySQL database. This helps us to isolate each of the services from each other which facilitates each services to have their own data schemas and scale each of the database when required.


<h2>🚀 Microservices</h2>

- **👤 User Service:** The user microservice provides functionalities for user management. This includes user registration, updating user details, viewing user information, and accessing all accounts associated with the user. Additionally, this microservice handles user authentication and authorization processes.

- **💼 Account Service:** The account microservice manages account-related APIs. It enables users to modify account details, view all accounts linked to the user profile, access transaction histories for each account, and supports the account closure process.

- **💸 Fund Transfer Service:** The fund transfer microservice facilitates various fund transfer-related functionalities. Users can initiate fund transfers between different accounts, access detailed fund transfer records, and view specific details of any fund transfer transaction.

- **💳 Transactions Service:** The transaction service offers a range of transaction-related services. Users can view transactions based on specific accounts or transaction reference IDs, as well as make deposits or withdrawals from their accounts.

<h2>📖 Documentation</h2>
<h3>📂 Microservices Documentation</h3>

For detailed information about each microservice, refer to their respective README files:

- [👤 User Service](./User-Service/README.md)
- [💼 Account Service](./Account-Service/README.md)
- [💸 Fund Transfer Service](./Fund-Transfer/README.md)
- [💳 Transactions Service](./Transaction-Service/README.md)


## 🛠️ Technologies Used

### 🌱 Spring Boot
Spring Boot is used to create stand-alone, production-grade Spring-based applications. It simplifies the configuration and deployment process by providing a set of default configurations and a wide range of features such as embedded servers, security, and monitoring.

### 🗄️ Spring Data JPA
Spring Data JPA is used for data access and manipulation. It provides a repository abstraction over the JPA (Java Persistence API) and simplifies the implementation of data access layers by reducing boilerplate code.

### 🐬 MySQL
MySQL is a popular open-source relational database management system. It is widely used for storing and managing data in web applications. When used with Spring Data JPA, MySQL serves as the database where the application's data is persisted. Spring Boot provides easy integration with MySQL through auto-configuration and properties settings, allowing developers to quickly set up and use MySQL in their applications.

### ☁️ Spring Cloud
Spring Cloud is used for building microservices architectures. It provides tools for configuration management, service discovery, circuit breakers, intelligent routing, and more.

### 🔍 Eureka Server
Eureka Server is a service registry used for service discovery. It allows microservices to register themselves at runtime and discover other registered services.

### 📝 Feign Client
Feign is a declarative web service client. It simplifies the process of making HTTP requests to other microservices by providing a simple and intuitive API.

### 🔧 Lombok
Lombok is a Java library that helps to reduce boilerplate code by generating common methods like getters, setters, equals, hashCode, and toString at compile time.

## ⚠️ Error Handling
The API uses standard HTTP status codes to indicate the success or failure of an API request. Common status codes include:
- `200 OK` - The request was successful.
- `201 Created` - The resource was successfully created.
- `204 No Content` - The resource was successfully deleted.
- `400 Bad Request` - The request was invalid or cannot be served.
- `404 Not Found` - The requested resource was not found.
- `500 Internal Server Error` - An error occurred on the server.

## 🔒 Security
The Account Service uses Spring Security to secure the API endpoints. Authentication and authorization are handled using JWT (JSON Web Tokens).

## ⚙️ Configuration
The service configuration is managed using Spring Cloud Config, which allows for centralized and externalized configuration management across all microservices.

## 📈 Monitoring
Spring Boot Actuator is used for monitoring and managing the application. It provides various endpoints to check the health, metrics, and other operational information of the service.

## 📝 Logging
Logging is configured using Logback, which is the default logging framework in Spring Boot. It provides powerful and flexible logging capabilities.

## 🧪 Testing
JUnit and Mockito are used for unit and integration testing. These frameworks provide a comprehensive set of tools for writing and running tests.

## 🚀 Build and Deployment
The project uses Maven for build automation and dependency management. The service can be packaged as a Docker container for deployment in a containerized environment.

<div align="center" >
    
## 🔗 Connect with me

 💼 [LinkedIn](https://www.linkedin.com/in/dinkarprasadjava)  |  🐙 [GitHub](https://github.com/DK12345678D) | 📧 [Gmail](mailto:dinkarprasad682@gmail.com) 
 
 ---
</div>


