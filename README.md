# 🏦 TRAVEL BANK - Microservices Project

TRAVEL BANK is a Spring Boot-based microservices application designed to simulate a simplified banking platform. It consists of three core microservices that handle **Accounts**, **Cards**, and **Loans** functionalities. Each service is built with **Spring Boot**, **Spring Data JPA**, **H2 database**, and includes **validations** and **exception handling** for robust and secure development.

---
![Alt text](https://github.com/vinaysteja2/TRAVEL-BANK_Micorservices_v.1.0/blob/master/screenshots/Screenshot%202025-05-20%20203106.png?raw=true)
## 🧩 Microservices Overview

### 1️⃣ **Accounts Service**
- Allows **customer registration**.
- Creates a new **bank account** during registration.
- Supports full **CRUD operations**.
- Includes validations and global exception handling.

### 2️⃣ **Cards Service**
- Enables customers to **apply for credit or debit cards**.
- Manages card issuance and details.
- Provides **create, update, fetch, and delete** APIs.

### 3️⃣ **Loans Service**
- Customers can **apply for loans** and track loan details.
- Full **CRUD functionality** for loan records.

---

## 🛠️ Tech Stack

- ⚙️ Java 17+
- 🚀 Spring Boot 3.x
- 📦 Spring Data JPA
- 💾 H2 In-Memory Database
- 📘 Swagger (OpenAPI) for API Documentation
- 🧪 Postman for API Testing
- ☕ Maven for Dependency Management

---

## 📌 Features

- ✅ Microservice architecture
- ✅ RESTful APIs with full CRUD operations
- ✅ Bean validations on input data
- ✅ Global exception handling
- ✅ In-memory H2 DB for quick testing
- ✅ Swagger UI for interactive API docs
- ✅ Postman collection included for easy testing

---

## 📂 Postman Collection

🧪 You can find the Postman collection in the repository filname is "TRAVEL-BANK.postman_collection.json"  
It contains ready-to-use requests to test all available APIs for **Accounts**, **Cards**, and **Loans**.

---

## 📈 Future Enhancements

- 🔄 Add Kafka for inter-service communication
- 🌐 Integrate with API Gateway and Eureka
- 📊 Use ELK (Elasticsearch, Logstash, Kibana) for logging and monitoring
- 🐳 Containerize with Docker

---

## 📸 Swagger UI

## You can access the Swagger documentation at: below 
(http://localhost:{port}/swagger-ui/index.html)

##You can access the H2 Database at: below 
(localhost:8090/h2-console)
