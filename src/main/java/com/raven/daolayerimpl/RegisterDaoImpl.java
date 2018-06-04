package com.raven.daolayerimpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.raven.daolayer.interfaces.RegisterDao;
import com.raven.entities.User;

@Component
public class RegisterDaoImpl implements RegisterDao {

	private JdbcTemplate jdbcTemplate;
	public int registerUserIntoDB(User user) {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO USER(USERNAME,PASSWORD,ROLE,GENDER,EMAIL,DOB) VALUES("+user.getUsername()+","+user.getPassword()+","+user.getRole()+","+user.getGender()+","+user.getEmail()+","+user.getDob()+")";		int result = jdbcTemplate.update(sql);
		return 0;
	}

}
