package com.tru.todos.TodoApp.Service;

import org.springframework.stereotype.Component;

@Component
public class loginService {
	
	public boolean isValidUser(String user,String password) {
		if(null !=user && null!=password) {
			return user.equalsIgnoreCase("rakesh")&& password.equalsIgnoreCase("pass");
		}
		else {
			return false;
		}
	}

}
