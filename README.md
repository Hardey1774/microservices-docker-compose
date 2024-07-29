HEAD
# Microservices Demo

This project contains a set of microservices for a demo e-commerce application. Each microservice is implemented using Spring Boot and managed using Docker Compose.

## Microservices

1. **springapp**: General service.
2. **registration**: Handles user registration.
3. **login**: Manages user authentication.
4. **cart**: Manages shopping cart functionality.
5. **payment**: Processes payments.
6. **order**: Manages orders.
7. **db**: Database service.

## Prerequisites

- Docker
- Docker Compose

## Running the Application

To run the application, navigate to the root directory of the project and execute the following command:

```sh
docker-compose up --build
# microservices-docker-compose
e3d9a65 (Initial commit)
