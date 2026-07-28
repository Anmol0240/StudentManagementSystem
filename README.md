# Enterprise Student Management System

A production-grade **Student Management System** REST API built with Java 21 and Spring Boot 3, designed to demonstrate enterprise-level backend architecture, security, and best practices.

## Overview

This system allows an educational institution to manage students, courses, enrollments, attendance, exams, and marks through a secure, role-based REST API. It is built following clean, layered architecture principles and industry-standard practices used in real production systems.

## Features

- JWT-based authentication with access and refresh tokens
- Role-based authorization (`ADMIN`, `STUDENT`)
- Student and course management
- Student enrollment into courses
- Attendance tracking
- Exam creation and marks management
- Dashboard and reporting APIs
- Centralized global exception handling
- Request validation using Bean Validation
- Interactive API documentation via Swagger/OpenAPI
- Dockerized application and database
- Unit and integration tests with JUnit 5 & Mockito

## Tech Stack

| Layer            | Technology                     |
|-------------------|---------------------------------|
| Language          | Java 21                        |
| Framework         | Spring Boot 3.x                |
| Security          | Spring Security + JWT (JJWT)   |
| Persistence       | Spring Data JPA (Hibernate)    |
| Database          | MySQL 8                        |
| Build Tool        | Maven                          |
| API Docs          | springdoc-openapi (Swagger UI) |
| Testing           | JUnit 5, Mockito               |
| Containerization  | Docker, Docker Compose         |
| Boilerplate       | Lombok                         |

## Folder Structure

```
student-management-system/
├── src/
│   ├── main/
│   │   ├── java/com/enterprise/sms/
│   │   │   ├── config/          # Security, Swagger, and app configuration
│   │   │   ├── controller/      # REST controllers
│   │   │   ├── dto/             # Request/response DTOs
│   │   │   ├── entity/          # JPA entities
│   │   │   ├── exception/       # Global exception handling
│   │   │   ├── repository/      # Spring Data JPA repositories
│   │   │   ├── security/        # JWT filters, providers, user details
│   │   │   ├── service/         # Business logic
│   │   │   ├── util/            # Helper/utility classes
│   │   │   └── StudentManagementSystemApplication.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/                    # Unit and integration tests
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── .gitignore
└── README.md
```

## Prerequisites

- Java 21 (JDK)
- Maven 3.9+
- Docker & Docker Compose
- MySQL 8 (if running without Docker)

## Running Locally (without Docker)

1. Create a MySQL database:
   ```sql
   CREATE DATABASE sms_db;
   ```
2. Set environment variables (or edit `application.yml` directly):
   ```
   DB_HOST=localhost
   DB_PORT=3306
   DB_NAME=sms_db
   DB_USERNAME=sms_user
   DB_PASSWORD=sms_password
   JWT_SECRET=your-secret-key
   ```
3. Build and run:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. The API will be available at `http://localhost:8080`
5. Swagger UI: `http://localhost:8080/swagger-ui.html`

## Running with Docker

1. Build and start all services (app + MySQL):
   ```bash
   docker-compose up --build
   ```
2. The API will be available at `http://localhost:8080`
3. MySQL will be available at `localhost:3306` with data persisted in a named volume (`sms-mysql-data`)
4. To stop:
   ```bash
   docker-compose down
   ```
5. To stop and remove persisted data:
   ```bash
   docker-compose down -v
   ```

## API Documentation

Once the application is running, Swagger UI is available at:

```
http://localhost:8080/swagger-ui.html
```

## Roles

| Role      | Permissions                                                                 |
|-----------|-------------------------------------------------------------------------------|
| `ADMIN`   | Manage students, courses, enrollments, attendance, exams, marks; view dashboards |
| `STUDENT` | View own profile, enrolled courses, attendance, and exam results             |

## Project Status

This project is being developed incrementally, module by module, following clean architecture and production-quality coding standards.

## License

This project is for portfolio and educational purposes.
