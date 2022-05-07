package com.uninpahu.ratings.ratings.repository;
import com.uninpahu.ratings.ratings.entity.Student;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    Optional<Student> findByName(String nombre);
    boolean existsByName(String nombre);
}
