package br.com.fabio.todolist.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fabio.todolist.repository.TodoRepository;

import java.util.List;
import br.com.fabio.todolist.entity.Todo;

@Service
public class TodoService {

    public TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }
    public List<todo> create(){
        todoRepository.save(todo);
        return List();

    }
    public List<Todo> List(){
        Sort.by("prioridade").descending().and(Sort.by("nome").ascending(sort));
        return todoRepository.findAll(sort);

    }
    public List<Todo>update(Todo todo){
        todoRepository.save(todo);
        return List();

    }
    public List<Todo>delete(Long id){
        todoRepository.deleteById(id);
        return List();

    }

    
}
