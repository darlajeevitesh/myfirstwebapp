package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "Udemy","Learn Spring Boot",LocalDate.now().plusMonths(1),false));
		todos.add(new Todo(2, "Udemy","Learn Docker",LocalDate.now().plusMonths(2),false));
		todos.add(new Todo(3, "Udemy","Learn Azure",LocalDate.now().plusMonths(3),false));
		todos.add(new Todo(4, "Udemy","Learn AWS",LocalDate.now().plusMonths(4),false));
	}
	
	public List<Todo> findTodoByUsername(String username){
		return todos;
	}

}
