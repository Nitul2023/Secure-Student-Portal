StudentTrack – Full Stack Dynamic Web Application
StudentTrack is a Java-based student management web application built with JSP, Servlets, JDBC, and MySQL. It provides a dynamic web interface for student account registration, login, dashboard access, account updates, and password recovery.
Features
- Student sign-up and login
- Student dashboard
- View student information
- Update account details
- Forgot-password workflow
- Database access through JDBC and a DAO layer
- JSP-based dynamic web pages
Technology Stack
- Backend: Java, Java Servlets
- Frontend: JSP, HTML, CSS (as used in the project)
- Database connectivity: JDBC
- Database: MySQL (configure to match your local database)
- IDE / Server: Eclipse-compatible Dynamic Web Project; a compatible servlet container such as Apache Tomcat
Project Structure
StudentTrack-FullStack-DynamicWebProject/
├── src/main/java/
│   ├── com/pentagon/Conn/       # Database connection
│   ├── com/pentagon/StudentDAO/ # DAO interface and implementation
│   ├── com/pentagon/StudentDTO/ # Student data model
│   └── com/student/dynamic/     # Servlet controllers
└── src/main/webapp/
    ├── dashboard.jsp
    ├── forgotpassword.jsp
    ├── login.jsp
    ├── signup.jsp
    ├── update.jsp
    └── view_user.jsp
Requirements
- JDK compatible with the project's configured Java version
- Eclipse IDE for Enterprise Java and Web Developers, or another Java web IDE
- Apache Tomcat compatible with the Servlet API used by the project
- MySQL Server and a MySQL JDBC driver
Setup and Run
1. Clone or download this repository.
2. Open Eclipse and choose File → Import → Existing Projects into Workspace. Select the project directory.
3. Configure a local MySQL database and create the tables/columns expected by the DAO implementation.
4. Open src/main/java/com/pentagon/Conn/Connectors.java and configure the JDBC URL, database name, username, and password for your local environment. Do not commit real credentials.
5. Ensure the MySQL JDBC driver is available to the project and deployed application.
6. Add a compatible Apache Tomcat server in Eclipse and associate it with the project.
7. Run the project on the server and open the application's context URL in your browser. The exact URL depends on your Tomcat context path.
Database note: The ZIP does not include a standalone SQL schema or seed script. Use the DAO implementation to determine the exact table and column names required, then create the schema in your local MySQL instance.

Security Notes
- Keep database credentials out of source control; use environment variables or a local configuration file excluded from Git.
- Use prepared statements for SQL queries.
- Store passwords using a modern password-hashing algorithm rather than plaintext.
- Validate user input on the server and apply appropriate session and authorization checks.
- Configure password recovery securely before deploying publicly.
Future Improvements
- Add a documented database schema and sample data
- Improve input validation and error handling
- Add role-based access control
- Add responsive styling and automated tests
Author
Nitul Bora
