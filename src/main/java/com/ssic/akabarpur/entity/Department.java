package com.ssic.akabarpur.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String headOfDepartment;

    @OneToMany(mappedBy = "department")
    private Set<Teacher> teachers;

}
