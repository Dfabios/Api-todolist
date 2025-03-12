package br.com.fabio.todolist.service;

import br.com.fabio.todolist.entity.Todo;
import br.com.fabio.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        if (!todoRepository.existsById(todo.getId())) {
            throw new IllegalArgumentException("Tarefa não encontrada para atualização.");
        }
        return todoRepository.save(todo);
    }

    public void delete(Long id) {
        if (!todoRepository.existsById(id)) {
            throw new IllegalArgumentException("Tarefa não encontrada para exclusão.");
        }
        todoRepository.deleteById(id);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }
}
