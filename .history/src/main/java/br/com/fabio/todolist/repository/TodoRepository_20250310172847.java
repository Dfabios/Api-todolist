package br.com.fabio.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fabio.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    
}
