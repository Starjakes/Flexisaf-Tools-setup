package com.flexisaf.studentmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "enrollments") // Optional but recommended
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY) // Consider lazy loading
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY) // Consider lazy loading
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(name = "enrollment_date", nullable = false) // Optional, for clarity
    private LocalDate dateEnrolled;

    // Getters and Setters (generated using your IDE)

    // Example of a getter
    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    // Example of a setter
    public void setDateEnrolled(LocalDate dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    // ... other getters and setters
}