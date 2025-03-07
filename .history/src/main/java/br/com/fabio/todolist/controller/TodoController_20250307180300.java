package br.com.fabio.todolist.controller;

import br.com.fabio.todolist.entity.Todo;
import br.com.fabio.todolist.service.TodoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    public List<Todo> getAll() {
        return todoService.findAll();  
    }

    @PutMapping
    public Todo update(@RequestBody Todo todo) {
        return todoService.update(todo);  // Retorna o objeto atualizado
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id) {
        todoService.delete(id);  // Pode não precisar retornar nada após exclusão
    }
}
