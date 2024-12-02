package com.ssic.akabarpur.controller;

import com.ssic.akabarpur.entity.ReportCard;
import com.ssic.akabarpur.service.ReportCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/report-cards")
public class ReportCardController {

    private final ReportCardService reportCardService;

    public ReportCardController(ReportCardService reportCardService) {
        this.reportCardService = reportCardService;
    }

    @GetMapping("/student/{studentId}")
    public List<ReportCard> getReportCardsByStudent(@PathVariable Long studentId) {
        return reportCardService.getReportCardsByStudent(studentId);
    }

    @PostMapping
    public ReportCard saveReportCard(@RequestBody ReportCard reportCard) {
        return reportCardService.saveReportCard(reportCard);
    }

}
