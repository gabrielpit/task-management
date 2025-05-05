# **Task Management System**

## **Description**

A simple Task Management System built with Spring Boot and MySQL, providing full CRUD operations for managing tasks.

## **Technologies**

- **Spring Boot**  
- **Spring Data JPA**  
- **MySQL**  
- **Swagger** for API Documentation  

## **Features**

- Full CRUD functionality for tasks  
- API documentation via Swagger  
- Error handling and validation  

## **Setup**

1. Clone the repository:  

   ```bash
   git clone https://github.com/gabrielpit/task-management.git
   ```

2. Set up your MySQL database and update the `application.properties` file with your credentials.  

3. Build and run the project:  

   ```bash
   mvn spring-boot:run
   ```

4. Access the API:  

   ```bash
   http://localhost:8080/api/tasks
   ```

## **API Endpoints**

- **GET** `/api/tasks` - List all tasks  
- **GET** `/api/tasks/{id}` - Get a task by ID  
- **POST** `/api/tasks` - Create a new task  
- **PUT** `/api/tasks/{id}` - Update a task  
- **DELETE** `/api/tasks/{id}` - Delete a task  

## **License**

MIT License
