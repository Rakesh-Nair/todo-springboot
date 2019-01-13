package com.tru.todos.TodoApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tru.todos.TodoApp.Service.loginService;

@Controller
@SessionAttributes("name")
public class loginController {
	
	@Autowired
	private loginService service;
	
	/*@ResponseBody*/
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(ModelMap model) {
		
		return "Login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(ModelMap model,@RequestParam String name, @RequestParam String password) {
		model.put("name", name);
		
		if(service.isValidUser(name, password)) {
			return "Welcome";
		}
		else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "Login";
		}
		
	}

}
