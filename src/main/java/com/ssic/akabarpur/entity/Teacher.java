package com.ssic.akabarpur.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;

}
