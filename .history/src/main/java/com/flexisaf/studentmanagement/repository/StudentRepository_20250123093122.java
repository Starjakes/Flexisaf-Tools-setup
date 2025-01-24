package com.flexisaf.studentmanagement.repository;

import com.flexisaf.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
