package com.raven.daolayerimpl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.raven.daolayer.interfaces.LoginDao;
import com.raven.entities.User;

@Repository
@Component
public class LoginDaoImpl implements LoginDao {
	@Autowired
	User result_user;
	@Autowired 
	private JdbcTemplate jdbcTemplate;
//	public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
////    }
	
	public User getUser(User temp) {
		
		String uname = temp.getUsername();
		String pass = temp.getPassword();
		String sql = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
		//@SuppressWarnings("unchecked")
		
		User user = jdbcTemplate.queryForObject(sql,new Object[] {uname,pass}, new BeanPropertyRowMapper<User>(User.class));
		
		
		//ServletContext application = AppContextHolder.getContext();//where AppContextHolder would be the utility class 
		//HttpSession session = application.getAttribute("userTable").get(username);
		//HttpSession session;
		//System.out.println("user from session"+session.getAttribute("username"));
		//System.out.println("user details "+user);
		//if(user.getUsername().equals("neeraja")&&user.getPassword().equals("hello"))
//result_user.setUsername("neeraja");
//		result_user.setPassword("hello");
//	return result_user;	
          	return user;
		
		
		
	}

}
