package com.ssic.akabarpur.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

public class ExamSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    private LocalDate examDate;
    private String examType;

}
