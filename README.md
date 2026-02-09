# Item API – Spring Boot REST Application

This project is a simple Java Spring Boot backend application that implements
RESTful APIs to manage a collection of items. The application uses an in-memory
data store (`ArrayList`) and does not require any external database.

---

## Features
- Add a new item
- Retrieve an item by ID
- Input validation using Jakarta Validation
- In-memory data storage (ArrayList)

---

## Technologies Used
- Java 17
- Spring Boot
- REST APIs
- Maven

---

## Project Structure
src
└── main
├── java
│ └── com.example.demo
│ ├── controller
│ ├── service
│ └── model
└── resources
└── application.properties


---

## API Endpoints

### 1. Add Item
**POST** `/items`

#### Request Body
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Laptop"
}
Response
201 Created – Item successfully added

400 Bad Request – Validation failure (missing required fields)

2. Get Item by ID
GET /items/{id}

Example
GET /items/1
Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Laptop"
}
200 OK – Item found

404 Not Found – Item does not exist

Building and Running the Application Locally
Prerequisites
Ensure the following are installed on your system:

Java 17

Maven (or Maven Wrapper included in the project)

Git (optional, for cloning the repository)

Step 1: Clone the Repository
git clone https://github.com/manjiri112/ItemAPI.git
cd ItemAPI
Step 2: Build the Application
Run the following command from the project root directory:

mvnw clean package
This command:

Cleans previous builds

Compiles the source code

Runs tests

Generates an executable Spring Boot JAR file

After a successful build, the JAR file will be created at:

target/itemapi-0.0.1-SNAPSHOT.jar
Step 3: Run the Application
Start the application using:

java -jar target/itemapi-0.0.1-SNAPSHOT.jar
You should see logs indicating:

Tomcat started on port 8080
Started ItemApiApplication
Step 4: Access the API
The application will be available at:

http://localhost:8080
Use Postman or any REST client to test the endpoints.