# S1.06 — Enums, Dates and Records

## 🎯 Objectives
This task introduces three core Java concepts for writing clean, safe, and modern code:
- **Enums**: Represent fixed and controlled sets of values.
- **Java Time API**: Work with dates and times in a robust and reliable way.
- **Records**: Define immutable data classes with minimal boilerplate.

## 📌 Level 1 — Enums

- **Exercise 1**: Create a Day enum and determine if it is a weekday or weekend.
- **Exercise 2**: Create a Level enum (LOW, MEDIUM, HIGH) and use it in a Task class.
- **Exercise 3**: Add methods inside enums (e.g. getColor()).
- **Exercise 4**: Convert a String to an enum using valueOf and handle invalid values.

## 📌 Level 2 — Dates and Times

- **Exercise 1**: Display current date and time with LocalDate, LocalTime, and LocalDateTime.
- **Exercise 2**:Calculate differences using Period and Duration.
- **Exercise 3**: Add or subtract time units from a date.
- **Exercise 4**: Format dates with DateTimeFormatter.
- **Exercise 5**: Check if a date is before today.
- **Exercise 6**: Create an agenda with LocalDateTime events.

## 📌 Level 3 — Records

- **Exercise 1**: Create a Person(String name, int age) record.
- **Exercise 2 & 3**: Add custom methods and validation.
- **Exercise 4**: Compare records with traditional classes.
- **Exercise 5**: Filter a list of records using streams and lambdas.

## 🛠 Technologies

- Java 21
- IntelliJ IDEA
- Git & GitHub

## 🚀 Installation and Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/carlasalmeron/S1.09-Enums-Dates-and-Records.git
   ```
2. **Environment Variables**: No specific `.env` variables are required for this project.
3. **Execution**:
   The project is divided into three Maven modules. To run a specific exercise, navigate to the level folder and use Maven:

   ```bash
   # Navigate to a level folder:
   cd Level1

   # Compile the module:
   mvn clean compile

   # Run a specific task (e.g., Task 1):
   mvn exec:java -Dexec.mainClass="task1.Main"
   ```

   *Manual compilation (if Maven is not in PATH):*
   ```cmd
   javac -d bin src/main/java/task1/*.java
   java -cp bin task1.Main
   ```
4. **Tests**: Manual verification via the `Main` methods in each task package.

## 🌍 Portability & Best Practices

- **Type-safe enums**: Using Enums instead of constants for better error handling.
- **Immutable data**: Using Records to declare data carriers concisely.
- **Modern time handling**: Utilizing the `java.time` package for robust date operations.
- **Clean Code**: Adhering to declarative and readable Java patterns.