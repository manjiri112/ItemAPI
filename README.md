# Item API – Spring Boot Application

This is a simple Java Spring Boot backend application that provides RESTful APIs
to manage a collection of items. The application uses an in-memory data store
(ArrayList) and does not require any database.

---

## Features
- Add a new item
- Get an item by ID
- Input validation
- In-memory storage

---

## Technologies Used
- Java
- Spring Boot
- REST API
- Maven
- Validation (Jakarta)

---

## API Endpoints

### 1. Add Item
**POST** `/items`

Request Body:
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Laptop"
}
