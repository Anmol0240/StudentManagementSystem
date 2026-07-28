package com.enterprise.sms.repository;

import com.enterprise.sms.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findByStudentId(Long studentId);

    List<Mark> findByExamId(Long examId);

    Optional<Mark> findByStudentIdAndExamId(Long studentId, Long examId);

    boolean existsByStudentIdAndExamId(Long studentId, Long examId);

}
