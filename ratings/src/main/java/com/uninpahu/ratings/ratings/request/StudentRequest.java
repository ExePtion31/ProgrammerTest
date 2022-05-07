package com.uninpahu.ratings.ratings.request;

import javax.validation.constraints.*;

public class StudentRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @Min(0)
    private int code;
    @Min(0)
    private Double score1;
    @Min(0)
    private Double score2;
    @Min(0)
    private Double score3;
    @Min(0)
    private Double finalScore;

    public StudentRequest() {
    }

    public StudentRequest(String name, String lastname, int code, Double score1, Double score2, Double score3, Double finalScore) {
        this.name = name;
        this.lastname = lastname;
        this.code = code;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.finalScore = finalScore;
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

    public Double getScore1() {
        return score1;
    }

    public void setScore1(Double score1) {
        this.score1 = score1;
    }

    public Double getScore2() {
        return score2;
    }

    public void setScore2(Double score2) {
        this.score2 = score2;
    }

    public Double getScore3() {
        return score3;
    }

    public void setScore3(Double score3) {
        this.score3 = score3;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }
}
