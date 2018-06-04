package com.raven.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raven.daolayerimpl.LoginDaoImpl;
import com.raven.entities.User;

@Component
public class LoginService {
	@Autowired
	LoginDaoImpl loginDaoImpl;
	User user;
	
	public boolean validateUser(User user)
	{
		//System.out.println("session "+user.getUsername()+" "+user.getPassword());
		//System.out.println("   "+user);
		this.user = loginDaoImpl.getUser(user);
		if((user.getUsername().equals(this.user.getUsername()))&&(user.getPassword().equals(this.user.getPassword())))
			return true;
		else
			return false;
	}

}
