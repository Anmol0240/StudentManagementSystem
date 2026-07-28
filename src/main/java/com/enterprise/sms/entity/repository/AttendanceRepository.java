package com.enterprise.sms.repository;

import com.enterprise.sms.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findByStudentId(Long studentId);

    List<Attendance> findByCourseId(Long courseId);

    List<Attendance> findByStudentIdAndCourseId(Long studentId, Long courseId);

    Optional<Attendance> findByStudentIdAndCourseIdAndAttendanceDate(
            Long studentId, Long courseId, LocalDate attendanceDate);

    boolean existsByStudentIdAndCourseIdAndAttendanceDate(
            Long studentId, Long courseId, LocalDate attendanceDate);

}
