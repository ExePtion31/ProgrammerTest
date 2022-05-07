package com.uninpahu.ratings.ratings.service;

import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.repository.StudentRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentRepository StudentRepository;

    @Override
    public boolean existById(int id) {
        return StudentRepository.existsById(id);
    }

    @Override
    public Optional<Student> getOne(int id) {
        return StudentRepository.findById(id);
    }

    @Override
    public List<Student> listAll() {
        return StudentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return StudentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        StudentRepository.deleteById(id);
    }
}
