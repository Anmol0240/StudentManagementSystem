package com.enterprise.sms.repository;

import com.enterprise.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByRollNumber(String rollNumber);

    Optional<Student> findByUserId(Long userId);

    Optional<Student> findByUserEmail(String email);

    boolean existsByRollNumber(String rollNumber);

}
