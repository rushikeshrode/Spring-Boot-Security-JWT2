
# SPRING-BOOT-SECURITY-JWT

Secure Your Future with Unbreakable Authentication

![GitHub last commit](https://img.shields.io/github/last-commit/rushikeshrode/Spring-Boot-Security-JWT2)
![Java](https://img.shields.io/badge/Java-100.0%25-blue)
![Languages](https://img.shields.io/github/languages/top/rushikeshrode/Spring-Boot-Security-JWT2)
![XML](https://img.shields.io/badge/XML-100.0%25-blue)

Built with the tools and technologies:

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-100.0%25-brightgreen)
![JWT](https://img.shields.io/badge/JWT-100.0%25-brightgreen)

---

## 📑 Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Testing](#testing)

---

## 🧩 Overview

**Spring-Boot-Security-JWT** is a powerful starter template for implementing JWT-based authentication in Spring Boot applications. It provides a secure, scalable foundation for building RESTful APIs with integrated user management and MySQL data persistence.

### 🚀 Why Spring-Boot-Security-JWT?

This project simplifies secure user authentication and authorization, enabling developers to focus on core business logic. The core features include:

- 🛡️ **Security**: Stateless JWT authentication with custom filters for secure API access.
- 📈 **Scalability**: Built on Spring Boot, supporting scalable backend architecture.
- 🔐 **User Management**: Secure registration, login, and user data handling.
- 🔍 **Monitoring**: Health check endpoint for deployment and uptime monitoring.
- 💾 **Data Persistence**: Seamless integration with MySQL for reliable data storage.
- ⚙️ **Configurability**: Flexible security and application configuration for diverse project needs.

---

## 🗂️ Project Structure

The project follows a clean and modular structure typical of Spring Boot applications:

```
com.rush.jwt2
├── config
│   ├── AppConfig
│   └── SecurityConfig
├── controller
│   ├── AuthController
│   ├── HealthCheck
│   └── UserController
├── dto
│   ├── AuthResponse
│   ├── LoginRequest
│   └── RegisterRequest
├── entity
│   └── User
├── repository
│   └── UserRepo
├── security
│   ├── CustomUserDetailsService
│   └── JwtAuthenticationFilter
├── service
│   ├── AuthService
│   ├── JwtService
│   └── UserService
└── RushikeshApplication
```

### 📌 Highlights

- **config**: Application and security configuration classes.
- **controller**: REST endpoints for authentication, health checks, and user operations.
- **dto**: Data Transfer Objects for request and response payloads.
- **entity**: JPA entity representing the `User`.
- **repository**: Interface for database operations using Spring Data JPA.
- **security**: Custom JWT filter and user details service for authentication.
- **service**: Business logic for authentication, JWT handling, and user management.
- **RushikeshApplication**: Main entry point for the Spring Boot application.

---

## 🛠️ Getting Started

### 📋 Prerequisites

Make sure you have the following installed:

- **Java**
- **Maven**

### 📦 Installation

Clone the repository and install dependencies:

```bash
git clone https://github.com/rushikeshrode/Spring-Boot-Security-JWT2
cd Spring-Boot-Security-JWT2
mvn install
```

---

## ▶️ Usage

Run the project using Maven:

```bash
mvn exec:java
```

---

## 🧪 Testing

Run the test suite using Maven:

```bash
mvn test
```
Spring-Boot-Security-JWT uses [JUnit](https://junit.org/junit5/) for testing.


## 🙌 Acknowledgements

Thanks to all contributors and open-source libraries that made this project possible.

---

## 📄 License
This project is open-source and free to use for learning purposes.

## 👤 Author

**RUSHIKESH RODE**  
📧 Email: rushikeshrode01@gmail.com  
💼 LinkedIn: [Rushikesh Rode](https://www.linkedin.com/in/rushikesh-rode-097572312)  
💻 GitHub: [Rushikesh Rode](https://github.com/rushikeshrode)  
🌐 Portfolio: [Rushikesh Rode](https://rushikeshrode.github.io/Rushikesh-s-Portfolio/)   
📍 Location: Pune, India

---

