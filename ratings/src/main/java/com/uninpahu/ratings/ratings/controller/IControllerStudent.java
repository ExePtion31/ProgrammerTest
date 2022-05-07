package com.uninpahu.ratings.ratings.controller;

import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.uninpahu.ratings.ratings.entity.Student;
import com.uninpahu.ratings.ratings.request.*;

public interface IControllerStudent {

    public ResponseEntity<List<Student>> list();

    ResponseEntity<Message> create(@RequestBody StudentRequest studentRequest);

    ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody StudentRequest studentRequest);
    
    ResponseEntity<Message> delete(@PathVariable("id") int id);
}
