This project is a RESTful API for managing tickets, built with Java and Spring Boot. It also includes functionality to fetch GitHub user profiles.

## Features

1. Ticket Management:
   - Create, read, update, and delete tickets
   - Pagination support for retrieving tickets
   - Filter tickets by specific criteria
   - Ticket properties: id, user, creation date, update date, and status (open/closed)

2. GitHub User Search:
   - Fetch and display GitHub user profiles using the GitHub API

## Technologies Used

- Java 17
- Spring Boot 3.4.0
- PostgreSQL
- Docker
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Docker and Docker Compose

### Running the Application

1. Clone the repository:
   ```
   git clone https://github.com/java-ccamilofierro/Tickets-api.git
   cd ticket-api
   ```

2. Build the application:
   ```
   mvn clean install -DskipTests
   ```

3. Start the application and database using Docker Compose:
   ```
   docker-compose up --build
   ```

The application should now be running at \`http://localhost:8080\`.

## API Endpoints

### Ticket Management

- Get all tickets (with pagination):
  ```
  GET http://localhost:8080/api/v1/tickets?page=0&size=5
  ```

- Get a specific ticket:
  ```
  GET http://localhost:8080/api/v1/tickets/{id}
  ```

- Create a new ticket:
  ```
  POST http://localhost:8080/api/v1/tickets
  ```
  Request body example:
  ```json
  {
    "username": "Cristian Fierro",
    "status": "Cerrado"
  }
  ```
  Note: The status must be either "Cerrado" or "Abierto". Both status and username are required in the request.

- Update a ticket:
  ```
  PUT http://localhost:8080/api/v1/tickets/{id}
  ```

- Delete a ticket:
  ```
  DELETE http://localhost:8080/api/v1/tickets/{id}
  ```

### GitHub User Search

- Search for GitHub users:
  ```
  GET http://localhost:8080/api/v1/github/users?name={username}
  ```

## Testing

A Postman collection is included in the project for easy testing of the API endpoints.

## Notes

- The application uses PostgreSQL as the database, which is set up automatically when using Docker Compose.
- Make sure to include both the status and username in ticket creation and update requests.
- The status can only be "Cerrado" (Closed) or "Abierto" (Open).

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests.

## License

This project is licensed under the [MIT License](LICENSE).`;
