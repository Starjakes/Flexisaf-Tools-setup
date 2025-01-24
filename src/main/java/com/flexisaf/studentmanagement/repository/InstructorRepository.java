package com.flexisaf.studentmanagement.repository;

import com.flexisaf.studentmanagement.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
