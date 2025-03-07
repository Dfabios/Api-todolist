package br.com.fabio.todolist.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fabio.todolist.repository.TodoRepository;

@Service
public class TodoService {

    public TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }
    public List<todo> create(){
        todoRepository.save(todo);

    }
    public List<Todo> List(){
        Sort.by("prioridade").descending().and(Sort.by("nome").ascending(sort));
        todoRepository.findAll();

    }
    public List<Todo>update(){
        todoRepository.update();

    }
    public List<Todo>delete(){
        todoRepository.delete();

    }

    
}
