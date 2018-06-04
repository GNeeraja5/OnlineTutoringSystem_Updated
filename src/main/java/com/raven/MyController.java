package com.raven;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raven.entities.Course;
import com.raven.entities.User;
import com.raven.services.LoginService;
import com.raven.services.RegistrationService;
import com.sun.javafx.collections.MappingChange.Map;

@Controller

public class MyController {
	@Autowired
	LoginService loginService;
	@Autowired
	RegistrationService regService;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	List<Course> courseList;
	@Autowired
	User user;
	
	
	@RequestMapping("/")
	public ModelAndView displayHome()
	{
		return new ModelAndView("Home.jsp");
	}
	
	@RequestMapping(value = "/login",method =  RequestMethod.POST)
	
	public ModelAndView AunthenticateUser(@RequestParam("username") String uname, @RequestParam("password") String pass)
	{
		ModelAndView mv = new ModelAndView();
//		HttpSession session = request.getSession(true);
//		session.setAttribute("username",uname);
//		session.setAttribute("password", pass);
		User user = new User();
		user.setUsername(uname);
		user.setPassword(pass);
		boolean validation = loginService.validateUser(user);
		if(validation==false)
		{
			mv.setViewName("LoginFailed.jsp");
		
		}
		else 
		{
			HashMap<String, Integer> myMap;
		    
		        myMap = new HashMap<String, Integer>();
		        
		    
			String sql = "SELECT * FROM COURSES";
			courseList = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Course.class));
			//courseList.add(new Course("1","java"));
			//courseList.add(new Course("2","db"));
			
			for(int i = 0;i<courseList.size();i++)
			{
				
				int count = 0 ;
				String sql2 = "SELECT COUNT(TUTORID) FROM COURSEAVAILABILITY WHERE COURSEAVAILABILITY.COURSEID="+courseList.get(i).getCourseId();
			    myMap.put(courseList.get(i).getCourseName(),count);
				
				    
			}
			
			mv.setViewName("StudentHome.jsp");
	        mv.addObject("currentuser", uname);
	        mv.addObject("map",myMap);
	      
		}
		
		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("username", uname);
//		mv.addObject("password", pass);
//		mv.setViewName("LoginPage.jsp");
//		
		
		return mv;
		
	}
	
	private void myMap(String courseName, int count) {
		// TODO Auto-generated method stub
		
	}
	@RequestMapping(value = "/register",method =  RequestMethod.POST)
	public void registerUser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("role") String role,@RequestParam("email") String email,@RequestParam("datetimepicker1") Date date, @RequestParam("gender") String gender)
	
	{
		//Making the user object by taking the form input
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setGender(gender);
		user.setRole(role);
		user.setDob(date);
		
		
		
	}
	
	
	
	
}
