# Fleet Management System  
### Spring Boot Project

**Student Name:** Elton Immanuel Rajkumar  
**Student ID:** 12301089
 


---

## 📌 Project Overview

The **Fleet Management System** is a Spring Boot–based backend application designed to manage vehicles, drivers, trips, maintenance records, and routes.  
It exposes RESTful APIs to perform full CRUD operations and demonstrates the use of JPA relationships, validation, enums, embedded objects, custom queries, Spring Profiles, and Actuator.

---

## 🛠️ Technologies Used

- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- H2 Database (Dev Profile)  
- MySQL (Prod Profile)  
- Spring Boot Actuator  
- Lombok  
- Maven  
- Postman (API Testing)

---

## 🧱 Project Architecture

- **Controller:** Handles HTTP requests  
- **Service:** Contains business logic  
- **Repository:** Handles database operations  
- **Database:** Stores persistent data  

---

## 📂 Entities & Relationships

### Entities
- Vehicle  
- Driver  
- License  
- Trip  
- MaintenanceRecord  
- Route (optional)

### JPA Relationships
- **OneToOne:** Driver ↔ License  
- **OneToMany:** Vehicle → MaintenanceRecord  
- **ManyToOne:** Trip → Vehicle  
- **ManyToOne:** Trip → Driver  
- **ManyToMany:** Trip ↔ Route (optional)

---

## 🔁 CRUD Operations

Full CRUD operations are implemented for all entities using REST APIs:
- Create (POST)
- Read (GET)
- Update (PUT)
- Delete (DELETE)

---

## 🔍 Custom Queries (10 Implemented)

1. Find maintenance records for a vehicle  
2. Find trips assigned to a driver  
3. Find trips using a specific vehicle  
4. Find vehicles due for maintenance  
5. Find active trips  
6. Count trips per driver  
7. Find completed vs ongoing trips  
8. Find drivers with expired licenses  
9. Find longest trips by distance  
10. Find vehicles with the most trips  

Queries are implemented using **derived query methods** and **JPQL (`@Query`)**.

---

## 🧪 Validation, Enum & Embedded

- **Validation:** `@Valid`, `@NotNull`, `@NotBlank`
- **Enum:** `TripStatus (ONGOING, COMPLETED)`
- **Embedded:** `Address` embedded inside `Driver` entity using `@Embeddable` and `@Embedded`
- **Transactional:** `@Transactional` used in service layer

---

## ⚙️ Spring Profiles

### Dev Profile
- Uses **H2 in-memory database**
- Configuration file: `application-dev.yml`

### Prod Profile
- Uses **MySQL database**
- Configuration file: `application-prod.yml`

---

## 📊 Spring Boot Actuator

Actuator is enabled for monitoring and management.

Available endpoints:
- `/actuator/health`
- `/actuator/info`
- `/actuator/metrics`
- `/actuator/env`

---

## ▶️ How to Run the Project

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `FleetmanagementApplication.java`
4. Access APIs via Postman at:


