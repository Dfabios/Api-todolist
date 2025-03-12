package br.com.fabio.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void TestCreateTodoSucess() {
		var todo=new Todo("todo 1","desc todo 1",false,1);
	}

	@Test
	void testeCreateTodoFailure(){

	}


}
