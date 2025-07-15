# 📱Contacts

Team Members:

1.Arpita Avadhut Kulkarni 

Mail:- arpitakulkarnii2212@gmail.com

2.Akanksha Laxman More

Mail:-akankshalm810@gmail.com

3.Afrin Farukh Shaikh

Mail:-shaikhafrin1607@gmail.com

# 👨‍🏫👩‍🏫 Student Management System – Java Console Project

A Java-based console application that simulates an student Managment system.To build a simple application to manage student records — add, update, delete, and view student information — using Java and Hibernate ORM for database interaction.

#Project Structure

student-management/
│
├─ src/main/java/
│   └─ com.example.sms/
│         ├─ entity/
│         │     └─ Student.java
│         ├─ dao/
│         │     └─ StudentDao.java
│         ├─ util/
│         │     └─ HibernateUtil.java
│         └─ App.java
│
├─ src/main/resources/
│   └─ hibernate.cfg.xml
│
└─ pom.xml


# ✨ Features

Add new students with details like name, email.

Update existing student records.

Delete student records.

List all students from the database.

# 💻 Technologies Used

Java: Core programming language.

MySQL: Relational database to store student data.

Jakarta Persistence (JPA) – ORM specification used by Hibernate.

Hibernate 7.0.5 – ORM framework implementing JPA.

Maven – Manages project dependencies.


# 📦 Dependencies

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.student</groupId>
  <artifactId>Student_Management_System</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <properties>

    <maven.compiler.source>17</maven.compiler.source>

    <maven.compiler.target>17</maven.compiler.target>

    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

  </properties>

    

<dependencies>

  <!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->

<dependency>

    <groupId>org.hibernate.orm</groupId>

    <artifactId>hibernate-core</artifactId>

    <version>7.0.5.Final</version>

</dependency>



<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->

<dependency>

    <groupId>org.postgresql</groupId>

    <artifactId>postgresql</artifactId>

    <version>42.7.7</version>

</dependency>



<!-- https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api -->

<dependency>

    <groupId>jakarta.persistence</groupId>

    <artifactId>jakarta.persistence-api</artifactId>

    <version>3.2.0</version>

</dependency>


<!-- https://mvnrepository.com/artifact/jakarta.transaction/jakarta.transaction-api -->

<dependency>

    <groupId>jakarta.transaction</groupId>

    <artifactId>jakarta.transaction-api</artifactId>

    <version>2.0.1</version>

</dependency>

</dependencies>
</project>


## 🗃️ Database Tables

  CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

## 📸 Final Output

## ![Arpitakulkarni](https://github.com/user-attachments/assets/4328a29e-1347-4897-82ec-4d2415874beb)

