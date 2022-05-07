package com.uninpahu.ratings.ratings.service;

import com.uninpahu.ratings.ratings.entity.Student;
import java.util.*;

public interface IStudentService {

    boolean existById(int id);

    Optional<Student> getOne(int id);

    List<Student> listAll();

    Student save(Student student);

    void delete(int id);
}
