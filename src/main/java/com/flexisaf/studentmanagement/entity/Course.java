package com.flexisaf.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses") // Optional, but recommended for clarity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(nullable = false, unique = true) // Consider adding constraints
    private String courseName;

    @Column(length = 500) // Optional, for column size limitation
    private String courseDescription;

    @Column(nullable = false) // Ensure credit hours cannot be null
    private int creditHours;

    // Getters and Setters (generated using your IDE)

    // Example of a getter
    public String getCourseName() {
        return courseName;
    }

    // Example of a setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // ... other getters and setters
}