package com.uninpahu.ratings.ratings.service;

import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.request.StudentRequest;

public class ScoreServiceImpl implements IScoreService{

    @Override
    public Double calculateScore(StudentRequest student) {
        double finalScore = student.getScore1() + student.getScore2() + student.getScore3();
        return finalScore;
    }

    @Override
    public Double calculateScore(Student student) {
        double finalScore = student.getScore1() + student.getScore2() + student.getScore3();
        return finalScore;
    }
}
