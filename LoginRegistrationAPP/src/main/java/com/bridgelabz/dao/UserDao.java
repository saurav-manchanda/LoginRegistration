/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.dao;

import com.bridgelabz.model.User;

/**
 * @author Saurav:
 * Interface UserDao having methods to interact with the database
 */
public interface UserDao {

	public User getUser(String email);
	
	public boolean regUser(User user);
}
