package br.com.fabio.todolist.service;

import org.springframework.stereotype.Service;

import br.com.fabio.todolist.repository.TodoRepository;

@Service
public class TodoService {

    public TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }
    public List<todo> create(){

    }
    public List<Todo> List(){

    }
    public List<Todo>update(){

    }
    public List<Todo>delete(){

    }

    
}
