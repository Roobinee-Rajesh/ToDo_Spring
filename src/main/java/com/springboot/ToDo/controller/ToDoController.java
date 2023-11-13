package com.springboot.ToDo.controller;

import com.springboot.ToDo.model.ToDo;
import com.springboot.ToDo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ToDoController {
    @Autowired
    private ToDoRepository toDoRepository;
    @GetMapping("/todo")
    public List<ToDo> getAllToDo() {
        return toDoRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public ToDo getToDo(@PathVariable int id) {
        return toDoRepository.findById(id);
    }


    @PostMapping("/todo/add")
    public List<ToDo> addBook(@RequestBody ToDo toDo) {
        return toDoRepository.insert(toDo);
    }

    @PutMapping("/todo/update")
    public List<ToDo> updareBook(@RequestBody ToDo toDo){
        return toDoRepository.update(toDo);
    }

    @DeleteMapping("/todo/delete/{id}")
    public List<ToDo> deletBook(@PathVariable int id) {
        return toDoRepository.deletById(id);
    }


}
