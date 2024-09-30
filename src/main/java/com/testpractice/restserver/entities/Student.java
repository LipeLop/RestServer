package com.testpractice.restserver.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent", nullable = false)
    private Integer id;

    @Column(name = "full_name", nullable = false, length = 45)
    private String fullName;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "`group`", length = 10)
    private String group;

    @Column(name = "course")
    private Integer course;

    @Column(name = "status", nullable = false, length = 45)
    private String status;

    @Column(name = "type_of_financing", nullable = false, length = 45)
    private String typeOfFinancing;

}