package com.ssic.akabarpur.repository;

import com.ssic.akabarpur.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findByStudentIdAndCourseId(Long studentId, Long courseId);

}
