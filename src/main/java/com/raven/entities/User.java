package com.raven.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;


@Component
public class User {
private String username;
private String password;
private String role;
private String email;
private String gender;
private Date dob;


public User() {
   
}
public User(String username, String password, String role, String email, String gender, Date dob) {
	super();
	this.username = username;
	this.password = password;
	this.role = role;
	this.email = email;
	this.gender = gender;
	this.dob = dob;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the role
 */
public String getRole() {
	return role;
}
/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the dob
 */
public Date getDob() {
	return dob;
}
/**
 * @param date the dob to set
 */
public void setDob(Date date) {
	this.dob = date;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", role=" + role + ", email=" + email + ", gender="
			+ gender + ", dob=" + dob + "]";
}


}
