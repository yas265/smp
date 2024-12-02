package com.ssic.akabarpur.service;

import com.ssic.akabarpur.entity.ReportCard;
import com.ssic.akabarpur.repository.ReportCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportCardService {

    private final ReportCardRepository reportCardRepository;

    public ReportCardService(ReportCardRepository reportCardRepository) {
        this.reportCardRepository = reportCardRepository;
    }

    public ReportCard saveReportCard(ReportCard reportCard) {

        if (reportCard.getSubjectGrades() != null) {
            reportCard.getSubjectGrades().forEach(subjectGrade -> subjectGrade.setReportCard(reportCard));
        } else {
            throw new IllegalArgumentException("Subject grades cannot be null");
        }
        return reportCardRepository.save(reportCard);
    }

    public List<ReportCard> getReportCardsByStudent(Long studentId) {
        return reportCardRepository.findByStudentId(studentId);
    }

}
