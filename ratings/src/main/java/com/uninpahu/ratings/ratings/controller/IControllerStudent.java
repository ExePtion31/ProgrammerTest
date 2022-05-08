package com.uninpahu.ratings.ratings.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.request.*;

public interface IControllerStudent {

    ResponseEntity<List<Student>> list();

    ResponseEntity<Optional<Student>> fetchUser(int id);

    ResponseEntity<Message> create(@RequestBody StudentRequest studentRequest);

    ResponseEntity<Message> update(@PathVariable("id") int id, @RequestBody StudentRequest studentRequest);
    
    ResponseEntity<Message> delete(@PathVariable("id") int id);
}
