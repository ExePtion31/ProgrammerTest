package com.uninpahu.ratings.ratings.service;

import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.request.StudentRequest;


public class ScoreServiceImpl implements IScoreService{

    @Override
    public Double calculateScore(StudentRequest student) {
        double finalScore = Math.round(((student.getScore1() * 0.3) + (student.getScore2() * 0.3) + (student.getScore3() * 0.4)) * 100) / 100d;
        return finalScore;
    }

    @Override
    public Double calculateScore(Student student) {
        double finalScore = Math.round(((student.getScore1() * 0.3) + (student.getScore2() * 0.3) + (student.getScore3() * 0.4)) * 100) / 100d;
        return finalScore;
    }
}
