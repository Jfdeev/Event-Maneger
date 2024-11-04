
# Event Manager

This is an event management system project developed in Java, with features for event registration and management, participant control, capacity management, and data export in CSV format. The project uses **Maven** for dependency management and includes **JUnit** unit tests to ensure the functionality of key methods.

## Project Structure

- **`src/main/java`**: Source code of the project, including all classes and methods for the event management system.
- **`src/test/java`**: Unit test files using JUnit, ensuring system functionality.
- **`target`**: Automatically generated folder by Maven containing the compiled files (`.class`) of the project.
- **`pom.xml`**: Maven configuration file, defining project dependencies, such as JUnit, and managing versioning.
- **`.editorconfig`**: Configuration file to enforce code formatting standards.

## Features

- **Event Registration**: Register events with name, date, location, and capacity.
- **Participant Enrollment**: Manage participant enrollments, respecting event capacity limits.
- **CSV Export**: Export event data to a CSV file for storage and analysis.
- **Unit Tests**: JUnit tests to validate the main methods.

## Prerequisites

- **Java JDKse** 22 or higher
- **Maven** 3.6 or higher

## Installation and Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/event-manager.git
   ```
2. **Install dependencies with Maven**:
   Navigate to the project's root directory and run:
   ```bash
   mvn clean install
   ```
3. **Run unit tests**:
   Ensure everything is working correctly by running:
   ```bash
   mvn test
   ```
4. **Run the program**:
   After installation, you can start the project with:
   ```bash
   mvn exec:java -Dexec.mainClass="com.yourproject.Main"
   ```

## CSV Data Export

Data can be exported to CSV files using the `exportToCSV()` function in the main class. The generated file will be located in the specified directory within the code (by default, in the project folder).

## Unit Testing

Tests are located in `src/test/java` and implemented using **JUnit** to validate the main methods.

To run the tests:
```bash
mvn test
```

## EditorConfig Setup

This project includes an `.editorconfig` file to maintain code formatting consistency across different editors. Ensure that your editor is configured to recognize `.editorconfig`.

## Contributing

Contributions are welcome! To contribute:

1. **Fork** the repository
2. Create a **branch** for your feature (`git checkout -b feature/new-feature`)
3. **Commit** your changes (`git commit -m 'Add new feature'`)
4. **Push** to the branch (`git push origin feature/new-feature`)
5. Open a **Pull Request**

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

This README is formatted in English and styled for GitHub with Markdown for ease of reading and navigation.
