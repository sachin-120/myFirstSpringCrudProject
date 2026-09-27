# myFirstSpringCrudProject

A simple RESTful CRUD backend for managing tasks, built with Java and Spring Boot. This project was created as a hands-on learning exercise to understand the fundamentals of building REST APIs with the Spring ecosystem — including layered architecture, JPA-based persistence, and standard HTTP operations.

> **Note:** This is a learning/portfolio project, not a production-ready system. It intentionally keeps scope small to focus on core Spring Boot concepts.

---

## Features

- Create a new task
- Retrieve all tasks
- Retrieve a single task by ID
- Update an existing task
- Delete a task by ID

---

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Maven**
- **REST API**
- **Git / GitHub**

---

## Architecture

The project follows a standard layered architecture pattern:


- **Controller** — Handles incoming HTTP requests and maps them to endpoints
- **Service** — Contains business logic
- **Repository** — Handles data access via Spring Data JPA
- **Database** — Persists task data

---

## API Endpoints

| Method | Endpoint                          | Description           |
|--------|-----------------------------------|------------------------|
| POST   | `/CRUD/create/tasks`              | Create a new task      |
| GET    | `/CRUD/getAllTasks`                | Get all tasks           |
| GET    | `/CRUD/getBy/tasks/{id}`          | Get a task by ID        |
| PUT    | `/CRUD/updateTask/task/{id}`      | Update a task by ID     |
| DELETE | `/CRUD/deleteTask/task/{id}`      | Delete a task by ID     |

---

## Example Request & Response

### Create Task — `POST /CRUD/create/tasks`

**Request Body:**
```json
{
  "title": "Learn Spring Boot",
  "description": "Complete the CRUD REST API project",
  "completed": false
}
```

**Response:**
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Complete the CRUD REST API project",
  "completed": false
}
```

### Get Task By ID — `GET /CRUD/getBy/tasks/1`

**Response:**
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Complete the CRUD REST API project",
  "completed": false
}
```

---

## HTTP Status Codes

| Status Code | Meaning                          |
|--------------|-----------------------------------|
| 200 OK       | Request succeeded                 |
| 201 Created  | Task created successfully         |
| 404 Not Found| Task with given ID does not exist |
| 400 Bad Request | Invalid input data             |
| 500 Internal Server Error | Unexpected server error |

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/<your-username>/myFirstSpringCrudProject.git
cd myFirstSpringCrudProject
```

### Run the Project Locally

**Prerequisites:**
- Java JDK installed
- Maven installed
- A configured database (e.g., MySQL/PostgreSQL) with connection details set in `application.properties`

**Run using Maven:**
```bash
mvn spring-boot:run
```

Or build and run the JAR:
```bash
mvn clean install
java -jar target/myFirstSpringCrudProject-0.0.1-SNAPSHOT.jar
```

The application will start on the default port (typically `http://localhost:8080`).

---

## Testing the API

You can test the endpoints using **Postman** or **cURL**.

### Using cURL

**Create a task:**
```bash
curl -X POST http://localhost:8080/CRUD/create/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn Spring Boot","description":"Complete the CRUD project","completed":false}'
```

**Get all tasks:**
```bash
curl http://localhost:8080/CRUD/getAllTasks
```

**Get task by ID:**
```bash
curl http://localhost:8080/CRUD/getBy/tasks/1
```

**Update a task:**
```bash
curl -X PUT http://localhost:8080/CRUD/updateTask/task/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn Spring Boot Advanced","description":"Updated description","completed":true}'
```

**Delete a task:**
```bash
curl -X DELETE http://localhost:8080/CRUD/deleteTask/task/1
```

### Using Postman

1. Import the endpoints listed above into a new Postman collection.
2. Set the request method and URL as shown in the table.
3. For POST/PUT requests, set the body type to `raw` → `JSON` and include the required fields.
4. Send the request and inspect the response.

---

## Concepts Demonstrated

- Building a REST API with Spring Boot
- Layered architecture (Controller → Service → Repository)
- CRUD operations using Spring Data JPA
- Handling HTTP requests and responses
- Basic project structuring with Maven
- Using Git/GitHub for version control

---

## Future Improvements

- Add input validation and better error handling
- Add authentication and authorization (e.g., JWT)
- Add API documentation with Swagger/OpenAPI
- Write unit and integration tests
- Containerize the application with Docker
- Add pagination and filtering for the "Get All Tasks" endpoint
- Deploy to a cloud platform
- Standardize endpoint naming conventions to follow REST best practices

---

## Author

**Sachin Santosh Sharma**
Beginner Java / Spring Boot developer, building projects to learn backend development.

- GitHub: https://github.com/sachin-120
- LinkedIn: https://www.linkedin.com/in/sachin-santosh-sharma-b93345404
