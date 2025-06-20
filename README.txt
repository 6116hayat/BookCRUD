BookCRUD - Spring Boot CRUD Application

😀 Overview
• BookCRUD is a simple SpringBoot application that provides CRUD(Create, Read, Update, Delete) functionalities for managing books.
• It uses a RESTful API to interact with the databases, making book management easy, seamless and efficient

🚀 Features
→ Register a new book 📕(POST /books)
→ Fetch all list of books 📃 (GET /books)
→ Fetch Book by ID 🔍 (GET /books/{id})
→ Update book details by ID ✏️ (PUT /books/{id})
→ Delete book by ID 🗑️ (DELETE /books/{id})

🏗️ Project Structure
java/
|--com.hayat.BookCRUD/
    |-- BookCRUDApplication.java # Main entry point of the App
    |-- Book.java           # Entity Representation
    |-- BookController.java # Handles HTTP requests
    |-- BookService.java    # Business Logic and data processing
    |-- BookRepo.java       # Database interactions (JPA repository)
resources/
|-- application.properties #Configurtions

🔧 Technologies Used
⇒ Spring Boot : Backend Framework
⇒ Spring Data JPA : Database Management
⇒ H2 Database : Database Storage
⇒ Spring Web : REST API handling
⇒ Lombok (optional) : Boilerplate code reduction
⇒ Postman : For Running and Testing APIs

⚙️ Setup & Run
    🧰 Prerequisites
    ⁕ Install Java 17 or later
    ⁕ Install Spring Boot dependencies
    ⁕ Install Maven (for build)

🔃 How to run the application
1. Clone the repository
2. bash
    cd BookCRUD
    Build & Run using Maven

📌 API Endpoints
1. POST : /books ⇒ Add a new book
2. GET : /books ⇒ Get all Books
3. GET : /books/{id} ⇒ Get book by ID
4. POST : /books/{id} ⇒ Update book by ID
5. POST : /books/{id} ⇒ Delete book by ID

🏛️License
This project is open-source, feel free to modify and enhance it!!

🤝 Contribution
Want to improve this project? Contributions are welcome!
→ Fork the repository
→ Create a new branch
→ Submit a pull request

