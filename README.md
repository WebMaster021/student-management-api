Student Management API

A secure and scalable REST API built using Spring Boot for managing student records.
The project demonstrates authentication, authorization, CRUD operations, database migration, exception handling, and API documentation following industry-standard backend development practices.

🚀 Features
🔐 JWT-based Authentication & Authorization
👨‍🎓 Student CRUD Operations
🔍 Search students by name
📊 Filter students by grade
🛡️ Protected REST endpoints using Spring Security
🗄️ PostgreSQL database integration
📦 Flyway database migrations
📘 Swagger/OpenAPI API documentation
⚠️ Global exception handling with proper HTTP status codes
🧱 Layered architecture (Controller → Service → Repository)

🛠️ Tech Stack
| Technology      | Purpose                           |
| --------------- | --------------------------------- |
| Java            | Programming Language              |
| Spring Boot     | Backend Framework                 |
| Spring Security | Authentication & Authorization    |
| JWT             | Secure Token-Based Authentication |
| PostgreSQL      | Relational Database               |
| Spring Data JPA | ORM & Database Access             |
| Flyway          | Database Version Control          |
| Swagger/OpenAPI | API Documentation                 |
| Maven           | Dependency Management             |

📂 Project Structure
src/main/java/com/example/studentapi
│
├── controller      # REST Controllers
├── service         # Business Logic
├── repository      # Data Access Layer
├── entity          # JPA Entities
├── dto             # Request/Response DTOs
├── security        # JWT & Security Config
├── exception       # Global Exception Handling
└── config          # Application Configurations
🔐 Authentication

This API uses JWT (JSON Web Token) authentication.

Public Endpoints
POST /auth/register
POST /auth/login
Protected Endpoints

All student-related endpoints require a valid JWT token.

Example:

Authorization: Bearer <your_token>
📘 API Documentation

Swagger UI is available at:

http://localhost:8080/swagger-ui/index.html
📌 API Endpoints
Authentication
Method	Endpoint	Description
POST	/auth/register	Register a new user
POST	/auth/login	Authenticate user & generate JWT
Students
Method	Endpoint	Description
GET	/students	Get all students
GET	/students/{id}	Get student by ID
POST	/students	Create student
PUT	/students/{id}	Update student
DELETE	/students/{id}	Delete student
GET	/students/search?name=	Search students by name
GET	/students/filter?grade=	Filter students by grade
⚙️ Setup & Installation
1️⃣ Clone the Repository
git clone https://github.com/your-username/student-management-api.git
cd student-management-api
2️⃣ Configure PostgreSQL

Create a database:

CREATE DATABASE studentdb;

Update application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password
3️⃣ Run Flyway Migrations

Flyway migrations run automatically when the application starts.

4️⃣ Build & Run the Application

Using Maven:

mvn clean install
mvn spring-boot:run

Application will start at:

http://localhost:8080
🧪 Example JSON Request
Create Student
{
  "name": "John Doe",
  "email": "john@example.com",
  "grade": "A"
}
⚠️ Exception Handling

Implemented global exception handling using @ControllerAdvice.

Examples:

Status Code	Description
400	Bad Request
401	Unauthorized
404	Resource Not Found
500	Internal Server Error
✅ Learning Outcomes

This project helped strengthen knowledge of:

REST API Development
Authentication & Authorization
Secure Backend Architecture
Database Integration
Exception Handling
API Documentation
Production-Level Spring Boot Practices
📸 Future Improvements
Role-based access control (Admin/User)
Pagination & Sorting
Docker Deployment
Unit & Integration Testing
CI/CD Pipeline
Refresh Tokens
👨‍💻 Author

Tushar Kumar
