# Item API – Spring Boot REST Application

This project is a simple Java Spring Boot backend application that implements
RESTful APIs to manage a collection of items. It uses an in-memory data store
(ArrayList) and does not require any database.

---

## Features
- Add a new item
- Get an item by ID
- Input validation using Jakarta Validation
- In-memory storage (ArrayList)

---

## Technologies Used
- Java 17
- Spring Boot
- REST APIs
- Maven

---

## API Endpoints

### Add Item
**POST** `/items`

Request Body:
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Laptop"
}
