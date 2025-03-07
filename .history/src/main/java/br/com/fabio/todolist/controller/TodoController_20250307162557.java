package br.com.fabio.todolist.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fabio.todolist.service.TodoService;

public class TodoController {
    
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo>create(Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo>List(){
        return todoService.List();
    }
    List<Todo>update(Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping
    List<Todo>delete(long id){
        return todoService.delete(id);
    }
    
}
