package com.exam_1.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double theoryScore;

    private double practiceScore;

    private String description;

    private String evaluation;

    @ManyToOne
    @JoinColumn(name = "class")
    private Class class_id;

    public Student(String name, double theoryScore, double practiceScore, String description, String evaluation, Class class_id) {
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.description = description;
        this.evaluation = evaluation;
        this.class_id = class_id;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(double theoryScore) {
        this.theoryScore = theoryScore;
    }

    public double getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(double practiceScore) {
        this.practiceScore = practiceScore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public Class getClass_id() {
        return class_id;
    }

    public void setClass_id(Class class_id) {
        this.class_id = class_id;
    }
}
