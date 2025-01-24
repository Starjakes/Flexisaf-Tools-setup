package com.flexisaf.studentmanagement.repository;

import com.flexisaf.studentmanagement.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
