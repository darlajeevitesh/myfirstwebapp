package com.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;

@Controller
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String listTodos(ModelMap model) {
		List<Todo> todos = todoService.findTodoByUsername("Udemy");
		model.put("todos", todos);
		return "listTodos";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		//List<Todo> todos = todoService.findTodoByUsername("Udemy");
		String name = (String)model.get("name");
		Todo todo = new Todo(0, name,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		//@RequestParam(name = "username",required = false) String username,@RequestParam(name = "description" ,required = false)String description,
		//String name = (String)model.get("name");
		//(name = "username",required = false)
		
		if(result.hasErrors()) {
			return "todo";
		}
		
		todoService.addTodo(todo.getUsername(), todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	} 

}
