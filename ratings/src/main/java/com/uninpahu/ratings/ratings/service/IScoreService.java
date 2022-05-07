package com.uninpahu.ratings.ratings.service;

import com.uninpahu.ratings.ratings.request.StudentRequest;
import com.uninpahu.ratings.ratings.entity.Student;

public interface IScoreService {
    
   Double calculateScore(StudentRequest student);
   
   Double calculateScore(Student student);
}
