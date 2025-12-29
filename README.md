# 🎓 Student Management System – Backend (Spring Boot)

A **RESTful backend application** built using **Java and Spring Boot** to manage students efficiently.
This project demonstrates **clean layered architecture**, **JPA/Hibernate integration**, **MySQL persistence**, and **REST API best practices**.

---

## 📌 Features

* Create, Read, Update, Delete (CRUD) Student records
* RESTful API design
* Input validation using Bean Validation
* Global exception handling
* MySQL database integration using JPA/Hibernate
* Clean layered architecture (Controller → Service → Repository)
* Interview & industry standard project structure

---

## 🛠️ Tech Stack

| Technology      | Description         |
| --------------- | ------------------- |
| Java            | Java 17+            |
| Spring Boot     | Backend framework   |
| Spring Data JPA | ORM & persistence   |
| Hibernate       | JPA implementation  |
| MySQL           | Relational database |
| Maven           | Build tool          |
| REST API        | Communication layer |

---

## 🏗️ Project Architecture

```
Controller → Service → Repository → Database
```

This separation ensures:

* Loose coupling
* Easy maintenance
* Better testability
* Real-world enterprise design

## 🧱 Database Design

### **Student Table**

| Column     | Type             |
| ---------- | ---------------- |
| id         | BIGINT (PK)      |
| name       | VARCHAR          |
| email      | VARCHAR (Unique) |
| age        | INT              |
| department | VARCHAR          |

---

## 🔗 REST API Endpoints

### Student APIs

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| POST   | `/api/students`      | Create a student  |
| GET    | `/api/students/{id}` | Get student by ID |
| GET    | `/api/students`      | Get all students  |
| PUT    | `/api/students/{id}` | Update student    |
| DELETE | `/api/students/{id}` | Delete student    |

---

## 📥 Sample Request (Create Student)

**POST** `/api/students`

```json
{
  "name": "John Doe",
  "email": "john.doe@gmail.com",
  "age": 22,
  "department": "Computer Science"
}
```

---

## 📤 Sample Response

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@gmail.com",
  "age": 22,
  "department": "Computer Science"
}
```