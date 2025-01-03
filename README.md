# Sonardive Backend developer Spring Boot Code Task  


This project is a Spring Boot application that demonstrates the use of MapStruct for mapping between entities and DTOs. It includes entities, DTOs, mappers, services, and unit tests.

## Project Structure

The project is structured as follows:

- **Entities**: Represent the core data models.
  - `Country`: Represents a country with `id` and `isoCode`.
  - `Company`: Represents a company with `id`, `name`, and a `Country` object.

- **DTOs**: Data Transfer Objects used to transfer data between layers.
  - `CountryDto`: A record representing a country DTO with `id` and `name`.
  - `CompanyDto`: A record representing a company DTO with `id`, `name`, and a `CountryDto`.

- **Mappers**: MapStruct mappers to convert between entities and DTOs.
  - `CountryMapper`: Maps `Country` to `CountryDto` and uses `CountryService` to map the `isoCode` to a country name.
  - `CompanyMapper`: Maps `Company` to `CompanyDto` and uses `CountryMapper` for nested mapping.

- **Services**: Contains business logic.
  - `CountryService`: Provides a dummy method to get the name of a country based on its ISO code.

- **Tests**: Unit tests for the mappers.
  - `CountryMapperTest`: Tests the `CountryMapper` functionality.
  - `CompanyMapperTest`: Tests the `CompanyMapper` functionality.

## Dependencies

The project uses the following dependencies:

- **Spring Boot**: For building the application.
- **MapStruct**: For mapping between entities and DTOs.
- **JUnit**: For unit testing.
- **Mockito**: For mocking dependencies in tests.

## How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/EmadHussien/Sonardive-Backend-developer-Code-Task.git
   cd backend-code-task

2. **Build the Project**:
   
    To build the project, run the following command:
  
    ```bash
    ./mvnw clean install

3. **Run the Tests**:

     To run the unit tests, use the following command:

```bash
./mvnw test
