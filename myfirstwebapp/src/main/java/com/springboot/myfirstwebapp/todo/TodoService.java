package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "Udemy","Learn Spring Boot",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(++todosCount, "Udemy","Learn Docker",LocalDate.now().plusMonths(2),false));
		todos.add(new Todo(++todosCount, "Udemy","Learn Azure",LocalDate.now().plusMonths(3),false));
		todos.add(new Todo(++todosCount, "Udemy","Learn AWS",LocalDate.now().plusMonths(4),false));
	}
	
	public List<Todo> findTodoByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo =new Todo(++todosCount,username,description,targetDate,false);
		todos.add(todo);
	}

}
