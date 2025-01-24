package com.flexisaf.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instructors") // Optional but recommended
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instructorId;

    @Column(nullable = false) // Ensure first and last names are not null
    private String firstName;

    @Column(nullable = false) // Ensure last name is not null
    private String lastName;

    @Column(unique = true, nullable = false) // Ensure email is unique and not null
    private String email;

    // Getters and Setters (generated using your IDE)

    // Example of a getter
    public String getFirstName() {
        return firstName;
    }

    // Example of a setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // ... other getters and setters
}
