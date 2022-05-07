package com.uninpahu.ratings.ratings.entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private int code;
    private double score1;
    private double score2;
    private double score3;
    private double finalScore;

    public Student() {
    }

    public Student(String name, String lastname, int code, double score1, double score2, double score3, double finalScore) {
        this.name = name;
        this.lastname = lastname;
        this.code = code;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.finalScore = finalScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", code=" + code + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + ", finalScore=" + finalScore + '}';
    }
}
