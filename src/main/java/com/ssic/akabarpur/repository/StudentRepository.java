package com.ssic.akabarpur.repository;

import com.ssic.akabarpur.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
