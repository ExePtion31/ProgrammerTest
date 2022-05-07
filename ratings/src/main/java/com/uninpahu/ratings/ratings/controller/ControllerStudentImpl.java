package com.uninpahu.ratings.ratings.controller;

import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.request.*;
import com.uninpahu.ratings.ratings.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerStudentImpl implements IControllerStudent {

    @Autowired
    StudentServiceImpl service;
    
    ScoreServiceImpl scoreService = new ScoreServiceImpl();

    @GetMapping("/list")
    @Override
    public ResponseEntity<List<Student>> list() {
        List<Student> list = service.listAll();

        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    @Override
    public ResponseEntity<Message> create(@RequestBody StudentRequest studentRequest) {
        if (StringUtils.isBlank(studentRequest.getName())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (StringUtils.isBlank(studentRequest.getLastname())) {
            return new ResponseEntity(new Message("El apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getCode() <= 0) {
            return new ResponseEntity(new Message("El código es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore1() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del primer corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore2() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del segundo corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore3() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del tercer corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        }

        Student student = new Student(studentRequest.getName(), studentRequest.getLastname(), studentRequest.getCode(), studentRequest.getScore1(), studentRequest.getScore2(), studentRequest.getScore3(), scoreService.calculateScore(studentRequest));
        service.save(student);
        return new ResponseEntity(new Message("Usuario creado exitosamente."), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity<?> update(@PathVariable int id, StudentRequest studentRequest) {
        if (!service.existById(id)) {
            return new ResponseEntity(new Message("El usuario no existe."), HttpStatus.NOT_FOUND);
        }

        if (StringUtils.isBlank(studentRequest.getName())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (StringUtils.isBlank(studentRequest.getLastname())) {
            return new ResponseEntity(new Message("El apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getCode() <= 0) {
            return new ResponseEntity(new Message("El código es obligatorio"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore1() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del primer corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore2() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del segundo corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        } else if (studentRequest.getScore3() <= 0 || studentRequest.getScore1() >= 5) {
            return new ResponseEntity(new Message("La nota del tercer corte debe ser mayor a 0 y menor a 5"), HttpStatus.BAD_REQUEST);
        }
        
        Student student = service.getOne(id).get();
        
        student.setName(studentRequest.getName());
        student.setLastname(studentRequest.getLastname());
        student.setCode(studentRequest.getCode());
        student.setScore1(studentRequest.getScore1());
        student.setScore2(studentRequest.getScore2());
        student.setScore3(studentRequest.getScore3());
        student.setFinalScore(scoreService.calculateScore(student));
        
        service.save(student);
        return new ResponseEntity(new Message("Usuario actualizado exitosamente."), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity<Message> delete(@PathVariable int id) {
        if (!service.existById(id)) {
            return new ResponseEntity(new Message("La ID proporcionada no existe."), HttpStatus.NOT_FOUND);
        }
        
        service.delete(id);
        return new ResponseEntity(new Message("Usuario eliminado exitosamente."), HttpStatus.OK);
    }

}
