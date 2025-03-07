package br.com.fabio.todolist.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fabio.todolist.service.TodoService;

public class TodoController {
    
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo>create(@RequestBody Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo>List(){
        return todoService.List();
    }
    @PutMapping
    List<Todo>update(@RequestBody Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping
    List<Todo>delete(long id){
        return todoService.delete(id);
    }
    
}
