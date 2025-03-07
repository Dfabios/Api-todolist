package br.com.fabio.todolist.service;

import br.com.fabio.todolist.entity.Todo;
import br.com.fabio.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list(); // Retorna a lista após deletar
    }
}
