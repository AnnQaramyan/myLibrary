package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int studentId;

    @Column
    private String fullName;

    @Column
    private String faculty;

    @Column
    private int grade;

  /*  @JsonIgnore
    @JoinColumn(name = "university_id")
    @ManyToOne
    private University university;
*/


}
