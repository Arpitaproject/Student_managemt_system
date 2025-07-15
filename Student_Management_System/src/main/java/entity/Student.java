package entity;
//import Student.Entity;
//import Student.Id;

import jakarta.persistence.Id;

@Entity

Table(name = "students")
public class Student {
    Id GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Student() {}
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // getters & setters
}

