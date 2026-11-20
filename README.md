# Campus Club Directory (CSC 311)

Author: Patrick Hickey

A Spring Boot app that keeps a directory of campus clubs in an embedded Apache Derby
database. Assignment 2 adds accounts: a visitor must register and sign in (Spring
Security + Thymeleaf) before seeing the club directory.

## How to run

Requires JDK 25. The Maven project is in the `clubdirectory` folder.

1. Open a terminal in the repository folder and go into the project:

       cd clubdirectory

2. Start the app:

       ./mvnw spring-boot:run

   On Windows PowerShell use `.\mvnw.cmd spring-boot:run`. You can also run
   `ClubdirectoryApplication` from IntelliJ IDEA.

3. Open http://localhost:8085. You are sent to the sign-in page.
4. Click the register link, create an account, then sign in.
5. Add a club on the page, then use Sign out.

## Notes

- The server runs on port 8085 (set in `application.yaml`).
- Users are stored in the `APP_USERS` table with BCrypt-hashed passwords
  (the stored value starts with `$2a$`).
- The Derby database is created in a `data` folder when the app first runs. It is not
  committed to Git.
- This project builds on my Club Directory app from assignment 1, so it uses Derby and
  port 8085 instead of the H2 database and port 8080 from the Lost & Found example.
