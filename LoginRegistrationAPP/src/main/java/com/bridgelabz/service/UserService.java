/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.service;

import com.bridgelabz.model.User;

public interface UserService {

	
	public User login(String emailId, String password);
	public boolean register(User user);
	
}
