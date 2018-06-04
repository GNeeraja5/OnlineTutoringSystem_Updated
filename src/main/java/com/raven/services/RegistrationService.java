package com.raven.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.raven.daolayerimpl.RegisterDaoImpl;
import com.raven.entities.User;

@Component
public class RegistrationService {
	@Autowired
	User user;
	@Autowired	
	RegisterDaoImpl registerDaoImpl;
	
	public ModelAndView registerUser(User user)
	{
		ModelAndView mv =new ModelAndView();
		
		int insertionValue = registerDaoImpl.registerUserIntoDB(user);
		if(insertionValue == 1)
		{
			mv.setViewName("Home.jsp");
		}
		else {
			mv.setViewName("LoginFailed.jsp");
		}
			return mv;
	}

}
