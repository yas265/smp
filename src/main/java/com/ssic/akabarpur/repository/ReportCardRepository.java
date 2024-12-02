package com.ssic.akabarpur.repository;

import com.ssic.akabarpur.entity.ReportCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportCardRepository extends JpaRepository<ReportCard, Long> {

    List<ReportCard> findByStudentId(Long studentId);

}
