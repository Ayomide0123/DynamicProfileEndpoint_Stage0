# Stage 0 Task: Build a Dynamic Profile Endpoint

## Cat Fact Profile API (Spring Boot Project)

A simple **RESTful API** built with **Spring Boot** that returns user details along with a **random cat fact** fetched from the external API [CatFact Ninja](https://catfact.ninja/fact).

---

## Features

* Returns a structured JSON response with:

    * API status e.g "success"
    * User information (email, name, stack)
    * Current UTC timestamp in ISO 8601 format
    * Random cat fact from `https://catfact.ninja/fact`
* Handles external API failures gracefully
* Has connection and read timeouts (4 seconds each)

---

## Sample Response

If the external API is up:

```json
{
  "status": "success",
  "user": {
    "email": "oyetimehin31@gmail.com",
    "name": "Oyetimehin Ayomide",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-15T15:45:00Z",
  "fact": "Cats can rotate their ears 180 degrees."
}
```

If the external API is down:

```json
{
  "status": "success",
  "user": {
    "email": "oyetimehin31@gmail.com",
    "name": "Oyetimehin Ayomide",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-15T15:45:00Z",
  "fact": "Could not fetch cat fact at this time. Please try again later."
}
```

---

## Dependencies

This project uses the following key dependencies:

| Dependency                    | Purpose                                                   |
| ----------------------------- | --------------------------------------------------------- |
| **Spring Boot Starter Web**   | To build RESTful APIs                                     |
| **Lombok**                    | Reduces boilerplate code (getters, setters, constructors) |

---

## Installation & Setup

### 1️. Clone the Repository

```bash
git clone https://github.com/Ayomide0123/DynamicProfileEndpoint_Stage0.git
cd DynamicProfileEndpoint_Stage0
```

### 2️. Open in your IDE

Use **IntelliJ IDEA**, **VS Code**, or **Eclipse**.
Make sure you have the **Java SDK (21 or later)** installed.

Check your Java version:

```bash
java -version
```


### 3️. Build the Project

If you’re using **Maven**:

```bash
mvn clean install
```

If you’re using **Gradle**:

```bash
./gradlew build
```

### 4️. Run Locally

Run using Maven:

```bash
mvn spring-boot:run
```

or directly from your IDE, run the `DynamicProfileEndpointApplication.java` class.

Once running, open your browser: **`http://localhost:8080/me`** or use Postman: 


* Method: `GET`
* URL: `http://localhost:8080/me`

---

## Author

**Oyetimehin Ayomide**
* 📧 [oyetimehin31@gmail.com](mailto:oyetimehin31@gmail.com)
* 💻 Backend Stack: Java / Spring Boot
