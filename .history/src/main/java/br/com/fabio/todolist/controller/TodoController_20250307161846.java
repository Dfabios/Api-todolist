package br.com.fabio.todolist.controller;

import br.com.fabio.todolist.service.TodoService;

public class TodoController {
    
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    List<Todo>create(Todo todo){
        return todoService.create(todo);
        

    }
    
}
