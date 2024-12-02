package com.ssic.akabarpur.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SubjectGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;
    private int maxMarks;
    private int marksObtained;

    @ManyToOne
    @JoinColumn(name = "report_card_id", nullable = false)
    private ReportCard reportCard;


}
