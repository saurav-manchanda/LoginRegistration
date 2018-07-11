/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.dao.UserDaoImpl;
import com.bridgelabz.model.User;

/**
 * @author Saurav:
 * Class UserServiceImplementation
 */
@Repository
@Component(value="mysql")
public class UserServiceImpl implements UserService{

	@Override
	public User login(String emailId, String password) {
		// TODO Auto-generated method stub
		UserDao repository = new UserDaoImpl();
		User user = repository.getUser(emailId);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		UserDao repository = new UserDaoImpl();
		User checkUser = repository.getUser(user.getEmail());
		if(checkUser != null) {
			return false;
		}
		else {
			repository.regUser(user);
			return true;
		}
	}

}
